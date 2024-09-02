package view;

import controller.ThreadId;

public class Principal {

	public static void main(String[] args) {
		
		int[][] matriz = new int[3][5];
		
		for(int i = 0 ; i < 3 ; i++) {
			for (int j = 0; j < 5 ; j ++) {
				matriz[i][j] = (int) ((Math.random()*100)+1);
			}
		}
		
		System.out.println("Matriz:");
		for(int i = 0 ; i < 3 ; i++) {
			for (int j = 0; j < 5 ; j ++) {
				System.out.println(matriz[i][j] + " ");
			}
			System.out.println("\n");
		}
		
		
		for (int linha = 0 ; linha < 3; linha ++) {
			int[] linhaMatriz = new int[5];
			for (int coluna = 0; coluna < 5 ; coluna ++) {
				linhaMatriz[coluna] = matriz[linha][coluna];
			}
			ThreadId t = new ThreadId(linhaMatriz, linha);
			t.start();
		}
	}
}
