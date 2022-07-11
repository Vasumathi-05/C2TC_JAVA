package ThreadExample;

public class Demo1 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<5;i++)
		{
			try {
				Thread.sleep(1010);
			}
			catch(Exception e) {
		}
			System.out.println("Hi");
		}
	}
}

