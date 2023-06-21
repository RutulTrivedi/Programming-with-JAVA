import java.util.Scanner;

public class ComplexNumber
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Complex n1=new Complex(1,2);
		Complex n2=new Complex(2,3);
		Complex ansNum=new Complex();

		n1.printNumber();
		n2.printNumber();
		System.out.println("Before Addition");
		ansNum.printNumber();

		ansNum.r=n1.sumOfNum(n1.r,n2.r);
		ansNum.i=n1.sumOfNum(n1.i,n2.i);

		System.out.println("After Addition");
		ansNum.printNumber();		
	}
}

class Complex
{
	int r,i;

	Complex()
	{
		r=0;
		i=0;
	}

	Complex(int a,int b)
	{
		r=a;
		i=b;
	}

	public void printNumber()
	{
		System.out.println("Real Part : "+r);
		System.out.println("Imaginary Part : "+i);
	}

	public int sumOfNum(int a,int b)
	{
		return a+b;
	}
}