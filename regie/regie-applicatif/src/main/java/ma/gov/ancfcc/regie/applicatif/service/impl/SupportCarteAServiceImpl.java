package ma.gov.ancfcc.regie.applicatif.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.ancfcc.regie.applicatif.service.SupportCarteAService;
import ma.gov.ancfcc.regie.business.dto.NatureCarteDTO;
import ma.gov.ancfcc.regie.business.dto.SupportCarteDTO;
import ma.gov.ancfcc.regie.business.service.SupportCarteBService;

@Service
public class SupportCarteAServiceImpl implements SupportCarteAService{

	@Autowired
	private SupportCarteBService supportCarteBService;
	
	
	@Override
	public List<SupportCarteDTO> afficheListenature(NatureCarteDTO natureCarteDTO) {
		
		List<SupportCarteDTO>	supportCarteDTO =supportCarteBService.supportList(natureCarteDTO);
		
		return supportCarteDTO;
	}
	
	

}
