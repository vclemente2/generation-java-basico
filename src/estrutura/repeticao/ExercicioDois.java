package estrutura.repeticao;

import java.util.Scanner;

public class ExercicioDois {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num, numPares = 0, numImpares = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("Digite o "+(i+1)+ " número:");
			num = scanner.nextInt();
			
			if (num % 2 == 0) numPares++;
			else numImpares++;
		}
		
		System.out.println("Total de números pares: " + numPares);
		System.out.println("Total de números ímpares: " + numImpares);
		
		scanner.close();
	}
}
