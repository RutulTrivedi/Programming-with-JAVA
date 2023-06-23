import java.util.Scanner;

public class TimeDate
{
	public static void main(String[] args)
	{
		Time t1=new Time();
		Time t2=new Time();

		t1.Scan_Time();
		t2.Scan_Time();

		t1.Add(t1,t2);	
	}
}

class Time
{
	int hr,min;

	public void Scan_Time()
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the hours : ");
		hr=sc.nextInt();

		System.out.print("Enter the minutes : ");
		min=sc.nextInt();
	}

	public void Add(Time t1, Time t2)
	{
		int h,m;
		h=t1.hr+t2.hr;
		m=t1.min+t2.min;

		h=h+(m/60);
		m=m%60;

		System.out.print(h+"hrs:"+m+"min");
	}
}