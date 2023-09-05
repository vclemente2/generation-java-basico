package collections.pilha_e_fila.exercicio_dois;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ControlePilha controlePilha = new ControlePilha();
		int opcao;
		
		do {
			controlePilha.exibirMenu();
			opcao = scanner.nextInt();
			controlePilha.controlarMenu(opcao, scanner);
		}while(opcao != 0);
		
		scanner.close();
	}
}


