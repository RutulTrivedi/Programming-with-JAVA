import java.util.*;

public class Fibonacci
{
	public static void main(String[] args)
	{
		int a=0,b=1,c,i,n;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number of numbers : ");
		n=sc.nextInt();
		System.out.print(" "+a);
		System.out.print(" "+b);

		for(i=1;i<=n-2;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);	
		}
	}
}