package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Edificio {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEdificio;
	private String nomeEdificio;
	private String descEdificio;
	public Integer getIdEdificio() {
		return idEdificio;
	}
	public void setIdEdificio(Integer idEdificio) {
		this.idEdificio = idEdificio;
	}
	public String getNomeEdificio() {
		return nomeEdificio;
	}
	public void setNomeEdificio(String nomeEdificio) {
		this.nomeEdificio = nomeEdificio;
	}
	public String getDescEdificio() {
		return descEdificio;
	}
	public void setDescEdificio(String descEdificio) {
		this.descEdificio = descEdificio;
	}
}
