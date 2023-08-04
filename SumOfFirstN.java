import java.util.Scanner;

public class SumOfFirstN
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Sum ob=new Sum();

		System.out.print("Enter the value of 'n' : ");
		int n=sc.nextInt();

		int ans=ob.sumTillN(n);

		System.out.print("Sum till numbers till 'n' will be : "+ans);
	}
}

class Sum
{
	static int i=0;
	public int sumTillN(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			i++;
			return n+sumTillN(n-1);
		}
	}
}