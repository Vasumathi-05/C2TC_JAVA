import java.util.Scanner;

public class Main2 {
	static int dc(int n)
	{
		if(n<=9)
		{
			return n;
		}
		else
		{
			return n/10;
		}
	}
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			System.out.println(dc(n));
		
	}

}
