package Runnable;

public class Main {

	public static void main(String[] args) {
		Runnable t=new Student();
		Thread thread=new Thread(t);
		thread.start();
		
	}

}
