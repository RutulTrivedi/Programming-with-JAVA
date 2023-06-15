import java.util.*;

public class simpleinterest
{
	public static void main(String[] args)
	{
		double p,r,t,si;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the amount : ");
		p=sc.nextDouble();

		System.out.print("Enter the rate of interest : ");
		r=sc.nextDouble();

		System.out.print("Enter the time period(in years) : ");
		t=sc.nextDouble();

		si=(p*r*t)/100;
		System.out.print("Simple interest will be "+si);
	}
}