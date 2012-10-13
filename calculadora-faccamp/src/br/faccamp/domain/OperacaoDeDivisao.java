package br.faccamp.domain;

public class OperacaoDeDivisao extends Operacao{
	
	public OperacaoDeDivisao(String primeiroOperador) {
		super(primeiroOperador);
	}

	@Override
	public String calcula(String segundoOperador) {
		Double primeiro = new Double(getPrimeiroOperador());
		Double segundo = new Double(segundoOperador);
		if (segundo == 0){
		return ("Erro!")+"";
		}else{
			return(primeiro/segundo)+"";
		}
	}

}
