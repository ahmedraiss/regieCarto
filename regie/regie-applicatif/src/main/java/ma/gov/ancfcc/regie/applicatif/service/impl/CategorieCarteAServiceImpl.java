package ma.gov.ancfcc.regie.applicatif.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.ancfcc.regie.applicatif.service.CategoriecarteAService;
import ma.gov.ancfcc.regie.business.dto.CategorieCarteDTO;
import ma.gov.ancfcc.regie.business.service.CategorieCarteBService;

@Service
public class CategorieCarteAServiceImpl implements CategoriecarteAService{
	
	@Autowired
	private CategorieCarteBService categorieCarteBService;

	@Override
	public List<CategorieCarteDTO> afficheListeCategorie(List<CategorieCarteDTO> categorieCarteDTO) {
		categorieCarteDTO =categorieCarteBService.categorieListe();

		return categorieCarteDTO;
	}

}
