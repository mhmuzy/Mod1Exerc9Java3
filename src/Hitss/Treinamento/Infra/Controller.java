package Hitss.Treinamento.Infra;

import java.util.Scanner;

public class Controller {
	public static void Play() {
		try {
			
		
		System.out.println("");
		System.out.println("    Hitss Treinamento");
		System.out.println("");
		System.out.println("Prezado(a) Usu�rio(a), Estamos em desenvolvimento no Momento.");
		System.out.println("");
		Scanner teclado = new Scanner(System.in);
		System.out.println("");
		int opcao = 0;
		System.out.println("");
		while (opcao != 3) {
			System.out.println("");
			System.out.println("------------------------------------------------");
			System.out.println("(1) - Novo Sal�rio");
			System.out.println("(2) - 13� Sal�rio");
			System.out.println("(3) - Sair do Programa");
			System.out.println("------------------------------------------------");
			System.out.println("");
			System.out.println("Digite a Op��o Desejada:");
			System.out.println("");
			opcao = teclado.nextInt();
			System.out.println("");
			switch (opcao) {
			case 1:
				System.out.println("");
				System.out.println("Esta �rea est� em Desenvolvimento.");
				break;
			case 2:
				System.out.println("");
				System.out.println("Esta �rea est� em Desenvolvimento.");
				break;
			case 3:
				System.out.println("");
				System.out.println("At� Logo!");
				break;
			default:
				System.out.println("");
				System.out.println("Op��o Inv�lida!");
				break;
			}
		}
		} catch (Exception e) {
			System.out.println("");
			System.out.println("Op��o Inv�lida!");
		}
	}
}
