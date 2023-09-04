package tipos.listas;

import java.util.Scanner;

public class ExercicioDois {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] vetor = new int[10];
		int soma = 0;
		double media = 0.00;

		String elementosPares = "Elementos pares: \n";
		String elementosIndicesImpares = "Elementos nos índices ímpares: \n";
		
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Digite o número da posição n° " + (i+1));
			vetor[i] = scanner.nextInt();
			
			soma += vetor[i];
			
			if (i == vetor.length - 1) {
				media = soma / 10.00;
			}
			
			if(vetor[i] % 2 == 0) {
				elementosPares += vetor[i] + " ";
			}
			
			if(i % 2 != 0) {
				elementosIndicesImpares += vetor[i] + " ";
			}
		}
		
		System.out.println(elementosIndicesImpares + "\n");
		System.out.println(elementosPares + "\n");	
		System.out.println("Soma: " + soma + "\n");
		System.out.printf("Média: %.2f", media);
		
		scanner.close();
	}
}
