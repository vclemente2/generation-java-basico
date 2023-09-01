package tipos.variaveis;

import java.util.Scanner;

public class ExercicioDois {

    public static void main (String[] args) {

        Scanner leitor = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media;

        System.out.println("Digite a primeira nota: ");
        nota1 = leitor.nextFloat();

        System.out.println("Digite a segunda nota: ");
        nota2 = leitor.nextFloat();

        System.out.println("Digite a terceira nota: ");
        nota3 = leitor.nextFloat();

        System.out.println("Digite a quarta nota: ");
        nota4 = leitor.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;


        System.out.println("Média final: " + media);
        
        leitor.close();
    }
}