package ma.gov.ancfcc.regie.applicatif.dto;

import java.io.Serializable;

import ma.gov.ancfcc.regie.dao.entity.NatureCarteEntity;

public class SupportCarteDTO implements Serializable {

	private int id;

	private String supportlabell;

	private NatureCarteEntity natureCarteEntity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSupportlabell() {
		return supportlabell;
	}

	public void setSupportlabell(String supportlabell) {
		this.supportlabell = supportlabell;
	}

	public NatureCarteEntity getNatureCarteEntity() {
		return natureCarteEntity;
	}

	public void setNatureCarteEntity(NatureCarteEntity natureCarteEntity) {
		this.natureCarteEntity = natureCarteEntity;
	}
}