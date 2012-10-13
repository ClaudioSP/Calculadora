package br.faccamp.domain;

public class OperacaoDeInversao extends Operacao {
	
	public OperacaoDeInversao(String primeiroOperador) {
		super(primeiroOperador);
	}
	

	@Override
	public String calcula(String segundoOperador) {
		double primeiro = new Integer(getPrimeiroOperador());	
		return (1/primeiro)+"";
	}
}
