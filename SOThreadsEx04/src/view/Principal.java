package view;

import controller.ThreadId;

public class Principal {

	public static void main(String[] args) {
				
		int dTotal = 1000;
		
		System.out.println("Corrida de Sapos");
		System.out.println("========================");
		
		for(int sapo = 0 ; sapo < 5 ; sapo ++) {
			//coloquei de 100 até o máximo pq as vezes caia 14m, e demorava demais pra chegar :P
			int pulo = (int)((Math.random() * 1000) + 100);
			ThreadId t = new ThreadId(pulo, 0, dTotal);
			
			t.start();
		}
		
		
	}
	
}