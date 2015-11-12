package br.unibratec.entidades.enumerators;

public enum Escolaridade {
	
	ANALFABETO ("Analfabeto"),
	PRE_ESCOLAR ("Pré Escolar"),
	FUNDAMENTAL ("Fundamental"),
	MEDIO ("Ensino Médio"),
	TECNICO ("Curso Técnico"),
	SUPERIOR_INCOMPLETO ("Curso Superior Incompleto"),
	SUPERIOR_COMPLETO ("Curso Superior Completo"),
	POS_GRADUACAO ("Pós-Graduação"),
	MBA ("MBA"),
	MESTRADO ("Mestrado"),
	DOUTORADO ("Doutorado"),
	POS_DOUTORADO ("Pós-Doutorado");
	
	private String aDescricao;
	
	private Escolaridade(String pDescricao) {
		this.aDescricao = pDescricao;
	}
	
	public String getDescricao() {
		return this.aDescricao;
	}
	
}