package ma.gov.ancfcc.regie.dao.service;

import java.util.List;

import ma.gov.ancfcc.regie.dao.entity.EchelleCarteEntity;

public interface EchelleCarteDAO {

	/**
	 * Afficher lidte deroulant de Echelle d'une carte
	 * 
	 * @param 
	 * @return TODO
	 */
	List<EchelleCarteEntity> echellListe(String cartelabell);
}
