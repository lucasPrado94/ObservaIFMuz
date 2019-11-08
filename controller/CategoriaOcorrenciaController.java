package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.Dao;
import modelo.CategoriaOcorrencia;

@ManagedBean
@ViewScoped
public class CategoriaOcorrenciaController {
	private CategoriaOcorrencia cat = new CategoriaOcorrencia();

	public CategoriaOcorrencia getCat() {
		return cat;
	}

	public void setCat(CategoriaOcorrencia cat) {
		this.cat = cat;
	}
	
	public void gravar() {
		if(cat.getIdCategoria() == null)
			new Dao<CategoriaOcorrencia>(CategoriaOcorrencia.class).adiciona(cat);
		else
			new Dao<CategoriaOcorrencia>(CategoriaOcorrencia.class).atualiza(cat);
		cat = new CategoriaOcorrencia();
	}
	
	public List<CategoriaOcorrencia> getTodasCategorias(){
		return new Dao<CategoriaOcorrencia>(CategoriaOcorrencia.class).buscaTodos();
	}
	
	public void remover(CategoriaOcorrencia ct) {
		new Dao<CategoriaOcorrencia>(CategoriaOcorrencia.class).remove(ct.getIdCategoria());
		cat = new CategoriaOcorrencia();
	}
	
	public void carregar(CategoriaOcorrencia ct) {
		cat = ct;
	}
	
}
