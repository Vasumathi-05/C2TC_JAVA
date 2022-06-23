package oddeven;

import java.util.Scanner;

public class odev {

	public static void main(String[] args) {
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		n=in.nextInt();
		if(((n&1)==0))
		{
			System.out.println("given no is even");
		}
		else
		{
		System.out.println("given no is odd");
	}
	}
}
