package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.Dao;
import modelo.MarcaEquipamento;

@ManagedBean
@ViewScoped
public class MarcaEquipamentoController {
	private MarcaEquipamento marca = new MarcaEquipamento();

	public MarcaEquipamento getMarca() {
		return marca;
	}

	public void setMarca(MarcaEquipamento marca) {
		this.marca = marca;
	}

	public void gravar() {
		if(marca.getIdMarca() == null)
			new Dao<MarcaEquipamento>(MarcaEquipamento.class).adiciona(marca);
		else
			new Dao<MarcaEquipamento>(MarcaEquipamento.class).atualiza(marca);
		marca = new MarcaEquipamento();
	}
	public List<MarcaEquipamento> getTodasMarcas(){
		return new Dao<MarcaEquipamento>(MarcaEquipamento.class).buscaTodos();
	}
	
	public void remover(MarcaEquipamento ma) {
		new Dao<MarcaEquipamento>(MarcaEquipamento.class).remove(ma.getIdMarca());
		marca = new MarcaEquipamento();
	}
	
	public void carregar(MarcaEquipamento ma) {
		marca = ma;
	}
}
