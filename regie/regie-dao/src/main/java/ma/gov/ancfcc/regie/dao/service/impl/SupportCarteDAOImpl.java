package ma.gov.ancfcc.regie.dao.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ma.gov.ancfcc.regie.dao.entity.NatureCarteEntity;
import ma.gov.ancfcc.regie.dao.entity.SupportCarteEntity;
import ma.gov.ancfcc.regie.dao.service.SupportCarteDAO;

@Repository
@Transactional
public class SupportCarteDAOImpl implements SupportCarteDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<SupportCarteEntity> supportList(String lablle) {
		String sql = "select s from  SupportCarteEntity s where s.natureCarteEntity.natureLabell = :lablle  ";
		
		TypedQuery<SupportCarteEntity> query = entityManager.createQuery(sql, SupportCarteEntity.class);
		query.setParameter("lablle",lablle );
		
		return query.getResultList();
		
	}

}
