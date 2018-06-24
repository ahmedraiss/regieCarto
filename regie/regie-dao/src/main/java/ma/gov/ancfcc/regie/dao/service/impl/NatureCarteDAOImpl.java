package ma.gov.ancfcc.regie.dao.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ma.gov.ancfcc.regie.dao.entity.NatureCarteEntity;
import ma.gov.ancfcc.regie.dao.service.NatureCarteDAO;

@Repository
@Transactional
public class NatureCarteDAOImpl implements NatureCarteDAO {

	@PersistenceContext
	private EntityManager entityManager;

	
	@Override
	public List<NatureCarteEntity> natureList() {
		String sql = "select c from  NatureCarteEntity c  ";
		
		TypedQuery<NatureCarteEntity> query = entityManager.createQuery(sql, NatureCarteEntity.class);

		try {
			return query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}



}
