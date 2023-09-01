package estrutura.condicional;

import java.util.Scanner;

public class ExercicioDois {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int numero;
		String saida;
		
		
		System.out.println("Digite o número");
		numero = input.nextInt();
		
		saida = "O número " + numero;
		
		if (numero % 2 == 0) 
			saida += " é par ";
		else 
			saida += " é ímpar ";
		
		
		if (numero > 0) 
			saida += "e positivo";
		else if(numero == 0)
			saida += "e nulo";
		else 
			saida += "e negativo";
		
		System.out.println(saida);
		
		input.close();
	}
}
