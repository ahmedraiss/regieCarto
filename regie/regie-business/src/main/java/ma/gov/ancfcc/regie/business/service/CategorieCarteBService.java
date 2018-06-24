package ma.gov.ancfcc.regie.business.service;

import java.util.List;

import ma.gov.ancfcc.regie.business.dto.CategorieCarteDTO;



public interface CategorieCarteBService {
	
	/**
	 * Afficher lidte deroulant de Categorie d'une carte.
	 * 
	 * @param 
	 * @return TODO
	 */
	List<CategorieCarteDTO> categorieListe();
}
