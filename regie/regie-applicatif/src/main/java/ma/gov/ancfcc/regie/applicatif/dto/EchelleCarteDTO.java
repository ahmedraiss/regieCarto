package ma.gov.ancfcc.regie.applicatif.dto;

import java.io.Serializable;

public class EchelleCarteDTO implements Serializable{

	private int id;
	private String labelleEchell;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLabelleEchell() {
		return labelleEchell;
	}
	public void setLabelleEchell(String labelleEchell) {
		this.labelleEchell = labelleEchell;
	}
}
