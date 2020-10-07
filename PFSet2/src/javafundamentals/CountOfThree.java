package javafundamentals;
import java.util.*;
public class CountOfThree {
	public static void divisibleby3(int arr[], int n)
	{
		int c=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%3==0)
			{
				c=c+1;
			}
		}
		System.out.println(c);
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
		divisibleby3(arr,n);
		sc.close();

	}

}
