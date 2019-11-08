package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.Dao;
import modelo.TipoEquipamento;

@ManagedBean
@ViewScoped
public class TipoEquipamentoController {
	private TipoEquipamento tipoEquip = new TipoEquipamento();

	public TipoEquipamento getTipoEquip() {
		return tipoEquip;
	}

	public void setTipoEquip(TipoEquipamento tipoEquip) {
		this.tipoEquip = tipoEquip;
	}
	public void gravar() {
		if(tipoEquip.getIdTipoEquip()==null)
			new Dao<TipoEquipamento>(TipoEquipamento.class).adiciona(tipoEquip);
		else
			new Dao<TipoEquipamento>(TipoEquipamento.class).atualiza(tipoEquip);
		tipoEquip = new TipoEquipamento();
	}	
	public List<TipoEquipamento> getTodosTiposEquip(){
		return new Dao<TipoEquipamento>(TipoEquipamento.class).buscaTodos();
	}
	public void remover(TipoEquipamento tipo) {
		new Dao<TipoEquipamento>(TipoEquipamento.class).remove(tipo.getIdTipoEquip());
		tipoEquip = new TipoEquipamento();
	}
	public void carregar(TipoEquipamento tipo) {
		tipoEquip = tipo;
	}
}
