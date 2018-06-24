package ma.gov.ancfcc.regie.dao.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DEMANDE")
public class DemandeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "ADRESS")
	private String adress;

	@Column(name = "ANNEE")
	private int annee;

	@Column(name = "CIN")
	private String cin;

	@Column(name = "DATE")
	private String date;

	@Column(name = "IS_REMISE")
	private boolean is_remise;
	
	@Column(name = "NOM")
	private String nom;

	/*@OneToOne
	@JoinColumn(name = "ID_FACTURE")
	private FactureEntity id_facture;*/

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

	@Override
	public String toString() {
		return "DemandeEntity [id=" + id + ", adress=" + adress + ", annee=" + annee + ", cin=" + cin + ", date=" + date
				+ ", is_remise=" + is_remise + ", nom=" + nom + "]";
	}

	/*public FactureEntity getId_facture() {
		return id_facture;
	}

	public void setId_facture(FactureEntity id_facture) {
		this.id_facture = id_facture;
	}*/

	
}
