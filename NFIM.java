import java.util.Scanner;
public class NFIM {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter n: ");
		int n = sc.nextInt();
		System.out.print("Enter the value of x to be find: ");
		int x = sc.nextInt();
		
		double arrOfTable[][] = new double[2*n-1][n+1];
		
		for(int i=0;i<2;i++) {
			int temp = 0;
			boolean tmp = false;
			if(i==1) {
				tmp = true;
			}
			for(int j=0;j<2*n-1;j++) {
				if(j%2==0) {
					arrOfTable[j][i] = getValues(temp,tmp);
					temp++;
				}
				else {
					arrOfTable[j][i] = 0;
				}
			}
		}
		
		for(int j=2;j<n+1;j++) {
			int rs=j-1,rf=2*n-1-j;
			for(int i=rs;i<=rf;i++) {
				arrOfTable[i][j] = arrOfTable[i+1][j-1] - arrOfTable[i-1][j-1];
			}
			rs++;
			rf--;
		}
		System.out.println("\n------------------------------------------------------------------------------");
		System.out.print("       x            f(x)            ");
		for(int i=1;i<n;i++){
			System.out.print("del(y"+i+")         ");
		}
		System.out.print("\n------------------------------------------------------------------------------");
		System.out.println();		
		for(int i=0;i<2*n-1;i++) {
			for(int j=0;j<n+1;j++) {
				try{
					Thread.sleep(50);
				}
				catch(Exception e){
					//something...
				}
				System.out.print(String.format("%10.4f",arrOfTable[i][j])+"\t");
			}
			System.out.println("\n");
		}

		double p=1.0;
		double ans=arrOfTable[0][1];
		double temp=(x-arrOfTable[0][0])/(arrOfTable[2][0]-arrOfTable[0][0]);
		int fact=1;
		for(int i=1;i<n;i++){
			fact=fact*i;
			p=p*(temp-i+1)/fact;
			ans=ans+(p*arrOfTable[i][i+1]);
		}
		String str="Calculating the answer...";
		for(int i=0;i<25;i++){
			System.out.print(str.charAt(i));
			try{
				Thread.sleep(100);
			}
			catch(Exception e){
				//something...
			}
		}
		System.out.print("\n------------------------------------------------------------------------------");
		System.out.print("\n------------------------------------------------------------------------------");
		System.out.println("\n\nAnswer for given argument of x is : "+ans);
	}
	
	static double getValues(int n,boolean x){
		Scanner sc = new Scanner(System.in);
		if(x==false) {
			System.out.print("Enter value of X"+(n)+" : ");
		}
		else {
			System.out.print("Enter value of Y"+(n)+" : ");
		}
		return sc.nextDouble();
	}
}

