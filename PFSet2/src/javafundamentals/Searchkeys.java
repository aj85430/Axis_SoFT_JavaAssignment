package javafundamentals;
import java.util.*;
public class Searchkeys {
		public static void searchkeys(int arr[], int n, int k)
		{
			int c=0;
			for(int i=0;i<n;i++)
			{
				if(arr[i]==k)
				{
					System.out.println(i);
					c=c+1;
				}
			}
			if(c==0)
			System.out.println("No key found");
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
			System.out.println("Enter the number to be search");
			int k=sc.nextInt();
			searchkeys(arr,n,k);
			sc.close();

		}

	}


