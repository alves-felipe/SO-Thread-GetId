package view;

import controller.GenericThread;

public class Main {
	
	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			GenericThread gt = new GenericThread();
			
			gt.start();
		}
	}

}
