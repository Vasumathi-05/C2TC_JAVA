import java.util.Scanner;

public class soluion{
	public static final Calci Calculator=new Calci();
	public static final Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		while(in.hasNextInt()) {
			int n=in.nextInt();
			int p=in.nextInt();
			try {
				System.out.println(Calculator.power(n, p));
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}