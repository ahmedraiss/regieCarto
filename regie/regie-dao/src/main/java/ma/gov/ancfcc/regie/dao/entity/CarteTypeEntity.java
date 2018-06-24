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
@Table(name = "CARTE_TYPE")
public class CarteTypeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "TYPECARTELABELL")
	private String cartelabell;

	@Column(name = "PRIXUNITAIRE")
	private float prixunitaire;

	@ManyToOne
	@JoinColumn(name = "IDCATEGORIE")
	private CategorieCarteEntity categorieCarteEntity;

	@ManyToOne
	@JoinColumn(name = "IDNATURE")
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

	public CategorieCarteEntity getCategorieCarteEntity() {
		return categorieCarteEntity;
	}

	public void setCategorieCarteEntity(CategorieCarteEntity categorieCarteEntity) {
		this.categorieCarteEntity = categorieCarteEntity;
	}

	public float getPrixunitaire() {
		return prixunitaire;
	}

	public void setPrixunitaire(float prixunitaire) {
		this.prixunitaire = prixunitaire;
	}

	public NatureCarteEntity getNatureCarteEntity() {
		return natureCarteEntity;
	}

	public void setNatureCarteEntity(NatureCarteEntity natureCarteEntity) {
		this.natureCarteEntity = natureCarteEntity;
	}

	@Override
	public String toString() {
		return "CarteTypeEntity [id=" + id + ", cartelabell=" + cartelabell + ", prixunitaire=" + prixunitaire
				+ ", categorieCarteEntity=" + categorieCarteEntity + ", natureCarteEntity=" + natureCarteEntity + "]";
	}

}
