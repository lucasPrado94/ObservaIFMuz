package modelo;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Ocorrencia {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idOcorrencia;
	private Calendar dataCadastro = Calendar.getInstance();
	private CategoriaOcorrencia categoria;
	
	@OneToOne
	private Pessoa pessoaCadastro;
	
	@OneToOne
	private Pessoa pessoaResponsavel;

	public Integer getIdOcorrencia() {
		return idOcorrencia;
	}

	public void setIdOcorrencia(Integer idOcorrencia) {
		this.idOcorrencia = idOcorrencia;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setDataCadastro(Calendar dataCadastro) {
		this.dataCadastro = dataCadastro;
	}

	public Pessoa getPessoaCadastro() {
		return pessoaCadastro;
	}

	public void setPessoaCadastro(Pessoa pessoaCadastro) {
		this.pessoaCadastro = pessoaCadastro;
	}

	public CategoriaOcorrencia getCategoria() {
		return categoria;
	}

	public void setCategoria(CategoriaOcorrencia categoria) {
		this.categoria = categoria;
	}

	public Pessoa getPessoaResponsavel() {
		return pessoaResponsavel;
	}

	public void setPessoaResponsavel(Pessoa pessoaResponsavel) {
		this.pessoaResponsavel = pessoaResponsavel;
	}

}
