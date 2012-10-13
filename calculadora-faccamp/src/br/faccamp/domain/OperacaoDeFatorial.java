package br.faccamp.domain;

public class OperacaoDeFatorial extends Operacao {
	public OperacaoDeFatorial(String primeiroOperador) {
		super(primeiroOperador);
	}
	

	@Override
	public String calcula(String segundoOperador) {
		Integer primeiro = new Integer(getPrimeiroOperador());
		
		int f = primeiro;
		while (primeiro > 1){  
            f = f *(primeiro-1); 
            primeiro--; 
	 
		}
		return (f)+"";
	}
}
