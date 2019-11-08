package modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TipoEquipamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idTipoEquip;
	private String nomeTipoEquip;
	public Integer getIdTipoEquip() {
		return idTipoEquip;
	}
	public void setIdTipoEquip(Integer idTipoEquip) {
		this.idTipoEquip = idTipoEquip;
	}
	public String getNomeTipoEquip() {
		return nomeTipoEquip;
	}
	public void setNomeTipoEquip(String nomeTipoEquip) {
		this.nomeTipoEquip = nomeTipoEquip;
	}

}
