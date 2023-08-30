package exercicio03;

import java.util.Scanner;

public class ExercicioTres {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.println("Digite o o valor do salário bruto");
		salarioBruto = leitor.nextFloat();
		
		System.out.println("Digite o valor do adicional norturno");
		adicionalNoturno = leitor.nextFloat();
		
		System.out.println("Digite o valor das horas extras");
		horasExtras = leitor.nextFloat();
		
		System.out.println("Digite o valor dos descontos");
		descontos = leitor.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras*5) - descontos;
		
		System.out.println("Salário líquido: " + salarioLiquido);
	}
}
