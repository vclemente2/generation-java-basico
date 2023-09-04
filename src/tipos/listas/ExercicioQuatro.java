package tipos.listas;

import java.util.Scanner;

public class ExercicioQuatro {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float[][] notas = new float[10][4];
		float[] medias = new float[10];
		
		for(int i = 0; i < notas.length; i++) {
			float somaNotas = 0.0f;
			
			for(int j = 0; j < notas[0].length; j++) {
				System.out.println("Digite a " + (j + 1) + "ª nota do " + (i + 1) + "º aluno:");
				notas[i][j] = scanner.nextFloat();
				
				somaNotas += notas[i][j];
			}
			
			medias[i] = somaNotas / (notas[0].length);
		}
		
		for(int i = 0; i < medias.length; i++) {
			System.out.printf("Média do aluno %d: %.1f \n", (i+1), medias[i]);
		}

		
		scanner.close();
	}
}
