package ma.gov.ancfcc.regie.business.service;

import ma.gov.ancfcc.regie.business.dto.AgentDTO;

public interface AgentBService {

	/**
	 * Ajouter un nouveau agent.
	 * 
	 * @param agentEntity
	 */
	void add(AgentDTO agentDTO);

	/**
	 * Trouver un agent par son ID.
	 * 
	 * @param id
	 * @return
	 */
	AgentDTO findByID(Integer id);

	/**
	 * Trouver un agent par son compte.
	 * 
	 * @param accountName
	 * @return TODO
	 */
	AgentDTO findByAccountName(String accountName);
}
