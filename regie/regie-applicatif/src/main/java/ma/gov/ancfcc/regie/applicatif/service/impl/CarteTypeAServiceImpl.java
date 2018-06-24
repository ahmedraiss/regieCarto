package ma.gov.ancfcc.regie.applicatif.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.ancfcc.regie.applicatif.service.CarteTypeAService;
import ma.gov.ancfcc.regie.business.dto.CarteTypeDTO;
import ma.gov.ancfcc.regie.business.dto.CategorieCarteDTO;
import ma.gov.ancfcc.regie.business.dto.NatureCarteDTO;
import ma.gov.ancfcc.regie.business.service.CarteTypeBService;

@Service
public class CarteTypeAServiceImpl implements CarteTypeAService{

	
	@Autowired
	private CarteTypeBService carteTypeBService;
	
	@Override
	public List<CarteTypeDTO> afficheListcarte(CategorieCarteDTO categorieCarteDTO, NatureCarteDTO natureCarteDTO) {
		// TODO Auto-generated method stub
		
		List<CarteTypeDTO> carteTypeDTO =carteTypeBService.carteList(categorieCarteDTO, natureCarteDTO);
		
		return carteTypeDTO;
	}

	@Override
	public CarteTypeDTO affichePrixCarte(CarteTypeDTO carteTypeDTO) {
		
		 carteTypeDTO =carteTypeBService.cartePrix(carteTypeDTO);
		
		return carteTypeDTO;
	}

}
