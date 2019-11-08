package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Estado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEstado;
	private String nomeEstado;
	private String siglaEstado;
	public Integer getIdEstado() {
		return idEstado;
	}
	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}
	public String getNomeEstado() {
		return nomeEstado;
	}
	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}
	public String getSiglaEstado() {
		return siglaEstado;
	}
	public void setSiglaEstado(String siglaEstado) {
		this.siglaEstado = siglaEstado;
	}

}
