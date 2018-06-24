package ma.gov.ancfcc.regie.business.service;

import java.util.List;

import ma.gov.ancfcc.regie.business.dto.CarteTypeDTO;
import ma.gov.ancfcc.regie.business.dto.CategorieCarteDTO;
import ma.gov.ancfcc.regie.business.dto.NatureCarteDTO;

public interface CarteTypeBService {

	/**
	 * Afficher liste deroulant de Carte d'apres une categorie et une nature
	 * 
	 * @param 
	 * @return TODO
	 */
	List<CarteTypeDTO> carteList(CategorieCarteDTO categorieCarteDTO,NatureCarteDTO natureCarteDTO);
	
	CarteTypeDTO cartePrix(CarteTypeDTO carteTypeDTO);
}
