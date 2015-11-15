package br.unibratec.entidades.enumerators;

public enum ClassePassagem {
	
	ECONOMICA ("Classe Econômica"),
	EXECUTIVA ("Classe Executiva"),
	PRIMEIRA_CLASSE ("1ª Classe");
	
	private String aDescricao;
	
	private ClassePassagem(String pDescricao) {
		this.aDescricao = pDescricao;
	}
	
	public String getDescricao() {
		return this.aDescricao;
	}
	
}