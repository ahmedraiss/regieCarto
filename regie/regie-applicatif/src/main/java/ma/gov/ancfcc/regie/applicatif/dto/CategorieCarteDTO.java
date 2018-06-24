package ma.gov.ancfcc.regie.applicatif.dto;

import java.io.Serializable;

public class CategorieCarteDTO implements Serializable {
	private int id;
	private String labelleCategorie;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabelleCategorie() {
		return labelleCategorie;
	}
	public void setLabelleCategorie(String labelleCategorie) {
		this.labelleCategorie = labelleCategorie;
	}
}
