package javafundamentals;
import java.util.*;
public class LargestArray {
	public static void largeArr(int arr1[],int arr2[],int n)
	{
	     int arr[]= new int[n];
	      for(int i=0;i<n;i++)
	       {
	             if(arr1[i]>arr2[i])
	                arr[i]=arr1[i];
	             else
	                arr[i]=arr2[i]; 
	}   
	      for(int a:arr)
	        {
	        	
	        	System.out.println(a);
	    
	        } 
	}

	public static void main(String[] args)
	{
		    System.out.println("Enter the size");
			Scanner sc=new Scanner(System.in);		
			int n=sc.nextInt();
			if(n<=0)
			{
			    System.out.println("Invalid size");
			    System.exit(0);
			}
	        int arr1[]=new int[n]; 
	        int arr2[]=new int[n]; 

	        System.out.println("Enter the numbers");
	        for(int i=0;i<n;i++)
	        {
	        	arr1[i]=sc.nextInt();
	        	if(arr1[i]<0)
	        	{
	        	System.out.println("Invalid input");
	        	System.exit(0);
	        	}
	        }   
	        for(int i=0;i<n;i++)
	        {
	        	arr2[i]=sc.nextInt();
	        	if(arr2[i]<0)
	        	{
	        	System.out.println("Invalid input");
	        	System.exit(0);
	        	}
	        }      
	          largeArr(arr1,arr2,n);
	          sc.close();
	     }   	        
}
