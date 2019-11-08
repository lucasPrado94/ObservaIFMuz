package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.Dao;
import modelo.Edificio;

@ManagedBean
@ViewScoped
public class EdificioController {
	private Edificio edificio = new Edificio();

	public Edificio getEdificio() {
		return edificio;
	}

	public void setEdificio(Edificio edificio) {
		this.edificio = edificio;
	}
	
	public void gravar() {
		if(edificio.getIdEdificio() == null)
			new Dao<Edificio>(Edificio.class).adiciona(edificio);
		else
			new Dao<Edificio>(Edificio.class).atualiza(edificio);
		edificio = new Edificio();
	}
	
	public List<Edificio> getTodosEdificios(){
		return new Dao<Edificio>(Edificio.class).buscaTodos();
	}
	
	public void remover(Edificio ed) {
		new Dao<Edificio>(Edificio.class).remove(ed.getIdEdificio());
		edificio = new Edificio();
	}
	
	public void carregar(Edificio ed) {
		edificio = ed;
	}
}
