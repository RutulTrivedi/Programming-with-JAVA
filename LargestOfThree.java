import java.util.*;

public class LargestOfThree
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the first number : ");
		a=sc.nextInt();

		System.out.print("Enter the second number : ");
		b=sc.nextInt();

		System.out.print("Enter the third number : ");
		c=sc.nextInt();

		if(a>b&&a>c)
		{
			System.out.print("The greatest of the three number is "+a);
		}

		else if(b>c&&b>a)
		{
			System.out.print("The greatest of the three number is "+b);
		}
		else
		{
			System.out.print("The greatest of the three number is "+c);
		}
	}
}