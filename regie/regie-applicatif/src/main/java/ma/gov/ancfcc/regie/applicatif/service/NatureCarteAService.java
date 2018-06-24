package ma.gov.ancfcc.regie.applicatif.service;

import java.util.List;

import ma.gov.ancfcc.regie.business.dto.NatureCarteDTO;

public interface NatureCarteAService {

	List<NatureCarteDTO> afficheListenature(List<NatureCarteDTO> natureCarteDTO);
}
