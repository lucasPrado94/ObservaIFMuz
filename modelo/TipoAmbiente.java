package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoAmbiente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoAmb;
	private String nomeTipoAmb;
	public Integer getIdTipoAmb() {
		return idTipoAmb;
	}
	public void setIdTipoAmb(Integer idTipoAmb) {
		this.idTipoAmb = idTipoAmb;
	}
	public String getNomeTipoAmb() {
		return nomeTipoAmb;
	}
	public void setNomeTipoAmb(String nomeTipoAmb) {
		this.nomeTipoAmb = nomeTipoAmb;
	}
	
}
