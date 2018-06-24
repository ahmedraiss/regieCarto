package ma.gov.ancfcc.regie.applicatif.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.ancfcc.regie.applicatif.service.EchelleCarteAService;
import ma.gov.ancfcc.regie.business.dto.CarteTypeDTO;
import ma.gov.ancfcc.regie.business.dto.EchelleCarteDTO;
import ma.gov.ancfcc.regie.business.service.impl.EchelleCarteBService;

@Service
public class EchelleCarteAServiceImpl implements EchelleCarteAService {

	@Autowired
	private EchelleCarteBService echelleCarteBService;

	@Override
	public List<EchelleCarteDTO> afficheListeEchelle(CarteTypeDTO carteTypeDTO) {
		List<EchelleCarteDTO>	echelleCarteDTO = echelleCarteBService.echelleListe(carteTypeDTO);
		
		return echelleCarteDTO;
	}

}
