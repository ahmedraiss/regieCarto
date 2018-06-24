package ma.gov.ancfcc.regie.applicatif.service;

import java.util.List;

import ma.gov.ancfcc.regie.business.dto.CarteTypeDTO;
import ma.gov.ancfcc.regie.business.dto.CategorieCarteDTO;
import ma.gov.ancfcc.regie.business.dto.NatureCarteDTO;

public interface CarteTypeAService {

	
	List<CarteTypeDTO> afficheListcarte(CategorieCarteDTO categorieCarteDTO ,NatureCarteDTO natureCarteDTO );
	
	CarteTypeDTO affichePrixCarte(CarteTypeDTO carteTypeDTO);
}
