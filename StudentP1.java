import java.util.Scanner;

public class StudentP1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();

		System.out.println(s1.EnrNo);
		System.out.println(s1.Name);
		System.out.println(s1.isBoy);
		System.out.println(s1.marks);
	}
}

class Student
{
	int EnrNo;
	String Name;
	boolean isBoy;
	int marks;
	
	Student()
	{
		EnrNo=1001;
		Name="xyz abc";
		isBoy=true;
		marks=100;
	}
}