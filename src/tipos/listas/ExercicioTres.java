package tipos.listas;

import java.util.Scanner;

public class ExercicioTres {
	    public static void main(String[] args) {

	        Scanner leia = new Scanner(System.in);

	        int matriz [][] = new int [3][3];
	        String diagonalPrincipal = "Elementos da diagonal principal: \n";
	        String diagonalSecundaria = "Elementos da diagonal secundária: \n";
	        int somaDiagonalPrincipal = 0, somaDiagonalSecundaria = 0;

	        for(int i = 0; i < 3; i++) {
	            for(int j = 0; j < 3; j++) {
	                System.out.println("Digite um número na posição [" + i + "][" + j + "] :" );
	                matriz[i][j] = leia.nextInt();
	            }


	        }

	        for(int i = 0; i < 3; i++) {
	            for(int j = 0; j < 3; j++) {
	                if(i == j) {
	                    diagonalPrincipal += matriz[i][j] + " ";
	                    somaDiagonalPrincipal += matriz[i][j];
	                }

	                if(i + j == 2) {
	                    diagonalSecundaria += matriz[i][j] + " ";
	                    somaDiagonalSecundaria += matriz[i][j];
	                }
	            }
	        }

	        System.out.println(diagonalPrincipal);
	        System.out.println(diagonalSecundaria);
	        System.out.println("Soma dos Elementos Diagonal Principal: \n" + somaDiagonalPrincipal);
	        System.out.println("Soma dos Elementos Diagonal Secundária: \n" + somaDiagonalSecundaria);

	        leia.close();
	    }
}
