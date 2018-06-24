package ma.gov.ancfcc.regie.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.ancfcc.regie.business.dto.CarteTypeDTO;
import ma.gov.ancfcc.regie.business.dto.EchelleCarteDTO;
import ma.gov.ancfcc.regie.business.service.EchellCarteBService;
import ma.gov.ancfcc.regie.dao.entity.EchelleCarteEntity;
import ma.gov.ancfcc.regie.dao.service.EchelleCarteDAO;

@Service
public class EchelleCarteBService implements EchellCarteBService {

	@Autowired
	private EchelleCarteDAO echelleCarteDAO;
	
	@Autowired
	private Mapper mapper;
	
	@Override
	public List<EchelleCarteDTO> echelleListe(CarteTypeDTO carteTypeDTO) {
		
		List<EchelleCarteDTO> echelleCarteDTO = new ArrayList<>();
		
		List<EchelleCarteEntity> echelleCarteEntity = echelleCarteDAO.echellListe(carteTypeDTO.getCartelabell());
		
		for(EchelleCarteEntity element : echelleCarteEntity) {
			echelleCarteDTO.add(mapper.map(element, EchelleCarteDTO.class));
		}
		
		return echelleCarteDTO;
	}

}
