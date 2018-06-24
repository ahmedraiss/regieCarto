package ma.gov.ancfcc.regie.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "CARTE")
public class CarteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "REF_PRODUIT")
	private String refProduit;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "NOMBRE")
	private int nombre;

	@ManyToOne
	@JoinColumn(name = "ID_TYPECART")
	private CarteTypeEntity carteTypeEntity;

	@ManyToOne
	@JoinColumn(name = "ID_DEMANDE")
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
