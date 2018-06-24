package ma.gov.ancfcc.regie.applicatif.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.ancfcc.regie.applicatif.service.CarteAService;
import ma.gov.ancfcc.regie.business.dto.CarteDTO;
import ma.gov.ancfcc.regie.business.service.CarteBService;

@Service
public class CarteAServiceImpl implements CarteAService{

	
	@Autowired
	private CarteBService carteBService;

	@Override
	public void ajoutePanier(Map<Integer, CarteDTO> carteDTO) {
		 carteBService.add(carteDTO);
		
	}
	
	

}
