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
@Table(name = "CARTESUPPORT")
public class SupportCarteEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "SUPPORTLABELL")
	private String supportlabell;

	@ManyToOne
	@JoinColumn(name = "IDNATURE")
	private NatureCarteEntity natureCarteEntity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSupportlabell() {
		return supportlabell;
	}

	public void setSupportlabell(String supportlabell) {
		this.supportlabell = supportlabell;
	}

	public NatureCarteEntity getNatureCarteEntity() {
		return natureCarteEntity;
	}

	public void setNatureCarteEntity(NatureCarteEntity natureCarteEntity) {
		this.natureCarteEntity = natureCarteEntity;
	}

}
