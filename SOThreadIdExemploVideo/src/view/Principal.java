package view;

import controller.ThreadCalc;
import controller.ThreadId;

public class Principal {

	public static void main(String[] args) {
		
//		for (int i = 0 ; i < 5; i ++) {
//			ThreadId t = new ThreadId();
//			t.start();
//			
//		}
		
		
		for(int op = 0 ; op < 100 ; op ++) {
			int opera = op%4;
			int a = (int)((Math.random() * 1000) + 1);
			int b = (int)((Math.random() * 100) + 1);
			
			ThreadCalc t = new ThreadCalc(a, b, opera);
			
//			if (opera == 3) {
//				t.setPriority(Thread.MAX_PRIORITY);
//			}
			
			t.start();
		}
		
		
	}
	
}
