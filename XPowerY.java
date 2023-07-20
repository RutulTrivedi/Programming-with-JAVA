import java.util.Scanner;

public class XPowerY

{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Power ob=new Power();

		System.out.print("Enter the base : ");
		int x=sc.nextInt();

		System.out.print("Enter the power : ");
		int y=sc.nextInt();

		int ans=ob.Calc_Power(x,y);

		System.out.print("Answer will be : "+ans);
	}
}

class Power
{
	public int Calc_Power(int x,int y)
	{
		if(y==1)
		{
			return x;
		}
		else
		{
			return x*Calc_Power(x,y-1);
		}
	}
}