import java.util.Scanner;

public class BinarySearch
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the length of array : ");
		int lenOfArray=sc.nextInt();

		int arr[]=new int[lenOfArray];

		System.out.print("Enter the number you want to search in array : ");
		int sNum=sc.nextInt();

		for(int i=0;i<lenOfArray;i++)
		{
			System.out.print("Enter the "+(i+1)+" element of the array : ");
			arr[i]=sc.nextInt();
		}

		min=arr[0];
		
		boolean isPresent=false;

		for(int i=0;i<lenOfArray;i++)
		{
			for(int j=1;j<lenOfArray;j++)
			{
				if(min>arr[j])
				{
					min=arr[j];
				}
			}
		}

		int lowValue=0;
		int highValue=arr.length()-1;

		while(highValue>=lowValue)
		{
			int mid=(highValue+lowValue)/2;

			if(sNum>arr[mid])
			{
				lowValue=mid+1;
			}
			else if(sNum<arr[mid])
			{
				highValue=mid-1;
			}
			else
			{
				isPresent=true;
				break;
			}
		}

		if(isPresent)
		{
			System.out.print("Yes, number is present.");
		}
		else
		{
			System.out.print("No, number is not present.");
		}
	}
}