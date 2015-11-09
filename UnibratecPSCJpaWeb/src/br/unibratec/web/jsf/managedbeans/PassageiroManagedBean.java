package br.unibratec.web.jsf.managedbeans;

import java.util.Collection;

import javax.faces.bean.ManagedBean;

import br.unibratec.linhasaereas.entidades.Passageiro;
import br.unibratec.linhasaereas.fachada.FachadaLinhasAereas;
import br.unibratec.linhasaereas.fachada.IFachadaLinhasAereas;
import br.unibratec.util.BibliotecaMetodos;

@ManagedBean
public class PassageiroManagedBean {
	
	private Passageiro aPassageiro;
	private Collection<Passageiro> aColecaoPassageiros;
	
	public Passageiro getPassageiro() {
		if ( this.aPassageiro == null ) {
			this.aPassageiro = new Passageiro();
		}
		return this.aPassageiro;
	}
	public void setPassageiro(Passageiro pPassageiro) {
		this.aPassageiro = pPassageiro;
	}
	
	public Collection<Passageiro> getColecaoPassageiros() {
		if ( this.aColecaoPassageiros == null ) {
			this.consultarGeral();
		}
		return aColecaoPassageiros;
	}
	public void setColecaoPassageiros(Collection<Passageiro> pColecaoPassageiros) {
		this.aColecaoPassageiros = pColecaoPassageiros;
	}
	
	public String inserir() {
		String resultado = "";
		
		if ( this.aPassageiro != null && this.aPassageiro.getChavePrimaria() != null ) {
			IFachadaLinhasAereas fachada = new FachadaLinhasAereas();
			fachada.inserir(this.aPassageiro);
			resultado = "inserido";
		}
		
		return resultado;
	}
	
	public String consultarGeral() {
		String resultado = "";
		
		IFachadaLinhasAereas fachada = new FachadaLinhasAereas();
		this.aColecaoPassageiros = fachada.consultar();
		
		resultado = "consultar";
		return resultado;
	}
	
}