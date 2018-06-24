package ma.gov.ancfcc.regie.applicatif.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.ancfcc.regie.applicatif.service.DemandeAService;
import ma.gov.ancfcc.regie.business.dto.CarteDTO;
import ma.gov.ancfcc.regie.business.dto.DemandeDTO;
import ma.gov.ancfcc.regie.business.service.DemandeBService;

@Service
public class DemandeAServiceImpl implements DemandeAService{

	@Autowired
	private DemandeBService demandeBService;

	@Override
	public void ajouterDemande(DemandeDTO demandeDTO,Map<Integer, CarteDTO> carteDTO) {

		demandeBService.add(demandeDTO, carteDTO);
	}
}
