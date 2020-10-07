package javafundamentals;
import java.util.*;
public class DecimalConversion {
		 static int convertToDecimal(int n)
		    {
		        int num = n;
		        int dec= 0;
		        int base = 1;		 
		        int t = num;
		        while (t > 0) {
		            int rem = t % 10; 
		            dec += rem * base;		 
		            base = base * 2;
		            t=t/10;
		        }
		       return dec;
		    }
		
		    public static void main(String[] args)
		    {
		       Scanner sc=new Scanner(System.in);
		       System.out.println("Enter the binary value");
		       int n=sc.nextInt();
		       if(n<0 || n>11111)
		       {
		    	   System.out.println("Invalid Input");
		    	   System.exit(0);
		       }
		       System.out.println(convertToDecimal(n));
		       sc.close();
		    }
		}
	


