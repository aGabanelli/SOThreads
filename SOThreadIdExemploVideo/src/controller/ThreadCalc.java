package controller;

public class ThreadCalc extends Thread {

	private int a;
	private int b;
	private int operacao;
	
	public ThreadCalc(int a, int b, int operacao) {
		this.a = a;
		this.b = b;
		this.operacao = operacao;
	}
	
	public void run() {
		calc();
	}

	private void calc() {
		int res = 0;
		String op = "";
		
		int tempo = operacao * 1000;
		try {
			sleep(tempo);
		}
		catch(InterruptedException e) {
			System.err.println(e.getMessage());
		}
		
		switch(operacao) {
			case 0: {
				res = a + b;
				op = "+";
				break;
			}
			case 1: {
				res = a - b;
				op = "-";
				break;
			}
			case 2: {
				res = a * b;
				op = "*";
				break;
			}
			case 3: {
				res = a / b;
				op = "/";
				break;
			}
			default: {
				res = a + b;
				op = "+";
				break;
			}
		}
		
		int tid = (int) threadId();
		System.out.println("#" + tid + " => " + a + " " + op + " " + b + " = " + res);
		
	}
	
	
}
