package ma.gov.ancfcc.regie.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.ancfcc.regie.business.dto.NatureCarteDTO;
import ma.gov.ancfcc.regie.business.dto.SupportCarteDTO;
import ma.gov.ancfcc.regie.business.service.SupportCarteBService;
import ma.gov.ancfcc.regie.dao.entity.SupportCarteEntity;
import ma.gov.ancfcc.regie.dao.service.SupportCarteDAO;

@Service
public class SupportCarteBServiceImpl implements SupportCarteBService {

	@Autowired
	private SupportCarteDAO supportCarteDAO;

	@Autowired
	private Mapper mapper;

	@Override
	public List<SupportCarteDTO> supportList(NatureCarteDTO natureCarteDTO) {

		List<SupportCarteDTO> supportCarteDTO = new ArrayList<>();

		List<SupportCarteEntity> supportCarteEnity = supportCarteDAO.supportList(natureCarteDTO.getNatureLabell());

		for (SupportCarteEntity element : supportCarteEnity) {
			supportCarteDTO.add(mapper.map(element, SupportCarteDTO.class));
		}
		return supportCarteDTO;
	}

}
