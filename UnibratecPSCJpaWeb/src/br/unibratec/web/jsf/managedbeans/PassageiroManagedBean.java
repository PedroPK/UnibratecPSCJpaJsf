package br.unibratec.web.jsf.managedbeans;

import java.util.Collection;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.event.PhaseId;
import javax.servlet.http.Part;

import br.unibratec.entidades.enumerators.ClassePassagem;
import br.unibratec.entidades.enumerators.Escolaridade;
import br.unibratec.linhasaereas.entidades.Passageiro;
import br.unibratec.linhasaereas.fachada.FachadaLinhasAereas;
import br.unibratec.linhasaereas.fachada.IFachadaLinhasAereas;

@ManagedBean
public class PassageiroManagedBean {
	
	private Passageiro aPassageiro;
	private Collection<Passageiro> aColecaoPassageiros;
	
	private List<PhaseId> aFases = PhaseId.VALUES;
	
	private Escolaridade aEscolaridade;
	private Collection<Escolaridade> aNiveisEscolares;
	
	private ClassePassagem aClasse;
	private Collection<ClassePassagem> aListaClasses;
	
	private Part aArquivoUpload;
	
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
		
		if ( this.aPassageiro != null && this.aPassageiro.isChavePrimariaValida() ) {
			IFachadaLinhasAereas fachada = new FachadaLinhasAereas();
			fachada.inserir(this.aPassageiro);
			resultado = "inserido";
		}
		
		return resultado;
	}
	
	public String consultarGeral() {
		IFachadaLinhasAereas fachada = new FachadaLinhasAereas();
		this.aColecaoPassageiros = fachada.consultar();
		
		String resultado = "consultar";
		return resultado;
	}
	
	public List<PhaseId> getFases() {
		return aFases;
	}
	public void setFases(List<PhaseId> pFases) {
		this.aFases = pFases;
	}
	
	public Escolaridade getEscolaridade() {
		return aEscolaridade;
	}
	public Escolaridade[] getEscolaridades() {
		return Escolaridade.values();
	}
	public void setEscolaridade(Escolaridade pEscolaridade) {
		this.aEscolaridade = pEscolaridade;
	}
	
	public ClassePassagem getClasse() {
		return aClasse;
	}
	public ClassePassagem[] getClasses() {
		return ClassePassagem.values();
	}
	public void setClasse(ClassePassagem classe) {
		this.aClasse = classe;
	}
	
	public Collection<Escolaridade> getNiveisEscolares() {
		return aNiveisEscolares;
	}
	public void setNiveisEscolares(Collection<Escolaridade> pNiveisEscolares) {
		this.aNiveisEscolares = pNiveisEscolares;
	}
	
	public Collection<ClassePassagem> getListaClasses() {
		return aListaClasses;
	}
	public void setListaClasses(Collection<ClassePassagem> pListaClasses) {
		this.aListaClasses = pListaClasses;
	}
	public Part getArquivoUpload() {
		return aArquivoUpload;
	}
	public void setArquivoUpload(Part pArquivoUpload) {
		this.aArquivoUpload = pArquivoUpload;
	}
	
}