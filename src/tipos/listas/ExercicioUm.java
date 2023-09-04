package tipos.listas;

import java.util.Scanner;

public class ExercicioUm {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
        int numero;
        boolean numeroEncontrado = false;

        System.out.println("Digite o número que você deseja encontrar: ");
        numero = leia.nextInt();

        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i] == numero) {
                System.out.println("O número " + numero + " está localizado na posição: " + i);
                numeroEncontrado = true;
                break;
            }
        }

        if(numeroEncontrado == false) {
            System.out.println("O número " + numero + " não foi encontrado!");
        }

        leia.close();
    }
}