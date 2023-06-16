import java.util.*;
import java.lang.*;

public class RootsOfEquation
{
	
	public static void main(String[] args)
	{
		int a,b,c;
		double d,x1,x2;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the value of 'a' : ");
		a=sc.nextInt();

		System.out.print("Enter the value of 'b' : ");
		b=sc.nextInt();

		System.out.print("Enter the value of 'c' : ");
		c=sc.nextInt();

		d=((double)b*b)-(4*a*c);
		d=Math.sqrt(d);

		x1=(-b-d)/(2*a);
		x2=(-b+d)/(2*a);

		System.out.println("First root of the equation is "+x1);
		System.out.print("Second root of the equation is "+x2);
	}
}