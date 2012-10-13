package br.faccamp.domain;

public class OperacaoDePorcentagem extends Operacao {

	public OperacaoDePorcentagem(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String segundoOperador) {
		double primeiro = new Integer(getPrimeiroOperador());
		System.out.println(primeiro);
		double segundo = new Integer(segundoOperador);

		return (primeiro*(segundo/100)) + "";

	}

}
