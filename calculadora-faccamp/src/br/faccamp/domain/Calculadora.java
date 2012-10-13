package br.faccamp.domain;

import br.faccamp.view.CalculadoraGUI;

public class Calculadora {

	private CalculadoraGUI gui;
	private Display display;
	private Operacao operacao;
	private LogSystem log;

	String memory = "";
	String auxMemory = "";

	public Calculadora() {
		gui = new CalculadoraGUI(this);
		display = new Display(gui);
		log = new LogSystem();
		
	}

	public void processaMC() {

		display.limpa();
		memory = "";
		auxMemory = "";
		display.atualiza(memory);

	}

	public void processaMR() {
		display.limpa();
		if (memory != "") {
			display.atualiza(memory);

		}

	}

	public void processaMS() {
		String conteudo = display.getConteudo();
		memory = conteudo;

	}

	public void processaMMais() {
		String conteudo = display.getConteudo();
		display.limpa();
		if (memory != "") {
			Integer primeiro = new Integer(conteudo);
			Integer segundo = new Integer(memory);
			segundo += primeiro;
			memory = Integer.toString(segundo);
			System.out.println(memory);
			display.limpa();
		} else {
			memory = conteudo;

			display.limpa();
		}
	}

	public void processaMMenos() {
		String conteudo = display.getConteudo();
		display.limpa();
		if (memory != "") {
			Integer primeiro = new Integer(conteudo);
			Integer segundo = new Integer(memory);
			segundo -= primeiro;
			memory = Integer.toString(segundo);
			System.out.println(memory);
			display.limpa();
		} else {
			memory = conteudo;

			display.limpa();
		}
	}

	public void processaCE() {
		operacao.getPrimeiroOperador();
		display.limpa();

	}

	public void processaC() {

		display.limpa();

	}

	public void processaRaiz() {
		operacao = new OperacaoDeRaizQuadrada(display.getConteudo());
		log.Recorder("Raiz de " + display.getConteudo());
		String conteudo = display.getConteudo();
		display.limpa();
		display.atualiza(operacao.calcula(conteudo));
		log.Recorder(" = " + display.getConteudo() + " , ");
	}

	public void processaMaisOuMenos() {
		log.Recorder("Inversao de sinal de " + display.getConteudo());
		operacao = new OperacaoDeMaisouMenos(display.getConteudo());
		String conteudo = display.getConteudo();
		display.limpa();
		display.atualiza(operacao.calcula(conteudo));
		log.Recorder(" = " + display.getConteudo() + " , ");
	}

	public void processaFatorial() {
		log.Recorder("Fatorial de " + display.getConteudo());
		operacao = new OperacaoDeFatorial(display.getConteudo());
		String conteudo = display.getConteudo();
		display.limpa();
		display.atualiza(operacao.calcula(conteudo));
		log.Recorder(" = " + display.getConteudo() + " , ");
	}

	public void processaSete() {
		display.atualiza("7");

	}

	public void processaOito() {
		display.atualiza("8");

	}

	public void processaNove() {
		display.atualiza("9");

	}

	public void processaDivisao() {
		
		operacao = new OperacaoDeDivisao(display.getConteudo());
		log.Recorder("Divisao de " + display.getConteudo());
		display.limpa();
		
	}

	public void processaPorcentual() {
		operacao = new OperacaoDePorcentagem(display.getConteudo());
		log.Recorder("Porcentagem de " + display.getConteudo());
		display.limpa();

	}

	public void processaQuatro() {
		display.atualiza("4");

	}

	public void processaCinco() {
		display.atualiza("5");
	}

	public void processaSeis() {
		display.atualiza("6");
	}

	public void processaVezes() {

		operacao = new OperacaoDeMultiplicacao(display.getConteudo());
		log.Recorder("Multiplicacao de " + display.getConteudo() + " * ");
		display.limpa();

	}

	public void processaUmSobreX() {
		log.Recorder("Processa 1 /x de " + display.getConteudo());
		operacao = new OperacaoDeInversao(display.getConteudo());
		display.limpa();
		// log.Recorder(" = " + display.getConteudo() + " , ");
	}

	public void processaUm() {
		display.atualiza("1");

	}

	public void processaDois() {
		display.atualiza("2");

	}

	public void processaTres() {
		display.atualiza("3");

	}

	public void processaMenos() {
		operacao = new OperacaoDeSubtracao(display.getConteudo());
		log.Recorder("Subtracao de " + display.getConteudo());
		display.limpa();
	}

	public void processaXElevadoY() {
		operacao = new OperacaoDePotenciacao(display.getConteudo());
		log.Recorder("X Elevado Y " + display.getConteudo());
		display.limpa();
	}

	public void processaZero() {
		display.atualizaZero("0");
	}

	public void processaVirgula() {
		display.atualizaVirgula(".");
	}

	public void processaIgual() {
		String conteudo = display.getConteudo();
		log.Recorder(display.getConteudo());
		display.limpa();
		display.atualiza(operacao.calcula(conteudo));
		log.Recorder(" = " + display.getConteudo() + " , ");
	
	}

	public void processaLog() {
		log.Recorder("Logaritimo de " + display.getConteudo());
		operacao = new OperacaoDeLog(display.getConteudo());
		String conteudo = display.getConteudo();
		display.limpa();
		display.atualiza(operacao.calcula(conteudo));
		log.Recorder(" = " + display.getConteudo() + " , ");
	}

	public void processaMais() {
		operacao = new OperacaoDeSoma(display.getConteudo());
		log.Recorder("Soma de " + display.getConteudo());
		display.limpa();

	}

}
