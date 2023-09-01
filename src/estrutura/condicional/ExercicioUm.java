package estrutura.condicional;

import java.util.Scanner;

public class ExercicioUm {
	 public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numero01, numero02, numero03, soma;
		
		System.out.println("Digite o primeiro número:");
		numero01 = input.nextInt();
			
		System.out.println("Digite o segundo número:");
		numero02 = input.nextInt();			
			
		System.out.println("Digite o terceiro número:");
		numero03 = input.nextInt();
			
		soma = numero01 + numero02;
			
		if(soma > numero03) {
			System.out.println(numero01 + " + " + numero02 + " = " + soma + " > " + numero03);
			System.out.println("A Soma de A + B é Maior do que C");
		}
		else if (soma == numero03) {
			System.out.println(numero01 + " + " + numero02 + " = " + soma + " = " + numero03);
			System.out.println("A Soma de A + B é Igual a C");	
		}
		else {
			System.out.println(numero01 + " + " + numero02 + " = " + soma + " < " + numero03);
			System.out.println("A Soma de A + B é Menor do que C");
		}
		
		input.close();
	 }
}
