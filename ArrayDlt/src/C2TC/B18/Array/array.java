package C2TC.B18.Array;

public class array {

	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		int delete=30;
		for(int i=0;i<a.length;i++)
		{
			if(delete==a[i])
			{
				for(int j=i;j<a.length-1;j++)
				{
					a[j]=a[j+1];
				}
				break;
			}
		}
		for(int i=0;i<a.length-1;i++)	
		{
			System.out.println(a[i]+" ");
		}

	}

}
