package ma.gov.ancfcc.regie.business.service.impl;

import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ma.gov.ancfcc.regie.business.dto.AgentDTO;
import ma.gov.ancfcc.regie.business.service.AgentBService;
import ma.gov.ancfcc.regie.dao.entity.AgentEntity;
import ma.gov.ancfcc.regie.dao.service.AgentDAO;

@Service
public class AgentBServiceImpl implements AgentBService {

	@Autowired
	private AgentDAO agentDAO;

	@Autowired
	private Mapper mapper;

	@Override
	public void add(AgentDTO agentDTO) {
		// agentDAO.add(agentDTO);
	}

	@Override
	public AgentDTO findByID(Integer id) {
		// return agentDAO.findByID(id);
		return null;
	}

	@Override
	public AgentDTO findByAccountName(String accountName) {
		AgentDTO agentDTO = null;

		AgentEntity agentEntity = agentDAO.findByAccountName(accountName);
		if (agentEntity != null) {
			agentDTO = mapper.map(agentEntity, AgentDTO.class);
		}
		return agentDTO;
	}

}
