import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char ch;
		String str=sc.nextLine();
		StringBuffer sb=new StringBuffer(str);
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z') 
			{
				ch=(char)(str.charAt(i)- 32);
			}
			else if(str.charAt(i)>='A' && str.charAt(i)<='Z' )
			{
				ch=(char) (str.charAt(i)+ 32);
				}
			else
			{
			ch=str.charAt(i);
		}
			sb.setCharAt(i, ch);
		}
		System.out.println(sb);
	}
	}
