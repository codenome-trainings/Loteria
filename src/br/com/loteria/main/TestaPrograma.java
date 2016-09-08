package br.com.loteria.main;

import java.util.ArrayList;
import java.util.List;

import br.com.loteria.programa.Programa;

public class TestaPrograma {
	public static void main(String[] args) {
		
		List<Integer> meusNumeros = new ArrayList<Integer>();
		
		
		Programa programa = new Programa(meusNumeros);
		programa.adicionaNumeros();
		
		programa.imprimeNumeros();
		
	}
}
