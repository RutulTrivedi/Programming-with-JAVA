import java.util.*;

public class SwapWithoutUsingThirdVariable
{
	public static void main(String[] args)
	{
		int a,b;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the first number 'a' : ");
		a=sc.nextInt();
		System.out.print("Enter the second number 'b' : ");
		b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("New value of 'a' will be : "+a);
		System.out.print("New value of 'b' will be : "+b);
	}
}