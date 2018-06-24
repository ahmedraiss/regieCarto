package ma.gov.ancfcc.regie.dao.service;

import java.util.List;

import ma.gov.ancfcc.regie.dao.entity.SupportCarteEntity;

public interface SupportCarteDAO {

	/**
	 * Afficher liste deroulant de Support d'une carte
	 * 
	 * @param 
	 * @return TODO
	 */
	List<SupportCarteEntity>  supportList(String lablle);
}
