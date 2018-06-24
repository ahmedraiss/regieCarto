package ma.gov.ancfcc.regie.dao.service;

import java.util.List;
import ma.gov.ancfcc.regie.dao.entity.CategorieCarteEntity;


public interface CategorieCarteDAO {

	/**
	 * Afficher lidte deroulant de Categorie d'une carte.
	 * 
	 * @param 
	 * @return TODO
	 */
	
	List<CategorieCarteEntity> categorieListe();
}
