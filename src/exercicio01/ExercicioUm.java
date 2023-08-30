package exercicio01;

import java.util.Scanner;

public class ExercicioUm {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.println("Digite o salário:");
		salario = leitor.nextFloat();
		
		System.out.println("Digite o abono:");
		abono = leitor.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("O novo salário é: %.2f", novoSalario);
	}
}
