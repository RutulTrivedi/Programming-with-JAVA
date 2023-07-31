import java.util.*;

public class SumOfDigits
{
	public static void main(String[] args)
	{
		int n,r,sum=0;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number : ");
		n=sc.nextInt();

		while(n!=0)
		{
			r=n%10;
			sum=sum+r;
			n=n/10;
		}

		System.out.print("Sum of the digits will be "+sum);
	}
}