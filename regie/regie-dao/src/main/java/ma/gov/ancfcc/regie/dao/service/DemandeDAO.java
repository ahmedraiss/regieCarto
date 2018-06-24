package ma.gov.ancfcc.regie.dao.service;

import ma.gov.ancfcc.regie.dao.entity.DemandeEntity;

public interface DemandeDAO {

	/**
	 * Ajouter une demande.
	 * 
	 * @param agentEntity
	 */
	void add(DemandeEntity demandeEntity);
}
