import java.util.*;
import java.lang.*;

public class RightAngledTriangle
{
	public static void main(String[] args)
	{
		double a,b,c,x,y,z;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the first side of triangle : ");
		a=sc.nextDouble();

		System.out.print("Enter the second side of triangle : ");
		b=sc.nextDouble();

		System.out.print("Enter the third side of triangle : ");
		c=sc.nextDouble();

		x=Math.sqrt((b*b)+(c*c));
		y=Math.sqrt((a*a)+(c*c));
		z=Math.sqrt((b*b)+(a*a));

		if((x==a)||(y==b)||(z==c))
		{
			System.out.print("Triangle is Right Angled Triangle.");
		}
		else
		{
			System.out.print("Triangle is not Right Angled Triangle.");
		}
	}
}