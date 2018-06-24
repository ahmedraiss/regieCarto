package ma.gov.ancfcc.regie.dao.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ma.gov.ancfcc.regie.dao.entity.CarteTypeEntity;
import ma.gov.ancfcc.regie.dao.service.CarteTypeDAO;

@Repository
@Transactional
public class CarteTypeDAOImpl implements CarteTypeDAO {

	@PersistenceContext
	private EntityManager entityManager;

	// select s from SupportCarteEntity s where s.natureCarteEntity.id = :id
	@Override
	public List<CarteTypeEntity> carteList(String idCategorie, String natureLabelle) {
		String sql = "select c from  CarteTypeEntity c where c.categorieCarteEntity.labelleCategorie = :idCategorie and c.natureCarteEntity.natureLabell= :natureLabelle  ";

		TypedQuery<CarteTypeEntity> query = entityManager.createQuery(sql, CarteTypeEntity.class);
		query.setParameter("idCategorie", idCategorie);
		query.setParameter("natureLabelle", natureLabelle);

		return query.getResultList();
	}

	@Override
	public CarteTypeEntity cartePrix(String nameCarte) {
		String sql = "select p from  CarteTypeEntity p where p.cartelabell = :nameCarte";

		TypedQuery<CarteTypeEntity> query = entityManager.createQuery(sql, CarteTypeEntity.class);
		query.setParameter("nameCarte", nameCarte);

		return query.getSingleResult();
	}

	@Override
	public CarteTypeEntity findByLabell(String labell) {
		String sql = "select l from CarteTypeEntity l where l.cartelabell = :labell";

		TypedQuery<CarteTypeEntity> query = entityManager.createQuery(sql, CarteTypeEntity.class);
		query.setParameter("labell", labell);

		try {
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

}
