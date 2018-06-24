package ma.gov.ancfcc.regie.applicatif.service;

import java.util.List;

import ma.gov.ancfcc.regie.business.dto.NatureCarteDTO;
import ma.gov.ancfcc.regie.business.dto.SupportCarteDTO;

public interface SupportCarteAService {

	List<SupportCarteDTO> afficheListenature(NatureCarteDTO natureCarteDTO);
}
