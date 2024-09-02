package controller;

public class ThreadId extends Thread{

	public ThreadId() {
		super();
	}
	
	@Override
	public void run() {
		int tid = (int) threadId();
		//threadId retorna um Id de um thread
		System.out.println("#" + tid);
	}
	
}
