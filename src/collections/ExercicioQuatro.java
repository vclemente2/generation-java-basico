package collections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioQuatro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numero;
		boolean numeroEncontrado;
		Set<Integer> setLista = new HashSet<Integer>();
		setLista.add(2);
        setLista.add(5);
        setLista.add(1);
        setLista.add(3);
        setLista.add(4);
        setLista.add(9);
        setLista.add(7);
        setLista.add(8);
        setLista.add(10);
        setLista.add(6);
        
        System.out.println("Digite um número:");
        numero = scanner.nextInt();
        
        numeroEncontrado = setLista.contains(numero);
        
        if(numeroEncontrado)
        	System.out.println("O número " + numero + " foi encontrado!");
        else
        	System.out.println("O número " + numero + " não foi encontrado!");
        
       scanner.close(); 
	}
}
