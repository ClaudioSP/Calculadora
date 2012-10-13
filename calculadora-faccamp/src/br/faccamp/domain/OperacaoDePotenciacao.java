package br.faccamp.domain;

public class OperacaoDePotenciacao extends Operacao {
	
	public OperacaoDePotenciacao(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String segundoOperador) {
		Double primeiro = new Double(getPrimeiroOperador());
		Double segundo = new Double(segundoOperador);
		return (Math.pow(primeiro,segundo))+"";
	}

}
