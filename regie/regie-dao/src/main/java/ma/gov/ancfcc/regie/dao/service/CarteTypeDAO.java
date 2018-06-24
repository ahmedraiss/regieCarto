package ma.gov.ancfcc.regie.dao.service;

import java.util.List;

import ma.gov.ancfcc.regie.dao.entity.CarteTypeEntity;

public interface CarteTypeDAO {
	/**
	 * Afficher liste deroulant de Carte d'apres une categorie et une nature
	 * 
	 * @param 
	 * @return TODO
	 */
	List<CarteTypeEntity>  carteList(String idCategorie, String natureLabelle);
	
	/**
	 * Afficher le prix de la carte selectionne
	 * 
	 * @param 
	 * @return TODO
	 */
	CarteTypeEntity cartePrix(String nameCarte); 
	
	/**
	 * recuperer obejt by labael
	 * 
	 * @param 
	 * @return TODO
	 */
	CarteTypeEntity findByLabell(String labell);
	
}
