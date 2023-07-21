import java.util.Scanner;

public class SquareUsingRecursion
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number : ");
		int n=sc.nextInt();

		Square num=new Square();

		num.Calc_Square(n);
	}
}

class Square
{
	static int i=1;
	static int ans=0;
	public static void Calc_Square(int a)
	{
		if(i==a)
		{
			ans+=a;
			System.out.print(ans);
		}
		else
		{
			i++;
			ans+=a;
			Calc_Square(a);
		}
	}
}