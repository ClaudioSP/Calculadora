package br.faccamp.domain;

public abstract class Operacao {
	
	protected LogSystem log;
	
	private String primeiroOperador;

	public abstract String calcula(String conteudo);

	public Operacao(String primeiroOperador) {
		this.primeiroOperador = primeiroOperador;
	}

	public String getPrimeiroOperador() {
		return primeiroOperador;
	}

}
