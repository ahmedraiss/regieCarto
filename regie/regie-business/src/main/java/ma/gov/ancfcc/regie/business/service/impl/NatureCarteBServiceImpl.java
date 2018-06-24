package ma.gov.ancfcc.regie.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.ancfcc.regie.business.dto.NatureCarteDTO;
import ma.gov.ancfcc.regie.business.service.NatureCarteBService;
import ma.gov.ancfcc.regie.dao.entity.NatureCarteEntity;
import ma.gov.ancfcc.regie.dao.service.NatureCarteDAO;

@Service
public class NatureCarteBServiceImpl implements NatureCarteBService{

	@Autowired
	private NatureCarteDAO natureCarteDAO;
	
	@Autowired
	private Mapper mapper;
	
	@Override
	public List<NatureCarteDTO> natureList() {
		
		List<NatureCarteDTO> natureCarteDTO = new ArrayList<>();
		List<NatureCarteEntity> natureCarteEntitie = natureCarteDAO.natureList();
		
		for(NatureCarteEntity element : natureCarteEntitie) {
			natureCarteDTO.add(mapper.map(element, NatureCarteDTO.class));
		}
		return natureCarteDTO;
	}

}
