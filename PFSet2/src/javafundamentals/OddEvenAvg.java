package javafundamentals;
import java.util.Scanner;
public class OddEvenAvg {
	public static double avgOddEvenSum(int arr[], int n)
	{
		int even=0,odd=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				even=even+arr[i];
			}
			else {
				odd=odd+arr[i];
		}
		}
		double avg = (double)(even+odd) / 2;		
		return avg;
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid Size");
			System.exit(0);
		}
		System.out.println("Enter the numbers");
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if (arr[i]<0)
			{
				System.out.println("Invalid Input");
				System.exit(0);
			}
		}
		double ans=avgOddEvenSum(arr,n);
		System.out.println("Average is "+ String.format("%.2f", ans));
		sc.close();

	}

}
