package view;

import controller.ThreadPing;

public class Principal {

	public static void main(String[] args) {
		
		String[] dominio = {"www.google.com.br", "www.terra.com.br", "www.uol.com.br"};
		
		for(int i = 0; i < 3 ; i++) {
			ThreadPing t = new ThreadPing(dominio[i]);
			t.start();
		}
		
	}
	
}
