package exceptionhandling;
//import java.util.*;

public class ExceptionTest 
{
     public static void main(String[] args) { 		
			
		try 
		{
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			float divide = (float) a/b;
			System.out.println(divide);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("No Input Received");
		}
		catch(NumberFormatException e) {
			System.out.println("Only integers are allowed");
		}
		catch(ArithmeticException e) {
			System.out.println("Divsion with zero is not possible");
		}
		
		
		
		

	}

}
