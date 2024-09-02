package controller;

public class ThreadId extends Thread{

	private int[] vetor;
	private int linha;
	
	
	public ThreadId(int[] vetor, int linha) {
		this.vetor = vetor;
		this.linha = linha;
	}

	@Override
	public void run() {
		somaLinhas();
	}

	private void somaLinhas() {
		int soma = 0;
		
		for(int i : vetor) {
			soma = soma + i;
		}
		System.out.println("Linha " + (linha+1) + " = " + soma);
			
	}
	
}
