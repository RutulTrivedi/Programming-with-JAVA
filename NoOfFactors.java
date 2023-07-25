import java.util.*;

public class NoOfFactors
{
	public static void main(String[] args)
	{
		int i,n,fac=0;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number : ");
		n=sc.nextInt();

		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				fac++;
			}
		}

		System.out.print("Total number of factors are "+fac+".");
	}
}