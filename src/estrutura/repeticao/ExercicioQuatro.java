package estrutura.repeticao;

import java.util.Scanner;

public class ExercicioQuatro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int pessoaDevBackend=0, mulherDevFrontend=0, homemDevMobileMaiorQuarenta=0, mulherDevFullstackMenorTrinta=0;
		int idade, sexo, categoria;
		boolean on = true;
				
		while(on) {
			
			while(true) {
				System.out.println("Digite a idade do colaborador");
				idade = scanner.nextInt();
				
				if (idade < 15 || idade > 120) 
					System.out.println("Valor inválido, a idade precisa ser um número positivo entre 15 e 120!");
				else break;
			}
			
			while(true) {
				System.out.println("Informe o sexo colaborador\n(1)Masculino | (2)Feminino | (3)Outros");
				sexo = scanner.nextInt();
				
				if(sexo < 1 || sexo > 3) 
					System.out.println("Opção inválida.");
				else break;
			}
			
			
			while(true) {
				System.out.println("Informe o categoria do colaborador\n(1)Backend | (2)Frontend | (3)Mobile | (4)Fullstack");
				categoria = scanner.nextInt();
				
				if(categoria < 1 || categoria > 4) 
					System.out.println("Opção inválida.");
				else break;
			}
			
			if(categoria == 1) pessoaDevBackend++;
			if(categoria == 2 && sexo == 2) mulherDevFrontend++;
			if(categoria == 3 && sexo == 1 && idade > 40) homemDevMobileMaiorQuarenta++;
			if(categoria == 4 && sexo == 2 && idade < 30) mulherDevFullstackMenorTrinta++;
			
			
			while(true) {
				char continuar;
				System.out.println("Deseja informar os dados de mais um colaborador? (S / N)");
				continuar = scanner.next().charAt(0);
				continuar = Character.toUpperCase(continuar);
				
				if(continuar == 'S') break;
				else if (continuar == 'N') {
					System.out.println("Total de pessoas desenvolvedoras Backend: " + pessoaDevBackend);
					System.out.println("Total de mulheres desenvolvedoras Frontend: " + mulherDevFrontend);
					System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + homemDevMobileMaiorQuarenta);
					System.out.println("Total de mulheres desenvolvedoras fullstack menores de 30 anos: " + mulherDevFullstackMenorTrinta);
					on = false;
					break;
				} else {
					System.out.println("Opção inválida.");
				}
			}

		}
	
	scanner.close();
	}
}
