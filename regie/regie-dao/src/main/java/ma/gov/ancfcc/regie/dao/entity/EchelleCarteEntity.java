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
@Table(name="CARTEECHELLE")
public class EchelleCarteEntity {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "ECHELL_LABELL")
	private String labelleEchell;
	
	@ManyToOne
	@JoinColumn(name = "IDCARTETYPE")
	private CarteTypeEntity carteTypeEntity;
	
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

	public CarteTypeEntity getCarteTypeEntity() {
		return carteTypeEntity;
	}

	public void setCarteTypeEntity(CarteTypeEntity carteTypeEntity) {
		this.carteTypeEntity = carteTypeEntity;
	}

	
}
