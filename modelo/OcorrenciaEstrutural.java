package modelo;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id")
public class OcorrenciaEstrutural extends Ocorrencia{
	private Ambiente ambiente;
	private String descricao;
	public Ambiente getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(Ambiente ambiente) {
		this.ambiente = ambiente;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
