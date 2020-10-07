package javafundamentals;
import java.util.*;
public class KaprekarNumber
{ 
	static boolean kaprekar(int n) 
	{ 
		if (n == 1) 
		return true; 
		
		int sq = n*n; 
		int count = 0; 
		while (sq != 0) 
		{ 
			count++; 
			sq /= 10; 
		} 
	
		sq = n*n; 
	
		for (int z=1; z<count; z++) 
		{ 
			int p = (int) Math.pow(10, z); 
	
			if (p == n) 
				continue; 
	
			int sum = sq/p + sq %p; 
			if (sum == n) 
			return true; 
		} 
		return false; 
	} 

	public static void main (String[] args) 
	{ 
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();		
		boolean x= kaprekar(num);
		if(x)
		{
			System.out.println("Karprekar Number");
		}
		else
		{
			System.out.println("Not a Kaprekar Number");
		}
		sc.close();
	} 
} 
