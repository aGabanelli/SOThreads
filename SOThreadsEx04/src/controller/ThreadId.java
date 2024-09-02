package controller;

import java.util.ArrayList;
import java.util.List;

public class ThreadId extends Thread{

	int pulo;
	int dPercorrida;
	int dTotal;
	private static int saposTerminaram = 0;
	private static List<Integer> podio = new ArrayList<Integer>();
	
	public ThreadId(int pulo, int dPercorrida, int dTotal) {
		this.pulo = pulo;
		this.dPercorrida = dPercorrida;
		this.dTotal = dTotal;
	}

	public void run() {
		while(dPercorrida < dTotal) {
			corrida();	
			try {
				Thread.sleep(1500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			if(saposTerminaram == 5) {
				for(Integer i = 0; i < 5; i ++) {
					System.out.println
					((i+1) + "º = " + podio.get(i));
				}			
			}
		}
	}

	private void corrida() {
		dPercorrida = dPercorrida + pulo;
		
		if(dPercorrida >= dTotal) {
			System.out.println("O sapo " + threadId() + " chegou! Distancia percorrida = " + dPercorrida);
			saposTerminaram++;
			podio.add((int)threadId());
			
		}else {
			System.out.println("Sapo " + threadId() + " está em " + dPercorrida + "m | Salto = " + pulo + "m");
		}
		
	}
	
	
}
