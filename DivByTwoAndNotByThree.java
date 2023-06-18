import java.util.Scanner;

public class DivByTwoAndNotByThree
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter the first smaller number : ");
		int a=sc.nextInt();
		System.out.println("Enter the second larger number : ");
		int b=sc.nextInt();

		System.out.print("The numbers between "+a+" and "+b+" divisible by 2 and not by 3 are : \t");
		if(a<b)
		{
			for(int i=a+1;i<b;i++)
			{
				if(i%2==0 && i%3!=0)
				{
					System.out.print(i+" ");
				}
			}
		}
		else
		{
			System.out.print("Incorrect number input!!");
		}
	}
}