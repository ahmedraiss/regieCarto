package ma.gov.ancfcc.regie.web.bean;

import java.util.Date;

public class DemandeBean {

	private int id;
	private String adress;
	private int annee;
	private String cin;
	private String date;
	private boolean is_remise;
	private String nom;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public int getAnnee() {
		return annee;
	}
	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public boolean isIs_remise() {
		return is_remise;
	}
	public void setIs_remise(boolean is_remise) {
		this.is_remise = is_remise;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	
}
