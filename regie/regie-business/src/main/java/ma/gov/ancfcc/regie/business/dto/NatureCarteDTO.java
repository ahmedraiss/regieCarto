package ma.gov.ancfcc.regie.business.dto;

import java.io.Serializable;

public class NatureCarteDTO implements Serializable {

	private int id;
	private String natureLabell;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNatureLabell() {
		return natureLabell;
	}
	public void setNatureLabell(String natureLabell) {
		this.natureLabell = natureLabell;
	}

	
}