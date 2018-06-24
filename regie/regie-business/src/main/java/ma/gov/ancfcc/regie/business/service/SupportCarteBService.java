package ma.gov.ancfcc.regie.business.service;

import java.util.List;

import ma.gov.ancfcc.regie.business.dto.NatureCarteDTO;
import ma.gov.ancfcc.regie.business.dto.SupportCarteDTO;


public interface SupportCarteBService {

	/**
	 * Afficher liste deroulant de support d'une carte.
	 * 
	 * @param 
	 * @return TODO
	 */
	List<SupportCarteDTO> supportList(NatureCarteDTO natureCarteDTO);
}
