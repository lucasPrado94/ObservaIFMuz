package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoPessoa {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idTipo;
	private String nomeTipo;
	public Integer getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(int idTipo) {
		this.idTipo = idTipo;
	}
	public String getNomeTipo() {
		return nomeTipo;
	}
	public void setNomeTipo(String nomeTipo) {
		this.nomeTipo = nomeTipo;
	}
}
