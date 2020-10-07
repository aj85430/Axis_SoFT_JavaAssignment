package javafundamentals;
import java.util.Scanner;
public class MultiplesAverage{
	public static void findavgby5(int n)
	{
		int c=0;
		int sum=0;
		for(int i=5;i<=n;i=i+5)
		{
			sum=sum+i;
			c=c+1;
		}
		float ans= (float)sum/c;
		
		System.out.println(ans);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n<0 || n>32767)
		{
			System.out.println("Invalid Size");
			System.exit(0);
		}
		findavgby5(n);
		sc.close();

	}

}
