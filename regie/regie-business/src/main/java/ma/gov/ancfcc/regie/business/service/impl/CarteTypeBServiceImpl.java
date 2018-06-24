package ma.gov.ancfcc.regie.business.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.ancfcc.regie.business.dto.CarteTypeDTO;
import ma.gov.ancfcc.regie.business.dto.CategorieCarteDTO;
import ma.gov.ancfcc.regie.business.dto.NatureCarteDTO;
import ma.gov.ancfcc.regie.business.service.CarteTypeBService;
import ma.gov.ancfcc.regie.dao.entity.CarteTypeEntity;
import ma.gov.ancfcc.regie.dao.service.CarteTypeDAO;

@Service
public class CarteTypeBServiceImpl implements CarteTypeBService {

	@Autowired
	private CarteTypeDAO carteTypeDAO;

	@Autowired
	private Mapper mapper;

	@Override
	public List<CarteTypeDTO> carteList(CategorieCarteDTO categorieCarteDTO, NatureCarteDTO natureCarteDTO) {
		// TODO Auto-generated method stub

		List<CarteTypeDTO> carteTypeDTO = new ArrayList<>();
		
		List<CarteTypeEntity> carteTypeEntitie = carteTypeDAO.carteList(categorieCarteDTO.getLabelleCategorie(),
				natureCarteDTO.getNatureLabell());

		for (CarteTypeEntity element : carteTypeEntitie) {
			carteTypeDTO.add(mapper.map(element, CarteTypeDTO.class));
		}
		return carteTypeDTO;
	}

	@Override
	public CarteTypeDTO cartePrix(CarteTypeDTO carteTypeDTOSelect) {
		CarteTypeDTO carteTypeDTO;
		
		
		CarteTypeEntity carteTypeEntity=carteTypeDAO.cartePrix(carteTypeDTOSelect.getCartelabell());
		
		carteTypeDTO =mapper.map(carteTypeEntity, CarteTypeDTO.class);

		
		return carteTypeDTO;
	}

}
