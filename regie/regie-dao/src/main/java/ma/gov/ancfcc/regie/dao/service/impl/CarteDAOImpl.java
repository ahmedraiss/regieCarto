package ma.gov.ancfcc.regie.dao.service.impl;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ma.gov.ancfcc.regie.dao.entity.CarteEntity;
import ma.gov.ancfcc.regie.dao.entity.CarteTypeEntity;
import ma.gov.ancfcc.regie.dao.service.CarteDAO;

@Repository
@Transactional
public class CarteDAOImpl implements CarteDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void add(CarteEntity carteEntity) {

		System.out.println(carteEntity.getDemandeEntity());
		entityManager.persist(carteEntity);

	}

}
