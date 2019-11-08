package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.Dao;
import modelo.TipoAmbiente;

@ManagedBean
@ViewScoped
public class TipoAmbienteController {
	private TipoAmbiente tipoAmb = new TipoAmbiente();

	public TipoAmbiente getTipoAmb() {
		return tipoAmb;
	}

	public void setTipoAmb(TipoAmbiente tipoAmb) {
		this.tipoAmb = tipoAmb;
	}

	public void gravar() {
		if(tipoAmb.getIdTipoAmb() == null)
			new Dao<TipoAmbiente>(TipoAmbiente.class).adiciona(tipoAmb);
		else
			new Dao<TipoAmbiente>(TipoAmbiente.class).atualiza(tipoAmb);
		tipoAmb = new TipoAmbiente();
	}
	public List<TipoAmbiente> getTodosTiposAmbiente(){
		return new Dao<TipoAmbiente>(TipoAmbiente.class).buscaTodos();
	}
	
	public void remover(TipoAmbiente ta) {
		new Dao<TipoAmbiente>(TipoAmbiente.class).remove(ta.getIdTipoAmb());
		tipoAmb = new TipoAmbiente();
	}
	
	public void carregar(TipoAmbiente ta) {
		tipoAmb = ta;
	}
}
