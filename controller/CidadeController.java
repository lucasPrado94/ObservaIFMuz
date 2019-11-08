package controller;

import java.util.List;

import dao.Dao;
import modelo.Cidade;

public class CidadeController {
	private Cidade cidade = new Cidade();
	private Integer idEstado;

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Integer getIdEstado() {
		return idEstado;
	}

	public void setIdEstado(Integer idEstado) {
		this.idEstado = idEstado;
	}
	
	public List<Cidade> getTodasCidades(){
		return new Dao<Cidade>(Cidade.class).buscaTodos();
	}
	public void carregar(Cidade c) {
		cidade = c;
		idEstado = c.getEstado().getIdEstado();
	}
}
