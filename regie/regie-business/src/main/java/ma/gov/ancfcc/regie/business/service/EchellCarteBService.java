package ma.gov.ancfcc.regie.business.service;

import java.util.List;

import ma.gov.ancfcc.regie.business.dto.CarteTypeDTO;
import ma.gov.ancfcc.regie.business.dto.EchelleCarteDTO;

public interface EchellCarteBService {
	

	/**
	 * Afficher lidte deroulant de Echelle d'une carte.
	 * 
	 * @param 
	 * @return TODO
	 */
	List<EchelleCarteDTO> echelleListe(CarteTypeDTO carteTypeDTO);
}
