package br.com.brizzisoft.cm;

import br.com.brizzisoft.cm.modelo.Tabuleiro;
import br.com.brizzisoft.cm.visao.TabuleiroConsole;

public class Aplicacao {
	
	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
		
	}

}
