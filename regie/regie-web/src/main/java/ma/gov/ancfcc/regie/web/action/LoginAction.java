package ma.gov.ancfcc.regie.web.action;

import java.util.Map;

import javax.naming.NamingException;

import org.apache.struts2.interceptor.SessionAware;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;

import ma.gov.ancfcc.regie.applicatif.service.AgentAService;
import ma.gov.ancfcc.regie.business.dto.AgentDTO;
import ma.gov.ancfcc.regie.exception.AuthenticationException;
import ma.gov.ancfcc.regie.exception.CommunicationException;
import ma.gov.ancfcc.regie.exception.MsgExceptionEnum;
import ma.gov.ancfcc.regie.exception.NotAutorizedException;
import ma.gov.ancfcc.regie.web.bean.AgentBean;

public class LoginAction extends ActionSupport implements SessionAware {
	private static final long serialVersionUID = 1L;

	private Map<String, Object> session;

	@Autowired
	private AgentAService agentAService;

	@Autowired
	private Mapper mapper;

	private AgentBean agentBean;

	public String login() throws Exception {

		String loginError = null;
		try {
			AgentDTO agentDTO = mapper.map(agentBean, AgentDTO.class);
			agentAService.authenticat(agentDTO);
			session.put("agentBean", agentBean);

			return SUCCESS;

		} /*catch (CommunicationException e) {
			e.printStackTrace();
			loginError = MsgExceptionEnum.MSG_COMMUNICATION_EXCEPTION.getFrMsg();

		} */catch (AuthenticationException e) {
			e.printStackTrace();
			loginError = MsgExceptionEnum.MSG_AUTHENTICATION_EXCEPTION.getFrMsg();

		} /*catch (NotAutorizedException e) {
			e.printStackTrace();
			loginError = MsgExceptionEnum.MSG_NOTAUTORIZED_EXCEPTION.getFrMsg();

		} catch (NamingException e) {
			e.printStackTrace();
			loginError = MsgExceptionEnum.MSG_NAMING_EXCEPTION.getFrMsg();
		}*/

		session.put("loginError", loginError);

		return ERROR;
	}

	public String logout() throws Exception {
		session.clear();
		return SUCCESS;
	}

	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public AgentBean getAgentBean() {
		return agentBean;
	}

	public void setAgentBean(AgentBean agentBean) {
		this.agentBean = agentBean;
	}

}
