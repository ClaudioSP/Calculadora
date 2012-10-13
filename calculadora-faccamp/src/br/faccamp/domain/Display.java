package br.faccamp.domain;

import br.faccamp.view.CalculadoraGUI;

public class Display {

	private CalculadoraGUI gui;

	public Display(CalculadoraGUI gui) {
		this.gui = gui;
	}

	public void limpa() {
		gui.atualizaDisplay("");

	}

	public void atualizaVirgula(String texto) {
		if (getConteudo().indexOf(".") == -1) {
			atualiza(texto);
		}
	}

	public void atualizaZero(String texto) {

		if (getConteudo().indexOf("0") == -1) {
			System.out.println(getConteudo());
			atualiza(texto);
		}else if (getConteudo().indexOf(".") == 1){
				atualiza(texto);
			}else if (getConteudo().indexOf("1")!=-1){
				atualiza(texto);
				
			}else if (getConteudo().indexOf("1")!=-1){
				atualiza(texto);
			}else if (getConteudo().indexOf("2")!=-1){
				atualiza(texto);
			}else if (getConteudo().indexOf("3")!=-1){
				atualiza(texto);
			}else if (getConteudo().indexOf("4")!=-1){
				atualiza(texto);
			}else if (getConteudo().indexOf("5")!=-1){
				atualiza(texto);
			}else if (getConteudo().indexOf("6")!=-1){
				atualiza(texto);
			}else if (getConteudo().indexOf("7")!=-1){
				atualiza(texto);
			}else if (getConteudo().indexOf("8")!=-1){
				atualiza(texto);
			}else if (getConteudo().indexOf("9")!=-1){
				atualiza(texto);
			}
		}
	

	public void atualiza(String texto) {

		if (getConteudo().equalsIgnoreCase("")) {

			gui.atualizaDisplay(texto);
		} else {

			gui.atualizaDisplay((getConteudo() + texto));
		}

	}

	public String getConteudo() {
		return gui.getDisplay();
	}

	//public String setConteudo(){
		//return gui.getDisplay();
	//}
}
