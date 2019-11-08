package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sexo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idSexo;
	private String sexo;
	public Integer getIdSexo() {
		return idSexo;
	}
	public void setIdSexo(Integer idSexo) {
		this.idSexo = idSexo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
