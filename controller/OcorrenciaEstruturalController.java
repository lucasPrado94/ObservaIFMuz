package controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import dao.Dao;
import modelo.OcorrenciaEstrutural;

@ManagedBean
@ViewScoped
public class OcorrenciaEstruturalController extends OcorrenciaController{
	private OcorrenciaEstrutural ocPred = new OcorrenciaEstrutural();

	public OcorrenciaEstrutural getOcPred() {
		return ocPred;
	}

	public void setOcPred(OcorrenciaEstrutural ocPred) {
		this.ocPred = ocPred;
	}
	
	public void gravar() {
		super.gravar(ocPred);
		ocPred = new OcorrenciaEstrutural();
	}
	
	public List<OcorrenciaEstrutural> getTodasOcorrenciasPrediais(){
		return new Dao<OcorrenciaEstrutural>(OcorrenciaEstrutural.class).buscaTodos();
	}
	
	public void carregar(OcorrenciaEstrutural oP) {
		ocPred = oP;
	}
}
