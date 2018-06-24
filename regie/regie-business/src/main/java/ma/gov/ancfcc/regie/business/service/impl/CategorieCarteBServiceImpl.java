package ma.gov.ancfcc.regie.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.ancfcc.regie.business.dto.CategorieCarteDTO;
import ma.gov.ancfcc.regie.business.service.CategorieCarteBService;
import ma.gov.ancfcc.regie.dao.entity.CategorieCarteEntity;
import ma.gov.ancfcc.regie.dao.service.CategorieCarteDAO;

@Service
public class CategorieCarteBServiceImpl implements CategorieCarteBService{

	@Autowired
	private CategorieCarteDAO categorieCarteDAO;
	
	@Autowired
	private Mapper mapper;
	
	@Override
	public List<CategorieCarteDTO> categorieListe() {
		
		List<CategorieCarteDTO> categorieCarteDTO = new ArrayList<>();
		
		List<CategorieCarteEntity> categorieCarteEntity = categorieCarteDAO.categorieListe();
		
	
			for (CategorieCarteEntity element : categorieCarteEntity) {
				categorieCarteDTO.add(mapper.map(element, CategorieCarteDTO.class));
			}
		
		return categorieCarteDTO;
	}
	
	
}
