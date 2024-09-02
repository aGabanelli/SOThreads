package view;

import java.util.Scanner;

import controller.ThreadVetor;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] vetor = new int [1000];
		
		for(int i = 0; i < 1000; i++) {
			vetor[i] = (int)((Math.random()*100) + 1);
		}
		
		System.out.println("Digite um número: ");
		int n = scanner.nextInt();
		
		System.out.println("Tempo para percorrer o vetor");
		ThreadVetor t = new ThreadVetor(n, vetor);
		t.start();
	}
	
}
