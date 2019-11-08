package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.Dao;
import modelo.Ambiente;
import modelo.Edificio;
import modelo.TipoAmbiente;

@ManagedBean
@ViewScoped
public class AmbienteController {
	private Ambiente amb = new Ambiente();
	private Integer idTipoAmbiente;
	private Integer idEdificio;

	public Ambiente getAmb() {
		return amb;
	}

	public void setAmb(Ambiente amb) {
		this.amb = amb;
	}

	public Integer getIdTipoAmbiente() {
		return idTipoAmbiente;
	}

	public void setIdTipoAmbiente(Integer idTipoAmbiente) {
		this.idTipoAmbiente = idTipoAmbiente;
	}

	public Integer getIdEdificio() {
		return idEdificio;
	}

	public void setIdEdificio(Integer idEdificio) {
		this.idEdificio = idEdificio;
	}
	
	public void gravar() {
		TipoAmbiente t = new Dao<TipoAmbiente>(TipoAmbiente.class).buscaPorId(idTipoAmbiente);
		amb.setTipoAmbiente(t);
		
		Edificio e = new Dao<Edificio>(Edificio.class).buscaPorId(idEdificio);
		amb.setEdificio(e);
		
		if(amb.getIdAmbiente()== null)
			new Dao<Ambiente>(Ambiente.class).adiciona(amb);
		else
			new Dao<Ambiente>(Ambiente.class).atualiza(amb);
		amb = new Ambiente();
		idTipoAmbiente = null;
		idEdificio = null;
	}
	
	public List<Ambiente> getTodosAmbientes(){
		return new Dao<Ambiente>(Ambiente.class).buscaTodos();
	}
	public void remover(Ambiente a) {
		new Dao<Ambiente>(Ambiente.class).remove(a.getIdAmbiente());
		amb = new Ambiente();
		idTipoAmbiente = null;
		idEdificio = null;
	}
	public void carregar(Ambiente a) {
		amb = a;
		idTipoAmbiente = a.getTipoAmbiente().getIdTipoAmb();
		idEdificio = a.getEdificio().getIdEdificio();
	}
	
	public List<TipoAmbiente> getTodosTiposAmbiente(){
		return new Dao<TipoAmbiente>(TipoAmbiente.class).buscaTodos();
	}
	
	public List<Edificio> getTodosEdificios(){
		return new Dao<Edificio>(Edificio.class).buscaTodos();
	}
}
