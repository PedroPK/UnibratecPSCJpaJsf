package br.unibratec.web.jsf.validators;

import static br.unibratec.util.BibliotecaMetodos.isCPFvalido;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("cpfValidator")
public class CPFValidator implements Validator {
	
	@Override
	public void validate(FacesContext pFacesContext, UIComponent pUiComponent, Object pObject) throws ValidatorException {
		String cpf = (String) pObject;
		
		if ( !isCPFvalido(cpf) ) {
			FacesMessage mensagem = new FacesMessage("A Chave-Primária da instância do tipo Passageiro é Nula.");
			mensagem.setSeverity(FacesMessage.SEVERITY_ERROR);
			
			throw new ValidatorException(mensagem);
		}
	}
	
}