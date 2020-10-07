package javafundamentals;
import java.util.*;
public class FindCricketerID {
	public static void findcricketer(int arr[],int n, int score)
	{
		int cricketer[]=new int[n];
		int j=0;
		for(int i=1;i<n;i=i+2)
		{
			if(arr[i]>score)
			{
				cricketer[j]=arr[i-1];
				j=j+1;
			}
		}
		System.out.println("The id of cricketers who score more are: ");
		for(int k=0;k<j;k++)
		{
			System.out.println(cricketer[k]);
		}
			
		
	}
	
	
	
	public static void main(String[] args)
	{
		System.out.println("Enter the size");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if(n<0)
		{
			System.out.println("Invalid Size");
			System.exit(0);
		}
		int arr[]=new int[n];
		System.out.println("Enter the entries..");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			if(arr[i]<0)
			{
				System.out.println("Invalid score");
				System.exit(0);
			}
		}
		System.out.println("Enter the score");
		int score=sc.nextInt();
		if(score<0)
		{
			System.out.println("Invalid Score");
			System.exit(0);
		}
		findcricketer(arr,n,score);
		sc.close();
		
		
	}

}
