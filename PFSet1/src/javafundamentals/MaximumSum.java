package javafundamentals;
import java.util.*;
public class MaximumSum {
	public static void maxsum(int arr[], int n)
	{
		int max=0,min=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				max=max+arr[i];
			}
			else
			{
				min=min+arr[i];
			}
		}
		if(max>=min)
			System.out.println(max);
		else
			System.out.println(min);
	}

	public static void main(String[] args)
	{
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the size");
	   int n=sc.nextInt();
	   if (n<0)
		{
			System.out.println("Invalid array size");
			System.exit(0);
		}
	   System.out.println("Enter the entries");
	   int arr[]=new int[n];
	   for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();	
			if (arr[i]<0)
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
		}
	   maxsum(arr, n); 
	   sc.close();
	}

}
