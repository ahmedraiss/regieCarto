package ma.gov.ancfcc.regie.dao;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import ma.gov.ancfcc.regie.dao.entity.AgentEntity;
import ma.gov.ancfcc.regie.dao.service.AgentDAO;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("daoContext.xml");

		AgentDAO agentDAO = context.getBean(AgentDAO.class);

		AgentEntity agentEntity = new AgentEntity();
		agentEntity.setAccountName("a.raiss");
		agentEntity.setFullName("Ahmed Raiss");

		// Ajout
		agentDAO.add(agentEntity);

		// Recherche
		AgentEntity agentFouded = agentDAO.findByID(agentEntity.getId());

		// Impression
		System.out.println(agentEntity);
	}
}
