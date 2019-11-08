package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Funcao {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idFuncao;
	private String nomeFuncao;
	private String descFuncao;
	public Integer getIdFuncao() {
		return idFuncao;
	}
	public void setIdFuncao(int idFuncao) {
		this.idFuncao = idFuncao;
	}
	public String getNomeFuncao() {
		return nomeFuncao;
	}
	public void setNomeFuncao(String nomeFuncao) {
		this.nomeFuncao = nomeFuncao;
	}
	public String getDescFuncao() {
		return descFuncao;
	}
	public void setDescFuncao(String descFuncao) {
		this.descFuncao = descFuncao;
	}
}
