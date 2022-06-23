import java.util.Scanner;
public class search {

	public static void main(String[] args) {
	int n,x,flag=0,i;
	System.out.print("Enter the number of elements:");
	Scanner s = new Scanner(System.in);
	n=s.nextInt();
	int a[]=new int[n];
	System.out.print("Enter the elements:");
	for(i=1;i<n;i++)
	{
a[i]=s.nextInt();
	}
	System.out.print("Enter the element to be searched:");
	x=s.nextInt();
	for(i=1;i<n;i++)
	{
		if(a[i]==x)
		{
			System.out.println("Position of "+x+" is :"+i);
			flag=1;
			break;
		}
	}
	if(flag==0)
	{
		System.out.println("Element "+x+" not found");
	}
	}
}