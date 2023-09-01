package tipos.variaveis;

import java.util.Scanner;

public class ExercicioQuatro {

    public static void main (String[] args) {

        Scanner leitor  = new Scanner(System.in);

        float n1, n2, n3, n4, diferenca;

        System.out.println("Digite o primeiro número: ");
        n1 = leitor.nextFloat();

        System.out.println("Digite o segundo número: ");
        n2 = leitor.nextFloat();

        System.out.println("Digite o terceiro número: ");
        n3 = leitor.nextFloat();

        System.out.println("Digite o quarto número: ");
        n4 = leitor.nextFloat();

        diferenca = (n1 * n2) - (n3 * n4);

        System.out.println("Diferença é: " + diferenca);
        
        leitor.close();
    }

}