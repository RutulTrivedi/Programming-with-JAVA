import java.util.Scanner;

public class Result
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int m[]=new int[5],total=0;

		for(int i=0;i<5;i++)
		{
			System.out.print("Enter the marks of "+(i+1)+" subject : ");
			m[i]=sc.nextInt();
			total+=m[i];
		}

		float per=((float)total/500)*100;

		if(per>=70)
		{
			System.out.print("Percentage : "+per+" and Result is Distinction.");
		}
		else if(per>=60)
		{
			System.out.print("Percentage : "+per+" and Result is First Class.");
		}
		else if(per>=45)
		{
			System.out.print("Percentage : "+per+" and Result is Second Class.");
		}
		else if(per>=35)
		{
			System.out.print("Percentage : "+per+" and Result is Third Class.");
		}
		else
		{
			System.out.print("Percentage : "+per+" and Result is Fail.");
		}
	}
}