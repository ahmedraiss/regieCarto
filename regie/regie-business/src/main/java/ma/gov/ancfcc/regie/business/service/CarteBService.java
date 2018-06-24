package ma.gov.ancfcc.regie.business.service;

import java.util.List;
import java.util.Map;

import ma.gov.ancfcc.regie.business.dto.CarteDTO;

public interface CarteBService {
	
	void add(Map<Integer ,CarteDTO> carteDTO);
}
