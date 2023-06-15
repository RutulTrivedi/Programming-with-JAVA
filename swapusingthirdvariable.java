import java.util.*;

public class swapusingthirdvariable
{
	public static void main(String[] args)
	{
		int a,b,c;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the first number 'a' : ");
		a=sc.nextInt();
		System.out.print("Enter the second number 'b' ");
		b=sc.nextInt();
		c=a;
		a=b;
		b=c;
		System.out.println("New value of 'a' is : "+a);
		System.out.print("New value of 'b' is : "+b);
	}
}