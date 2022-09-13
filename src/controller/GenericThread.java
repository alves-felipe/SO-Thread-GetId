package controller;

public class GenericThread extends Thread {

	public GenericThread() {
	}
	
	
	@Override
	public void run() {
		System.out.println("id: "+getId());
	}
	
}
