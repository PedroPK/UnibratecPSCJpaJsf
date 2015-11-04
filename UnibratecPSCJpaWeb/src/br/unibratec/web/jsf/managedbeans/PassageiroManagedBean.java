package br.unibratec.web.jsf.managedbeans;

import javax.faces.bean.ManagedBean;

import br.unibratec.linhasaereas.entidades.Passageiro;
import br.unibratec.linhasaereas.fachada.FachadaLinhasAereas;
import br.unibratec.linhasaereas.fachada.IFachadaLinhasAereas;

@ManagedBean
public class PassageiroManagedBean {
	
	private Passageiro aPassageiro;
	
	public Passageiro getPassageiro() {
		if ( this.aPassageiro == null ) {
			this.aPassageiro = new Passageiro();
		}
		return this.aPassageiro;
	}
	
	public void setPassageiro(Passageiro pPassageiro) {
		this.aPassageiro = pPassageiro;
	}
	
	public void inserir() {
		if ( this.aPassageiro != null ) {
			IFachadaLinhasAereas fachada = new FachadaLinhasAereas();
			fachada.inserir(this.aPassageiro);
		}
	}
	
}
