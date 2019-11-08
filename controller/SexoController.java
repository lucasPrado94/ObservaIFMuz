package controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import modelo.Sexo;

@ManagedBean
@ViewScoped
public class SexoController {
	private Sexo sexo = new Sexo();

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
}
