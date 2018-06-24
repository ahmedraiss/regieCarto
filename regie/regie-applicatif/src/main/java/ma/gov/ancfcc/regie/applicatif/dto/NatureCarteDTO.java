package ma.gov.ancfcc.regie.applicatif.dto;

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

	public String getNature_labell() {
		return natureLabell;
	}

	public void setNature_labell(String nature_labell) {
		this.natureLabell = nature_labell;
	}
}
