package ma.gov.ancfcc.regie.dao.service;

import java.util.List;
import java.util.Map;

import ma.gov.ancfcc.regie.dao.entity.CarteEntity;

public interface CarteDAO {

	/**
	 * Ajouter un nouveau agent.
	 * 
	 * @param agentEntity
	 */
	void add(CarteEntity carteEntity);
}
