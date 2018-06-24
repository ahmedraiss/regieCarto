package ma.gov.ancfcc.regie.dao.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ma.gov.ancfcc.regie.dao.entity.CategorieCarteEntity;
import ma.gov.ancfcc.regie.dao.service.CategorieCarteDAO;

@Repository
@Transactional
public class CategorieCarteDAOImpl implements CategorieCarteDAO{

	@PersistenceContext
	private EntityManager entityManager;
	


	@Override
	public List<CategorieCarteEntity> categorieListe() {
		String sql = "select c from CategorieCarteEntity c ";
		
		TypedQuery<CategorieCarteEntity> query = entityManager.createQuery(sql, CategorieCarteEntity.class);
		
		
			return query.getResultList();
		
	}



}
