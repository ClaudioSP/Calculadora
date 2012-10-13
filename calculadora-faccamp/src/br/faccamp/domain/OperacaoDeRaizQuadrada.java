package br.faccamp.domain;

public class OperacaoDeRaizQuadrada extends Operacao {
	public OperacaoDeRaizQuadrada(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String segundoOperador) {	
		Double primeiro = new Double(getPrimeiroOperador());
		return (Math.sqrt(primeiro))+"";
	}

}
