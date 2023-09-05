package collections.arraylist;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ExercicioTres {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        Set<Integer> setNumeros = new HashSet<Integer>();

        for(int i = 0; i < 10; i++) {
            System.out.println("Digite um número: ");
             setNumeros.add(leitor.nextInt());
        }

        Iterator<Integer> isetNumeros = setNumeros.iterator();

        System.out.println("\nLista de todos os números com o Iterator:");

        while (isetNumeros.hasNext()) {
            System.out.println(isetNumeros.next());
        }

        leitor.close();
    }

}