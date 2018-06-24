package ma.gov.ancfcc.regie.web.bean;

import ma.gov.ancfcc.regie.dao.entity.CarteTypeEntity;
import ma.gov.ancfcc.regie.dao.entity.DemandeEntity;

public class CarteBean {

	private int id;

	private String refProduit;

	private String description;

	private int nombre;

	private CarteTypeEntity carteTypeEntity;

	private DemandeEntity demandeEntity;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRefProduit() {
		return refProduit;
	}

	public void setRefProduit(String refProduit) {
		this.refProduit = refProduit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNombre() {
		return nombre;
	}

	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public CarteTypeEntity getCarteTypeEntity() {
		return carteTypeEntity;
	}

	public void setCarteTypeEntity(CarteTypeEntity carteTypeEntity) {
		this.carteTypeEntity = carteTypeEntity;
	}

	public DemandeEntity getDemandeEntity() {
		return demandeEntity;
	}

	public void setDemandeEntity(DemandeEntity demandeEntity) {
		this.demandeEntity = demandeEntity;
	}
}
