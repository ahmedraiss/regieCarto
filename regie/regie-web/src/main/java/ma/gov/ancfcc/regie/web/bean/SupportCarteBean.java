package ma.gov.ancfcc.regie.web.bean;

import ma.gov.ancfcc.regie.dao.entity.NatureCarteEntity;

public class SupportCarteBean {

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


