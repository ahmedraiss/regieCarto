package ma.gov.ancfcc.regie.dao.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ma.gov.ancfcc.regie.dao.entity.CarteEntity;
import ma.gov.ancfcc.regie.dao.entity.DemandeEntity;
import ma.gov.ancfcc.regie.dao.service.DemandeDAO;

@Repository
@Transactional
public class DemandeDAOImpl implements DemandeDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void add(DemandeEntity demandeEntity) {

		entityManager.persist(demandeEntity);

	}

	
}
