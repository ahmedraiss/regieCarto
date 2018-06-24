package ma.gov.ancfcc.regie.business.service;

import java.util.List;

import ma.gov.ancfcc.regie.business.dto.NatureCarteDTO;


public interface NatureCarteBService {

	/**
	 * Afficher lidte deroulant de nature d'une carte.
	 * 
	 * @param 
	 * @return TODO
	 */
	List<NatureCarteDTO> natureList();
}
