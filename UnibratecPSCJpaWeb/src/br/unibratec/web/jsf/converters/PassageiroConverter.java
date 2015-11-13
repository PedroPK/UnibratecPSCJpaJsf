package br.unibratec.web.jsf.converters;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

import br.unibratec.linhasaereas.entidades.Passageiro;
import br.unibratec.linhasaereas.fachada.FachadaLinhasAereas;
import br.unibratec.linhasaereas.fachada.IFachadaLinhasAereas;
import br.unibratec.util.BibliotecaMetodos;

@FacesConverter(forClass=Passageiro.class)
public class PassageiroConverter implements Converter {

	public Object getAsObject(FacesContext pFacesContext, UIComponent pUIComponent, String pString) throws ConverterException {
		Passageiro passageiro = null;
		if ( BibliotecaMetodos.isStringValida(pString) ) {
			IFachadaLinhasAereas fachada = new FachadaLinhasAereas();
			passageiro = fachada.consultarPassageiro(pString);
			
		}
		return passageiro;
	}

	public String getAsString(FacesContext pFacesContext, UIComponent pUIComponent, Object pObjeto) throws ConverterException {
		String resposta = "";
		if ( pObjeto != null ) {
			Passageiro passageiro = (Passageiro) pObjeto;
			resposta = passageiro.getCPF() + " : " + passageiro.getNome();
		}
		return resposta;
	}

}