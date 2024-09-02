package controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreadPing extends Thread{

	String dominio;
	String dominioNome;
	
	public ThreadPing(String dominio) {
		this.dominio = dominio;
	}

	public void run() {
		nomeServidor();
		try {
			ping();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void nomeServidor() {
		if (dominio == "www.uol.com.br") {
			dominioNome = "UOL";
		} else if(dominio == "www.terra.com.br"){
			dominioNome = "Terra";
		}else if(dominio == "www.google.com.br"){
			dominioNome = "Google";
		}
		
	}

	public void ping() throws IOException {
		String comando = "ping -4 -c 10 " + dominio;
		
		Process processo = Runtime.getRuntime().exec(comando);
		BufferedReader reader = new BufferedReader(new InputStreamReader(processo.getInputStream()));
		String linha;
		
		while((linha = reader.readLine()) != null ) {
			if (linha.contains("tempo=")) {
				System.out.println(dominioNome + " | " + linha.trim());
			}
			if (linha.contains("dia =") || linha.contains("avg")) {
				System.out.println(dominioNome + " | " + linha.trim());
			}
		}
		reader.close();
		
		
	}
	
}
