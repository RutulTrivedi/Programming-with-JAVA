import java.util.*;

public class SecondsToTime
{
	public static void main(String[] args)
	{
		int sec,min,hr;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the time in seconds : ");
		sec=sc.nextInt();

		min=sec/60;
		sec=sec%60;

		hr=min/60;
		min=min%60;

		System.out.print(hr+"hr:"+min+"min:"+sec+"sec");
	}
}