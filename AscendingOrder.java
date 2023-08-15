import java.util.Scanner;

public class AscendingOrder
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

		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}

		System.out.print("Sorted Array : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}