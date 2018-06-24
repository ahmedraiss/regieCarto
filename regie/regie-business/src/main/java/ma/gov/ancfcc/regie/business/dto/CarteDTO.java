package ma.gov.ancfcc.regie.business.dto;

import java.io.Serializable;

import ma.gov.ancfcc.regie.dao.entity.CarteTypeEntity;
import ma.gov.ancfcc.regie.dao.entity.DemandeEntity;

public class CarteDTO implements Serializable {

	private int id;

	private String refProduit;

	private String description;

	private int nombre;

	private CarteTypeDTO carteTypeDTO;
	
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

	public CarteTypeDTO getCarteTypeDTO() {
		return carteTypeDTO;
	}

	public void setCarteTypeDTO(CarteTypeDTO carteTypeDTO) {
		this.carteTypeDTO = carteTypeDTO;
	}

	public DemandeEntity getDemandeEntity() {
		return demandeEntity;
	}

	public void setDemandeEntity(DemandeEntity demandeEntity) {
		this.demandeEntity = demandeEntity;
	}
}
