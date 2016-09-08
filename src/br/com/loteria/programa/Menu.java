package br.com.loteria.programa;

import java.util.Scanner;

public class Menu {
	
	Scanner entrada = new Scanner(System.in);
	
	public void menuPricipal() {
		
		int escolha;
		
		System.out.println("1. Seleciona números");
		System.out.println("2. Sorteia números");
		System.out.println("3. Ver resultados");
		System.out.println("0. SAIR");
		
		escolha = entrada.nextInt();
		
		switch(escolha) {
		
		case 0:
			System.out.println("SAIR");
			return;
		case 1:
			System.out.println("Selecione os seus números entre 0 e 60.");
			break;
		case 2:
			System.out.println("Sorteando os números.");
			break;
		case 3:
			System.out.println("Ver resultados");
			break;
		default:
			System.out.println("Ops. Opção inválida! Tente novamente...");
		}
		
	}
	
	
}
