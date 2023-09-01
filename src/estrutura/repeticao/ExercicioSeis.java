package estrutura.repeticao;

import java.util.Scanner;

public class ExercicioSeis {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num, soma=0, quantidade=0;
		float media=0f, somaFloat, quantidadeFloat;
		
		
		do {
			System.out.println("Digite um número:");
			num = scanner.nextInt();
			
			if (num % 3 == 0 && num != 0) {
				soma += num;
				quantidade++;
			}
			
		} while (num != 0);
		
		
		somaFloat = soma;
		quantidadeFloat = quantidade;
		media = somaFloat / quantidadeFloat;
		
		System.out.println("A media de todos os números multiplos de 3 é: " + media);
		
		scanner.close();
	}
}
