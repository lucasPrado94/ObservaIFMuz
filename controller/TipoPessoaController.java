package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.Dao;
import modelo.TipoPessoa;

@ManagedBean
@ViewScoped
public class TipoPessoaController {
	private TipoPessoa tipoPessoa = new TipoPessoa();

	public TipoPessoa getTipoPessoa() {
		return tipoPessoa;
	}

	public void setTipoPessoa(TipoPessoa tipoPessoa) {
		this.tipoPessoa = tipoPessoa;
	}
	
	public void gravar() {
		if(tipoPessoa.getIdTipo() == null)
			new Dao<TipoPessoa>(TipoPessoa.class).adiciona(tipoPessoa);
		else
			new Dao<TipoPessoa>(TipoPessoa.class).atualiza(tipoPessoa);
		tipoPessoa = new TipoPessoa();
	}
	
	public List<TipoPessoa> getTodosTiposPessoa(){
		return new Dao<TipoPessoa>(TipoPessoa.class).buscaTodos();
	}
	
	public void remover(TipoPessoa t) {
		new Dao<TipoPessoa>(TipoPessoa.class).remove(t.getIdTipo());
		tipoPessoa = new TipoPessoa();
	}
	
	public void carregar(TipoPessoa t) {
		tipoPessoa = t;
	}

}
