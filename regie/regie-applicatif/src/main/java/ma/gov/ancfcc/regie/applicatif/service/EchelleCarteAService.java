package ma.gov.ancfcc.regie.applicatif.service;

import java.util.List;

import ma.gov.ancfcc.regie.business.dto.CarteTypeDTO;
import ma.gov.ancfcc.regie.business.dto.EchelleCarteDTO;

public interface EchelleCarteAService {

	List<EchelleCarteDTO> afficheListeEchelle(CarteTypeDTO carteTypeDTO);
}
