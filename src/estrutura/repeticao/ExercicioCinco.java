package estrutura.repeticao;

import java.util.Scanner;

public class ExercicioCinco {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num, soma=0;
		
		
		do {
			System.out.println("Digite um número:");
			num = scanner.nextInt();
			
			if (num > 0) soma += num;
			
		} while (num != 0);
		
		
		System.out.println("A soma dos números positivos é: " + soma);
		
		scanner.close();
	}
}
