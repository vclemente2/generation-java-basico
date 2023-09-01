package estrutura.condicional;

import java.util.Scanner;

public class ExercicioSeis {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int codigoCargo;
		String nomeColaborador, cargo;
		float salario;
		
		System.out.println("Digite o código do cargo do colaborador:");
		codigoCargo = input.nextInt();
		input.nextLine();
	
		switch(codigoCargo) {
		case 1:
			System.out.println("Digite o nome do colaborador:");
			nomeColaborador = input.nextLine();
			
			System.out.println("Digite o salario do colaborador:");
			salario = input.nextFloat();
			
			cargo = "Gerente";
			salario += (0.1 * salario);
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("Cargo: " + cargo);
			System.out.printf("Salário: R$ %.2f", salario);
			break;
			
		case 2:
			System.out.println("Digite o nome do colaborador:");
			nomeColaborador = input.nextLine();
			
			System.out.println("Digite o salario do colaborador:");
			salario = input.nextFloat();
			
			cargo = "Vendedor";
			salario += (0.07 * salario);
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("Cargo: " + cargo);
			System.out.printf("Salário: R$ %.2f", salario);
			break;
		
		case 3:
			System.out.println("Digite o nome do colaborador:");
			nomeColaborador = input.nextLine();
			
			System.out.println("Digite o salario do colaborador:");
			salario = input.nextFloat();
			
			cargo = "Supervisor";
			salario += (0.09 * salario);
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("Cargo: " + cargo);
			System.out.printf("Salário: R$ %.2f", salario);
			break;
			
		case 4:
			System.out.println("Digite o nome do colaborador:");
			nomeColaborador = input.nextLine();
			
			System.out.println("Digite o salario do colaborador:");
			salario = input.nextFloat();
			
			cargo = "Motorista";
			salario += (0.06 * salario);
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("Cargo: " + cargo);
			System.out.printf("Salário: R$ %.2f", salario);
			break;
			
		case 5:
			System.out.println("Digite o nome do colaborador:");
			nomeColaborador = input.nextLine();
			
			System.out.println("Digite o salario do colaborador:");
			salario = input.nextFloat();
			
			cargo = "Estoquista";
			salario += (0.05 * salario);
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("Cargo: " + cargo);
			System.out.printf("Salário: R$ %.2f", salario);
			break;
			
		case 6:
			System.out.println("Digite o nome do colaborador:");
			nomeColaborador = input.nextLine();
			
			System.out.println("Digite o salario do colaborador:");
			salario = input.nextFloat();
			
			cargo = "Técnico de TI";
			salario += (0.08 * salario);
			System.out.println("Nome do colaborador: " + nomeColaborador);
			System.out.println("Cargo: " + cargo);
			System.out.printf("Salário: R$ %.2f", salario);
			break;
			
		default:
			System.out.println("Cargo não localizado.");
		}
		
		
		input.close();
	}
}
