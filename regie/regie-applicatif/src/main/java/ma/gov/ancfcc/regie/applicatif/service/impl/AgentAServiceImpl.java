package ma.gov.ancfcc.regie.applicatif.service.impl;

import javax.naming.AuthenticationException;
import javax.naming.CommunicationException;
import javax.naming.NamingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.ancfcc.regie.applicatif.service.ActiveDirectoryService;
import ma.gov.ancfcc.regie.applicatif.service.AgentAService;
import ma.gov.ancfcc.regie.business.dto.AgentDTO;
import ma.gov.ancfcc.regie.business.service.AgentBService;
import ma.gov.ancfcc.regie.exception.NotAutorizedException;

@Service
public class AgentAServiceImpl implements AgentAService {

	@Autowired
	private AgentBService agentBService;

	@Autowired
	private ActiveDirectoryService activeDirectoryService;

	@Override
	public AgentDTO authenticat(AgentDTO agentDTO)
			throws ma.gov.ancfcc.regie.exception.CommunicationException, ma.gov.ancfcc.regie.exception.AuthenticationException, NotAutorizedException, NamingException {
		// Autentifier l'agent auprès de L'AD
	/*	try {
			activeDirectoryService.authenticate(agentDTO.getAccountName(), agentDTO.getPassword());

		} catch (CommunicationException e) {
			e.printStackTrace();
			throw new ma.gov.ancfcc.regie.exception.CommunicationException();
		} catch (AuthenticationException e) {
			e.printStackTrace();
			throw new ma.gov.ancfcc.regie.exception.AuthenticationException();
		}*/

		// Vérifier si l'agent est autorisé à utiliser l'application
		agentDTO = agentBService.findByAccountName(agentDTO.getAccountName());
		if (agentDTO == null) {
			throw new NotAutorizedException();
		}

		return agentDTO;

	}

}
