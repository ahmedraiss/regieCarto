package ma.gov.ancfcc.regie.business.service;

import java.util.Map;

import ma.gov.ancfcc.regie.business.dto.CarteDTO;
import ma.gov.ancfcc.regie.business.dto.DemandeDTO;

public interface DemandeBService {

	void add(DemandeDTO demandeDTO,Map<Integer, CarteDTO> carteDTO);
}
