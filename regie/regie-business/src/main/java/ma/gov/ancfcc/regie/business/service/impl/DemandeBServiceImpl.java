package ma.gov.ancfcc.regie.business.service.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.ancfcc.regie.business.dto.CarteDTO;
import ma.gov.ancfcc.regie.business.dto.DemandeDTO;
import ma.gov.ancfcc.regie.business.service.DemandeBService;
import ma.gov.ancfcc.regie.dao.entity.CarteEntity;
import ma.gov.ancfcc.regie.dao.entity.CarteTypeEntity;
import ma.gov.ancfcc.regie.dao.entity.DemandeEntity;
import ma.gov.ancfcc.regie.dao.service.CarteDAO;
import ma.gov.ancfcc.regie.dao.service.CarteTypeDAO;
import ma.gov.ancfcc.regie.dao.service.DemandeDAO;

@Service
public class DemandeBServiceImpl implements DemandeBService {

	@Autowired
	private DemandeDAO demandeCarteDAO;

	@Autowired
	private CarteDAO carteDAO;
	
	@Autowired
	private CarteTypeDAO carteTypeDAO;
	
	@Autowired
	private Mapper mapper;

	public void add(DemandeDTO demandeDTO,Map<Integer, CarteDTO> carteDTO) {

		DemandeEntity demandeEntity = mapper.map(demandeDTO, DemandeEntity.class);

		demandeCarteDAO.add(demandeEntity);
		
		Map<Integer,CarteEntity> carteEntities = new HashMap<>();

		for (Entry<Integer, CarteDTO> element : carteDTO.entrySet()) {
			
		      carteEntities.put(element.getKey(), mapper.map(element.getValue(), CarteEntity.class));
		      
		}
		
		for (Entry<Integer, CarteEntity> element : carteEntities.entrySet()) {
			
			element.getValue().setDemandeEntity(demandeEntity);
			
			CarteTypeEntity carteTypeEntity = carteTypeDAO.findByLabell(element.getValue().getCarteTypeEntity().getCartelabell());
			
			  element.getValue().setCarteTypeEntity(carteTypeEntity);
			//element.getValue().setDemandeEntity(demandeEntity);
			
			//System.out.println(element.getValue().getCarteTypeEntity().getCartelabell());
			  
		      carteDAO.add(element.getValue());
			System.out.println(element.getValue().getDemandeEntity().getId());
			  
		}
	}

}
