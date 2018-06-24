package ma.gov.ancfcc.regie.dao.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "FACTURE")
public class FactureEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int id;

	@Column(name = "NUMERO_BC_M")
	private int numero_bc_m;

	@Column(name = "MONTONT_REMIS")
	private float montant_remis;

	@Column(name = "TOTALE_HT")
	private float total_ht;

	@Column(name = "TVA")
	private float tva;

	@Column(name = "TOTAL_TTC")
	private float total_ttc;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero_bc_m() {
		return numero_bc_m;
	}

	public void setNumero_bc_m(int numero_bc_m) {
		this.numero_bc_m = numero_bc_m;
	}

	public float getMontant_remis() {
		return montant_remis;
	}

	public void setMontant_remis(float montant_remis) {
		this.montant_remis = montant_remis;
	}

	public float getTotal_ht() {
		return total_ht;
	}

	public void setTotal_ht(float total_ht) {
		this.total_ht = total_ht;
	}

	public float getTva() {
		return tva;
	}

	public void setTva(float tva) {
		this.tva = tva;
	}

	public float getTotal_ttc() {
		return total_ttc;
	}

	public void setTotal_ttc(float total_ttc) {
		this.total_ttc = total_ttc;
	}

}
