package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.Dao;
import modelo.Estado;

@ManagedBean
@ViewScoped
public class EstadoController {
	private Estado estado = new Estado();

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	public List<Estado> getTodosEstados(){
		return new Dao<Estado>(Estado.class).buscaTodos();
	}
	public void carregar(Estado e) {
		estado = e;
	}
}
