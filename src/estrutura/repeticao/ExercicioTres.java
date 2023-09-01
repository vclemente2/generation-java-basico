package estrutura.repeticao;

import java.util.Scanner;

public class ExercicioTres {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int idade, contadorMenorVinteUm = 0, contadorMaiorCinquenta = 0;
		
		System.out.println("Digite uma idade:");
		idade = scanner.nextInt();
		
		while(idade >= 0) {
			if(idade < 21) contadorMenorVinteUm++;
			else if(idade > 50) contadorMaiorCinquenta++;
			
			System.out.println("Digite uma idade:");
			idade = scanner.nextInt();
		}
		
		System.out.println("Total de pessoas menores de 21 anos: " + contadorMenorVinteUm);
		System.out.println("Total de pessoas maiores de 50 anos: " + contadorMaiorCinquenta);
	
		scanner.close();
	}
}
