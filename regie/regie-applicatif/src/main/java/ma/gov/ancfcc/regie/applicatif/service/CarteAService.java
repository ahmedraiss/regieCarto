package ma.gov.ancfcc.regie.applicatif.service;

import java.util.List;
import java.util.Map;

import ma.gov.ancfcc.regie.business.dto.CarteDTO;

public interface CarteAService {

	/**
	 *ajoute un panie
	 */
	void ajoutePanier(Map<Integer,CarteDTO>carteDTO);
}
