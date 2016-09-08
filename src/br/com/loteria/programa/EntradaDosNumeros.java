package br.com.loteria.programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EntradaDosNumeros {

	private List<Integer> meusNumeros = new ArrayList<Integer>();
	Scanner entrada = new Scanner(System.in);

	public EntradaDosNumeros() {
	}

	public void adicionaNumeros() {
		for (int i = 0; i < 6; i++) {	
			this.meusNumeros.add(verificaNumeroCompativel());
		}
	}

	private int verificaNumeroCompativel() {
		int numero = -9999;
		while (!(numero >= 0 && numero <= 60)) {
			System.out.printf("Digite um número: ");
			numero = entrada.nextInt();
			if ((numero >= 0 && numero <= 60)) break;
			else System.out.println("Número não corresponde os números do sorteio.");				
		}
		return numero;
	}

}