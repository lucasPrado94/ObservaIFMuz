package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.Dao;
import modelo.Funcao;

@ManagedBean
@ViewScoped
public class FuncaoController {
	private Funcao funcao = new Funcao();
	
	public Funcao getFuncao() {
		return funcao;
	}

	public void setFuncao(Funcao funcao) {
		this.funcao = funcao;
	}
	
	public void gravar() {
		if(funcao.getIdFuncao() == null)
			new Dao<Funcao>(Funcao.class).adiciona(funcao);
		else
			new Dao<Funcao>(Funcao.class).atualiza(funcao);
		funcao = new Funcao();
	}
	
	public List<Funcao> getTodasFuncoes(){
		return new Dao<Funcao>(Funcao.class).buscaTodos();
	}
	
	public void remover(Funcao func) {
		new Dao<Funcao>(Funcao.class).remove(func.getIdFuncao());
		funcao = new Funcao();
	}
	
	public void carregar(Funcao f) {
		funcao = f;
	}
}
