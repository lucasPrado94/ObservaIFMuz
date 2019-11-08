package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.Dao;
import modelo.Ocorrencia;
import modelo.Pessoa;

@ManagedBean
@ViewScoped
public class OcorrenciaController {
	public void gravar(Ocorrencia o) {
		if(o.getIdOcorrencia()==null)
			new Dao<Ocorrencia>(Ocorrencia.class).adiciona(o);
		else
			new Dao<Ocorrencia>(Ocorrencia.class).atualiza(o);
	}
	
	public void remover(Ocorrencia o) {
		new Dao<Ocorrencia>(Ocorrencia.class).remove(o.getIdOcorrencia());
	}
	
	public List<Pessoa> getTodasPessoas(){
		return new Dao<Pessoa>(Pessoa.class).buscaTodos();
		
	}
}
