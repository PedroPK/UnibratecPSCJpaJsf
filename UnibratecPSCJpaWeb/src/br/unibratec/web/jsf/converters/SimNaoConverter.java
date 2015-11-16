package br.unibratec.web.jsf.converters;

import static br.unibratec.util.BibliotecaMetodos.isStringSim;
import static br.unibratec.util.BibliotecaMetodos.isStringValida;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;

@FacesConverter(forClass=Boolean.class)
public class SimNaoConverter implements Converter {

	@Override
	public Object getAsObject(FacesContext pFacesContext, UIComponent pUiComponent, String pString) throws ConverterException {
		Boolean resposta = false;
		if ( isStringValida(pString) && isStringSim(pString) ) {
			resposta = true;
		}
		return resposta;
	}

	@Override
	public String getAsString(FacesContext pFacesContext, UIComponent pUiComponent, Object pObject) throws ConverterException {
		String resposta = "";
		
		if ( pObject != null && pObject instanceof Boolean ) {
			if ( ((Boolean) pObject).booleanValue() ) {
				resposta = "Sim";
			} else {
				resposta = "Não";
			}
		}
		
		return resposta;
	}

}
