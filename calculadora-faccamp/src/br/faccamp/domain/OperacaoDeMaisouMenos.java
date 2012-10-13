package br.faccamp.domain;

public class OperacaoDeMaisouMenos extends Operacao {
	public OperacaoDeMaisouMenos(String primeiroOperador) {
		super(primeiroOperador);
	}
	

	@Override
	public String calcula(String segundoOperador) {
		Double primeiro = new Double(getPrimeiroOperador());
		primeiro = primeiro*(-1);
		return(primeiro)+"";
	}
}
