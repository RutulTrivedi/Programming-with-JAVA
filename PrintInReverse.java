import java.util.Scanner;

public class PrintInReverse
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the length of array : ");
		int n=sc.nextInt();

		int a[]=new int[n];

		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the "+(i+1)+" element of the array : ");
			a[i]=sc.nextInt();
		}

		System.out.print("The reversed array will be : ");
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}
	}
}