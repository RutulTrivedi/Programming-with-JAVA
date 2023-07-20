import java.util.Scanner;

public class HigherThanAvgOfArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the length of array : ");
		int n=sc.nextInt();

		int a[]=new int[n];
		int sum=0,count=0;
		double avg;

		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the "+(i+1)+" element of the array : ");
			a[i]=sc.nextInt();
			sum+=a[i];
		}

		avg=(double)sum/n;

		for(int i=0;i<n;i++)
		{
			if(a[i]>=avg)
			{
				count++;
			}
		}
		System.out.print("The number greater than average of the array are "+count+".");
	}
}