package collections.pilha_e_fila.exercicio_um;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		ControleFila controleFila = new ControleFila();
		int opcao;
		
		do {
			controleFila.exibirMenu();
			opcao = scanner.nextInt();
			controleFila.controlarMenu(opcao, scanner);
		}while(opcao != 0);
		
		scanner.close();
	}
}


