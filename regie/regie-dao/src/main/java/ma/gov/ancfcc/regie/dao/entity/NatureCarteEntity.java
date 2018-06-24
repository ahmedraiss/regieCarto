package ma.gov.ancfcc.regie.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CARTENATURE")
public class NatureCarteEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "NATURE_LABELL")
	private String natureLabell;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNatureLabell() {
		return natureLabell;
	}

	public void setNatureLabell(String natureLabell) {
		this.natureLabell = natureLabell;
	}


}