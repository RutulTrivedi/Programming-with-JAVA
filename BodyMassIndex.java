import java.util.Scanner;

public class BodyMassIndex
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the weight in kg : ");
		double w=sc.nextDouble();

		System.out.print("Enter the height in metres : ");
		double h=sc.nextDouble();

		double bmi=w/(h*h);
		System.out.print("BMI will be "+bmi);
	}
}