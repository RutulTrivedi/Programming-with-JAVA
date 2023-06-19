import java.util.Scanner;

public class LinearSearch
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number of elements in an array : ");
		int n=sc.nextInt();

		int arr[]=new int[n],i=0;

		while(i!=n)
		{
			System.out.print("Enter the "+(i+1)+" element of the array : ");
			arr[i]=sc.nextInt();

			i++;
		}

		System.out.print("Enter the number of you want to search in the array : ");
		int no=sc.nextInt();

		for(i=0;i<n;i++)
		{
			if(no==arr[i])
			{
				System.out.print("Number found!!");
				return;
			}
		}

		System.out.print("Number not found!!");
	}
}