
public class try1 {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		try {
			System.out.println(10/num);
		}
catch(ArithmeticException e) {
	System.out.println("Division not Allowed");
}
}
}
