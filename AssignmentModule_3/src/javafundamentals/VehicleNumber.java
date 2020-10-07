package javafundamentals;
import java.util.*;
public class VehicleNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		System.out.println("Enter the first number");
		int a=sc.nextInt();
		System.out.println("Enter the second number");
		int b=sc.nextInt();
		for(int i=a;i<=b;i++)
		{			
		    a=i;
			int sum = 0; 
		    while (a != 0) 
		    { 
		     sum = sum + a % 10; 
		     a = a/10; 
		    }  
			
            if(sum==9)
            {
            	
            	System.out.println("Vehicle number is "+i);
            }

		}
		sc.close();
	}

}