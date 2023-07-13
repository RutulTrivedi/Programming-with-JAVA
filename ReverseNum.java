import java.util.Scanner;

public class ReverseNum
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		RevNum ob=new RevNum();

		System.out.print("Enter the number : ");
		int n=sc.nextInt();

		ob.reversedNum(n);
	}
}

class RevNum
{
	public int reversedNum(int n)
	{
		if(n==0)
		{
			return 0;
		}
		else
		{
			System.out.print(n%10);
			return reversedNum(n/10);	
		}
	}
}