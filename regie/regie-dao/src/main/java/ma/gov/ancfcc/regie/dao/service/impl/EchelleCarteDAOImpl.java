package ma.gov.ancfcc.regie.dao.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ma.gov.ancfcc.regie.dao.entity.EchelleCarteEntity;
import ma.gov.ancfcc.regie.dao.service.EchelleCarteDAO;

@Repository
@Transactional
public class EchelleCarteDAOImpl implements EchelleCarteDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public List<EchelleCarteEntity> echellListe(String cartelabell) {
		String sql = "select b from EchelleCarteEntity b  where b.carteTypeEntity.cartelabell = :cartelabell";

		TypedQuery<EchelleCarteEntity> query = entityManager.createQuery(sql, EchelleCarteEntity.class);
		query.setParameter("cartelabell",cartelabell );
		
		try {
			return query.getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
}
