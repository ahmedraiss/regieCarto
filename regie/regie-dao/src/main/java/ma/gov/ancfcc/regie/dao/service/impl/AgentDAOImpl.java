package ma.gov.ancfcc.regie.dao.service.impl;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ma.gov.ancfcc.regie.dao.entity.AgentEntity;
import ma.gov.ancfcc.regie.dao.service.AgentDAO;

@Repository
@Transactional
public class AgentDAOImpl implements AgentDAO {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void add(AgentEntity agentEntity) {
		entityManager.persist(agentEntity);
	}

	@Transactional(readOnly = true)
	@Override
	public AgentEntity findByID(Integer id) {
		return entityManager.find(AgentEntity.class, id);
	}

	@Override
	public AgentEntity findByAccountName(String accountName) {
		String sql = "select a from AgentEntity a where a.accountName = :accountName";

		TypedQuery<AgentEntity> query = entityManager.createQuery(sql, AgentEntity.class);
		query.setParameter("accountName", accountName);

		try {
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}

	}

}
