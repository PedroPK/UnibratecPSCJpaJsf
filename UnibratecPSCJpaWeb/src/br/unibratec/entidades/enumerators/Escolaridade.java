package br.unibratec.entidades.enumerators;

public enum Escolaridade {
	
	ANALFABETO ("Analfabeto"),
	PRE_ESCOLAR ("Pr� Escolar"),
	FUNDAMENTAL ("Fundamental"),
	MEDIO ("Ensino M�dio"),
	TECNICO ("Curso T�cnico"),
	SUPERIOR_INCOMPLETO ("Curso Superior Incompleto"),
	SUPERIOR_COMPLETO ("Curso Superior Completo"),
	POS_GRADUACAO ("P�s-Gradua��o"),
	MBA ("MBA"),
	MESTRADO ("Mestrado"),
	DOUTORADO ("Doutorado"),
	POS_DOUTORADO ("P�s-Doutorado");
	
	private String aDescricao;
	
	private Escolaridade(String pDescricao) {
		this.aDescricao = pDescricao;
	}
	
	public String getDescricao() {
		return this.aDescricao;
	}
	
}