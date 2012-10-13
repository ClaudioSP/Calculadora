package br.faccamp.domain;

public class OperacaoDeSubtracao extends Operacao {

	public OperacaoDeSubtracao(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String segundoOperador) {
		
		Double primeiro = new Double(getPrimeiroOperador());
		Double segundo = new Double(segundoOperador);
		return (primeiro-segundo)+"";
	}

	
}
