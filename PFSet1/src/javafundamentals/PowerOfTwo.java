package javafundamentals;
import java.util.*;
public class PowerOfTwo {
	 static boolean powerofTwo(int n)
	    {
	        if (n == 0)
	            return false;
	         
	        while (n != 1)
	        {
	            if (n % 2 != 0)
	                return false;
	            n = n / 2;
	        }
	        return true;
	    }
	 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number");
		int num=sc.nextInt();
		if(num<0 || num>32767)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		if (powerofTwo(num))
            System.out.println("Yes");
        else
            System.out.println("No");
		
		sc.close();
	}
}