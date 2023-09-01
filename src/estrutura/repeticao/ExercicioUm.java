package estrutura.repeticao;

import java.util.Scanner;

public class ExercicioUm {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num01, num02;
		
		System.out.println("Digite o primeiro número do intervalo:");
		num01 = scanner.nextInt();
		
		System.out.println("Digite o segundo número do intervalo:");
		num02 = scanner.nextInt();		
		
		
		if(num01 > num02)
			System.out.println("Intervalo inválido!");
		else {
			System.out.println("No intervalo entre " + num01 + " e " + num02 + ":\n");
			for (int i = num01; i <= num02; i++) {
				if (i % 3 == 0 && i % 5 == 0) {
					System.out.println(i + " é múltiplo de 3 e 5");
				}
			}
		}
		
		scanner.close();
	}
}
