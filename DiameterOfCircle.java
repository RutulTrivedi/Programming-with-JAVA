import java.util.Scanner;
import java.lang.Math;

public class DiameterOfCircle
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the area of circle : ");
		double area=sc.nextDouble();

		double r=Math.sqrt(area/3.14);

		System.out.print("The diameter of circle is "+(2*r));
	}
}