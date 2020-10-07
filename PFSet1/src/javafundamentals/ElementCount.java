package javafundamentals;
import java.util.*;
public class ElementCount {
	public static void findElementCount(int arr[], int n, int x)
	{
		int c=0;
		for(int i=0;i<n;i++)
		{
			if (arr[i]==x)
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
		if (n<0)
		{
			System.out.println("Invalid array size");
			System.exit(0);
		}
		System.out.println("Enter the numbers");
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if (arr[i]<0)
			{
				System.out.println("Invalid input");
				System.exit(0);
			}
		}
		System.out.println("Enter the value to be search");
		int x=sc.nextInt();
		findElementCount(arr,n,x);
		sc.close();
	}

}
