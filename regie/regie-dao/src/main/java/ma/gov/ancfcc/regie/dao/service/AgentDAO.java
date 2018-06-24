package ma.gov.ancfcc.regie.dao.service;

import ma.gov.ancfcc.regie.dao.entity.AgentEntity;

public interface AgentDAO {

	/**
	 * Ajouter un nouveau agent.
	 * 
	 * @param agentEntity
	 */
	void add(AgentEntity agentEntity);

	/**
	 * Trouver un agent par son ID.
	 * 
	 * @param id
	 * @return
	 */
	AgentEntity findByID(Integer id);

	/**
	 * Trouver un agent par son compte.
	 * 
	 * @param accountName
	 * @return TODO
	 */
	AgentEntity findByAccountName(String accountName);
}
