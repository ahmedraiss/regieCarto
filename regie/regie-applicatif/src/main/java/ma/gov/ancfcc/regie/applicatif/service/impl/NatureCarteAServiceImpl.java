package ma.gov.ancfcc.regie.applicatif.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.ancfcc.regie.applicatif.service.NatureCarteAService;
import ma.gov.ancfcc.regie.business.dto.NatureCarteDTO;
import ma.gov.ancfcc.regie.business.service.NatureCarteBService;

@Service
public class NatureCarteAServiceImpl implements NatureCarteAService {

	@Autowired
	private NatureCarteBService natureCarteBService;

	@Override
	public List<NatureCarteDTO> afficheListenature(List<NatureCarteDTO> natureCarteDTO) {
		natureCarteDTO = natureCarteBService.natureList();

		return natureCarteDTO;
	}

}
