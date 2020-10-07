package exceptionhandling;
//import java.time.*;
import java.text.*;
import java.util.*;

public class TestAgeCalculator1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Date Of Birth");
		String DOB = sc.nextLine();		
		AgeCalculator1 agecalculator = new AgeCalculator1();
		
		try 
		{
			int age = agecalculator.calculateAge(DOB);
			System.out.println(age);
		} 
		catch (ParseException e) 
		{
			System.out.println("Date of Birth should be in dd/mm/yyyy format");
		}
		sc.close();
	}
//sc.close();
	}

