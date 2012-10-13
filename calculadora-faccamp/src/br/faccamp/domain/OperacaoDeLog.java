package br.faccamp.domain;

public class OperacaoDeLog extends Operacao {

	public OperacaoDeLog(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String segundoOperador) {
		Double primeiro = new Double(getPrimeiroOperador());
		return (Math.log10(primeiro)) + "";// por padrão na calculadora log entra com base 10.
	}

}
