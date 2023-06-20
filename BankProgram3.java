import java.util.Scanner;

public class BankProgram3
{
	public static void main(String[] args)
	{
		Bank_Account C1=new Bank_Account();

		C1.GetAccountDetails();
		C1.DisplayAccountDetails();
	}
}

class Bank_Account
{
	long Account_No;
	String User_Name;
	String Email;
	String Account_Type;
	double Account_Balance;

	public void GetAccountDetails()
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the Account Number of the Customer : ");
		Account_No=sc.nextLong();

		System.out.print("Enter the Customer Name : ");
		User_Name=sc.next();

		System.out.print("Enter the Email of the customer : ");
		Email=sc.next();

		System.out.print("Enter the Account Type of the customer : ");
		Account_Type=sc.next();

		System.out.print("Enter the Account Balance of the customer : ");
		Account_Balance=sc.nextDouble();
	}

	public void DisplayAccountDetails()
	{
		System.out.println("Account Number : "+Account_No);
		System.out.println("Account Holder Name : "+User_Name);
		System.out.println("Customer Email : "+Email);
		System.out.println("Account Type : "+Account_Type);
		System.out.println("Account Balance : "+Account_Balance);
	}
}