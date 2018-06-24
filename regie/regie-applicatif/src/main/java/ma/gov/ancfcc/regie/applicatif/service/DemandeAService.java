package ma.gov.ancfcc.regie.applicatif.service;

import java.util.Map;

import ma.gov.ancfcc.regie.business.dto.CarteDTO;
import ma.gov.ancfcc.regie.business.dto.DemandeDTO;

public interface DemandeAService {

	/**
	 *ajoute une demande
	 */
	
	void ajouterDemande(DemandeDTO demandeDTO,Map<Integer, CarteDTO> carteDTO);
}
