package javafundamentals;
import java.util.*;
public class CalcElecBill {
	
	public static void main(String args[])
	{
		System.out.println("Enter the previous reading");
		Scanner sc= new Scanner(System.in);
		int prev_read= sc.nextInt();
		System.out.println("Enter the current reading");
		int curr_read= sc.nextInt();
		int reading=curr_read-prev_read;
		double unit=0;
		if (reading<=30)
		{
			unit=reading * 2.30;
		}
		else if(reading>30 && reading<=100)
		{
			unit= 30*2.30 + (reading-30)*3.50;
		}
		else if(reading>100)
		{
			unit= 30*2.30 + 70*3.50 + (reading-100)*4.60;
		}
		System.out.println("Bill amount is "+ String.format("%.2f", unit));
		sc.close();
				
	}

}
