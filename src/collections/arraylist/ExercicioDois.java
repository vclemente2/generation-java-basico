package collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioDois {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		int numero, indice;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);
	
		System.out.println("Digite um número:");
		numero = scanner.nextInt();
		
		indice = numeros.indexOf(numero);
	
		if(indice == -1)
			System.out.println("O Número " + numero + " não foi encontrado");
		else
			System.out.println("O Número " + numero + " está localizado na posição " + indice);
		
		scanner.close();
	}
}
