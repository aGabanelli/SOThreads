package controller;

public class ThreadVetor extends Thread{

	int numero;
	int[] vetor;
	
	
	public ThreadVetor(int numero, int[] vetor) {
		this.numero = numero;
		this.vetor = vetor;
	}
	
	public void run() {
		contarLaco();
	}

	private void contarLaco() {
		
		if(numero%2 == 0) {
			
			double tInicio = System.nanoTime();
			for(int i = 0; i < vetor.length; i++) {
			}
			double tFim = System.nanoTime();
			double tempo = (tFim - tInicio)/Math.pow(10, 9);
			System.out.println("For = " + tempo + "s");
			
		}
		else {
			
			double tInicio = System.nanoTime();
			for(int i : vetor){
			}
			double tFim = System.nanoTime();
			double tempo = (tFim - tInicio)/Math.pow(10, 9);
			System.out.println("ForEach = " + tempo + "s");
			
		}	
	}

	
	
}
