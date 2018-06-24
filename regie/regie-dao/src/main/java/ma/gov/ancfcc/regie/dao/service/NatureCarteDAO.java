package ma.gov.ancfcc.regie.dao.service;

import java.util.List;

import ma.gov.ancfcc.regie.dao.entity.NatureCarteEntity;


public interface NatureCarteDAO {

	/**
	 * Afficher liste deroulant de nature d'une carte
	 * 
	 * @param 
	 * @return TODO
	 */
	List<NatureCarteEntity>  natureList();
}
