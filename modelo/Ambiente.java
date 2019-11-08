package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ambiente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idAmbiente;
	private String referencia;
	
	@OneToOne
	private TipoAmbiente tipoAmbiente;
	
	@OneToOne
	private Edificio edificio;

	public Integer getIdAmbiente() {
		return idAmbiente;
	}

	public void setIdAmbiente(Integer idAmbiente) {
		this.idAmbiente = idAmbiente;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public TipoAmbiente getTipoAmbiente() {
		return tipoAmbiente;
	}

	public void setTipoAmbiente(TipoAmbiente tipoAmbiente) {
		this.tipoAmbiente = tipoAmbiente;
	}

	public Edificio getEdificio() {
		return edificio;
	}

	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}
}
