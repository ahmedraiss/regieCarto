package ma.gov.ancfcc.regie.business.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.ancfcc.regie.business.dto.CarteDTO;
import ma.gov.ancfcc.regie.business.service.CarteBService;
import ma.gov.ancfcc.regie.dao.entity.CarteEntity;
import ma.gov.ancfcc.regie.dao.entity.CarteTypeEntity;
import ma.gov.ancfcc.regie.dao.entity.DemandeEntity;
import ma.gov.ancfcc.regie.dao.service.CarteDAO;
import ma.gov.ancfcc.regie.dao.service.CarteTypeDAO;

@Service
public class CarteBServiceImpl implements CarteBService {

	@Autowired
	private CarteDAO carteDAO;
	
	@Autowired
	private CarteTypeDAO carteTypeDAO;
	
	@Autowired
	private Mapper mapper;

	@Override
	public void add(Map<Integer, CarteDTO> carteDTO) {
		
		Map<Integer,CarteEntity> carteEntities = new HashMap<>();

		for (Entry<Integer, CarteDTO> element : carteDTO.entrySet()) {
			
		      carteEntities.put(element.getKey(), mapper.map(element.getValue(), CarteEntity.class));
		      
		}
		
		for (Entry<Integer, CarteEntity> element : carteEntities.entrySet()) {
			
			//carteTypeEntity = getElementByLabel(element.getValue().getCarteTypeEntity().getCartelabell());
			
			
			CarteTypeEntity carteTypeEntity = carteTypeDAO.findByLabell(element.getValue().getCarteTypeEntity().getCartelabell());
			
			  element.getValue().setCarteTypeEntity(carteTypeEntity);
			//element.getValue().setDemandeEntity(demandeEntity);
			
			//System.out.println(element.getValue().getCarteTypeEntity().getCartelabell());
			  
		      carteDAO.add(element.getValue());
		      
		}

	}

}
