import java.util.Scanner;
import java.lang.Math;

public class Angle
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the hours : ");
		double h=sc.nextDouble();

		System.out.print("Enter the minutes : ");
		double m=sc.nextDouble();

		if(h>=12)
		{
			h=h-12;
		}

		if(m>=60)
		{
			h=h+(m/60);
			m=m%60;
		}

		double angle=Math.abs((30*((m/5)-h)-(0.5*m)));

		System.out.print(angle);
	}
}