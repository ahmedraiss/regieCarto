package ma.gov.ancfcc.regie.applicatif.service;

import javax.naming.NamingException;

import ma.gov.ancfcc.regie.business.dto.AgentDTO;
import ma.gov.ancfcc.regie.exception.AuthenticationException;
import ma.gov.ancfcc.regie.exception.CommunicationException;
import ma.gov.ancfcc.regie.exception.NotAutorizedException;

public interface AgentAService {

	/**
	 * recherche un agent.
	 * 
	 * @param agentDTO
	 * @return TODO
	 * @throws NamingException
	 * @throws NotAutorizedException
	 * @throws AuthenticationException
	 * @throws CommunicationException
	 */
	AgentDTO authenticat(AgentDTO agentDTO) throws CommunicationException, AuthenticationException, NotAutorizedException, NamingException;

}
