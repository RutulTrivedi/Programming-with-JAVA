import java.util.*;

public class SumOfOddNumbers
{
	public static void main(String[] args)
	{
		int n,sum=0,i;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number : ");
		n=sc.nextInt();

		for(i=0;i<=n;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}

		System.out.print("The sum of odd numbers till the value of 'n' is "+sum);
	}
}