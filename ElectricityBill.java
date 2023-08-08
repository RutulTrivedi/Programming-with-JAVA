import java.util.*;

public class ElectricityBill
{
	public static void main(String[] args)
	{
		double u,bill=0,nbill=0;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the number of units : ");
		u=sc.nextDouble();

		if(u<=50)
		{
			bill=u*0.50;
		}
		else if(u<=150)
		{
			bill=(50*0.50)+((u-50)*0.75);
		}
		else if(u<=250)
		{
			bill=(50*0.50)+(100*0.75)+((u-150)*1.20);
		}
		else
		{
			bill=(50*0.50)+(100*0.75)+(100*1.20)+((u-250)*1.50);
		}

		nbill=bill+(0.20*bill);

		System.out.print("The total bill is "+nbill);
	}
}