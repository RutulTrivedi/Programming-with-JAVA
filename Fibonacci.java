import java.util.Scanner;

public class Fibonacci
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		seriesFib ob=new seriesFib();
		int a=0,b=1;

		System.out.print("Enter the number till which the number should be printed : ");
		int n=sc.nextInt();

		System.out.print(a+" ");
		System.out.print(b+" ");

		ob.printSeries(a,b,n);
	}
}

class seriesFib
{
	static int i=2;
	public int printSeries(int a,int b,int n)
	{
		int c=0;

		if(i==n)
		{
			return 0;
		}
		else
		{
			c=a+b;
			i++;
			System.out.print(c+" ");
			return printSeries(b,c,n);
		}

	}
}