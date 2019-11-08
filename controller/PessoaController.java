package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.Dao;
import modelo.Cidade;
import modelo.Funcao;
import modelo.Pessoa;
import modelo.Sexo;
import modelo.TipoPessoa;
import util.Utils;

@ManagedBean
@ViewScoped
public class PessoaController {
	private Pessoa pessoa = new Pessoa();
	private Integer idCidade;
	private Integer idTipo;
	private Integer idFuncao;
	private Integer idSexo;
	private String senhaBD;

	public Integer getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Integer idCidade) {
		this.idCidade = idCidade;
	}

	public Integer getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}

	public Integer getIdFuncao() {
		return idFuncao;
	}

	public void setIdFuncao(Integer idFuncao) {
		this.idFuncao = idFuncao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public Integer getIdSexo() {
		return idSexo;
	}

	public void setIdSexo(Integer idSexo) {
		this.idSexo = idSexo;
	}
	
	public String getSenhaBD() {
		return senhaBD;
	}

	public void setSenhaBD(String senhaBD) {
		this.senhaBD = senhaBD;
	}
	
	public void gravar() {
		TipoPessoa t = new Dao<TipoPessoa>(TipoPessoa.class).buscaPorId(idTipo);
		pessoa.setTipo(t);
		
		Cidade c = new Dao<Cidade>(Cidade.class).buscaPorId(idCidade);
		pessoa.setCidade(c);
		
		Funcao f = new Dao<Funcao>(Funcao.class).buscaPorId(idFuncao);
		pessoa.setFuncao(f);
		
		Sexo s = new Dao<Sexo>(Sexo.class).buscaPorId(idSexo);
		pessoa.setSexo(s);
		
		String senha = pessoa.getSenha();
		
		if(!senha.equals(senhaBD))
			pessoa.setSenha(Utils.toMD5(senha));
		
		if(pessoa.getIdPessoa()== null)
			new Dao<Pessoa>(Pessoa.class).adiciona(pessoa);
		else
			new Dao<Pessoa>(Pessoa.class).atualiza(pessoa);
		pessoa = new Pessoa();
		idTipo = null;
		idCidade=null;
		idFuncao = null;
		idSexo = null;
		senhaBD = null;
	}
	public List<Pessoa> getTodasPessoas(){
		return new Dao<Pessoa>(Pessoa.class).buscaTodos();
	}
	public void remover(Pessoa p) {
		new Dao<Pessoa>(Pessoa.class).remove(p.getIdPessoa());
		pessoa = new Pessoa();
		idTipo = null;
		idCidade=null;
		idFuncao = null;
		idSexo = null;
	}
	public void carregar(Pessoa p) {
		pessoa = p;
		idTipo = p.getTipo().getIdTipo();
		idCidade = p.getCidade().getIdCidade();
		idFuncao = p.getFuncao().getIdFuncao();
		idSexo = p.getSexo().getIdSexo();
		senhaBD = p.getSenha();
	}
	
	public List<TipoPessoa> getTodosTiposPessoa(){
		return new Dao<TipoPessoa>(TipoPessoa.class).buscaTodos();
	}
	
	public List<Cidade> getTodasCidades(){
		return new Dao<Cidade>(Cidade.class).buscaTodos();
	}
	
	public List<Funcao> getTodasFuncoes(){
		return new Dao<Funcao>(Funcao.class).buscaTodos();
	}
	
	public List<Sexo> getTodosSexos(){
		return new Dao<Sexo>(Sexo.class).buscaTodos();
	}
}
