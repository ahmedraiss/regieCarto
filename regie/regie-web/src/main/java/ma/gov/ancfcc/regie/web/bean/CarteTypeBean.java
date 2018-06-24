package ma.gov.ancfcc.regie.web.bean;

import ma.gov.ancfcc.regie.dao.entity.CategorieCarteEntity;
import ma.gov.ancfcc.regie.dao.entity.NatureCarteEntity;

public class CarteTypeBean {

	private int id;

	private String cartelabell;

	private float prixunitaire;

	private CategorieCarteEntity categorieCarteEntity;

	private NatureCarteEntity natureCarteEntity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCartelabell() {
		return cartelabell;
	}

	public void setCartelabell(String cartelabell) {
		this.cartelabell = cartelabell;
	}

	public float getPrixunitaire() {
		return prixunitaire;
	}

	public void setPrixunitaire(float prixunitaire) {
		this.prixunitaire = prixunitaire;
	}

	public CategorieCarteEntity getCategorieCarteEntity() {
		return categorieCarteEntity;
	}

	public void setCategorieCarteEntity(CategorieCarteEntity categorieCarteEntity) {
		this.categorieCarteEntity = categorieCarteEntity;
	}

	public NatureCarteEntity getNatureCarteEntity() {
		return natureCarteEntity;
	}

	public void setNatureCarteEntity(NatureCarteEntity natureCarteEntity) {
		this.natureCarteEntity = natureCarteEntity;
	}
}
