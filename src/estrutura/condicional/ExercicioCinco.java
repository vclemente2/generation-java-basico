package estrutura.condicional;

import java.util.Scanner;

public class ExercicioCinco {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int codigo, quantidade;
		double valorTotal;
		String produto;
		
		System.out.println("Digite o código do produto:");
		codigo = input.nextInt();
		
		switch(codigo) {
		case 1:
			System.out.println("Digite a quantidade desejada:");
			quantidade = input.nextInt();
			produto = "Cachorro Quente";
			valorTotal = quantidade * 10.0;
			System.out.println("Produto: " + produto);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		
		case 2: 
			System.out.println("Digite a quantidade desejada:");
			quantidade = input.nextInt();
			produto = "X-Salada";
			valorTotal = quantidade * 15.0;
			System.out.println("Produto: " + produto);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		
		case 3: 
			System.out.println("Digite a quantidade desejada:");
			quantidade = input.nextInt();
			produto = "X-Bacon";
			valorTotal = quantidade * 18.0;
			System.out.println("Produto: " + produto);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
			
		case 4: 
			System.out.println("Digite a quantidade desejada:");
			quantidade = input.nextInt();
			produto = "Bauru";
			valorTotal = quantidade * 12.0;
			System.out.println("Produto: " + produto);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
		
		case 5: 
			System.out.println("Digite a quantidade desejada:");
			quantidade = input.nextInt();
			produto = "Refrigerante";
			valorTotal = quantidade * 8.0;
			System.out.println("Produto: " + produto);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
			
		case 6: 
			System.out.println("Digite a quantidade desejada:");
			quantidade = input.nextInt();
			produto = "Suco de Laranja";
			valorTotal = quantidade * 13.0;
			System.out.println("Produto: " + produto);
			System.out.printf("Valor total: R$ %.2f", valorTotal);
			break;
			
		default: 
			System.out.println("Produto não localizado.");
		}
		
		
		input.close();
	}
}
