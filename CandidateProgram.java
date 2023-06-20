import java.util.Scanner;

public class CandidateProgram
{
	public static void main(String[] args)
	{
		
		Candidate obj=new Candidate();

		obj.GetCandidateDetails();
		obj.DisplayCandidateDetails();
	}
}

class Candidate
{
	int Candidate_ID;
	String Candidate_Name;
	int Candidate_Age;
	double Candidate_Weight;
	double Candidate_Height;

	public void GetCandidateDetails()
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the ID of the Candidate : ");
		Candidate_ID=sc.nextInt();

		System.out.print("Enter the name of the Candidate : ");
		Candidate_Name=sc.nextLine();

		System.out.print("Enter the age of the Candidate : ");
		Candidate_Age=sc.nextInt();

		System.out.print("Enter the weight of the Candidate : ");
		Candidate_Weight=sc.nextDouble();

		System.out.print("Enter the height of the Candidate : ");
		Candidate_Height=sc.nextDouble();
	}

	public void DisplayCandidateDetails()
	{
		System.out.println("ID : "+Candidate_ID);
		System.out.println("Name : "+Candidate_Name);
		System.out.println("Age : "+Candidate_Age);
		System.out.println("Weight : "+Candidate_Weight);
		System.out.println("Height : "+Candidate_Height);
	}
}