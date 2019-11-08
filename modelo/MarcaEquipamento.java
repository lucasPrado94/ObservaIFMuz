package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MarcaEquipamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMarca;
	private String nomeMarca;
	public Integer getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}
	public String getNomeMarca() {
		return nomeMarca;
	}
	public void setNomeMarca(String nomeMarca) {
		this.nomeMarca = nomeMarca;
	}

}
