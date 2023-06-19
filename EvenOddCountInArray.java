import java.util.Scanner;

public class EvenOddCountInArray
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number of elements in an array : ");
		int n=sc.nextInt();

		int arr[]=new int[n];
		int ec=0,oc=0;

		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the "+(i+1)+" element of the array : ");
			arr[i]=sc.nextInt();

			if(arr[i]%2==0)
			{
				ec+=1;
			}
			else
			{
				oc+=1;
			}
		}

		System.out.print("\nTotal even numbers in array : "+ec+"\t Total odd numbers in array : "+oc);
	}
}
