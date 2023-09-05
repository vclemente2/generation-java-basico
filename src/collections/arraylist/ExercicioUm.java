package collections.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ExercicioUm {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> cores= new ArrayList<String>();
		
		
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite a " + (i + 1) + "ª cor");
			cores.add(scanner.next());
		}

		System.out.println("Lista todas as cores:\n");
		for(String cor: cores) {
			System.out.println(cor);
		}
		
		cores.sort(null);
		
		
		System.out.println("\nOrdenar as cores:\n");
		for(String cor: cores) {
			System.out.println(cor);
		}
		
		
		scanner.close();
	}
}
