package javafundamentals;
import java.util.Scanner;
public class SumOfOddDigits {
	public static void sumOddDigits(int n)
	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;
			if(rem%2!=0)
			{
				sum=sum+rem;
						
			}
			n=n/10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		if(n<0 || n>32767)
		{
			System.out.println("Invalid number");
			System.exit(0);
		}
	
		sumOddDigits(n);
		sc.close();
	}

}
