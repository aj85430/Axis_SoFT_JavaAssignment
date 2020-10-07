package exceptionhandling;

import java.util.*;

public class TestCustomer {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
		
        System.out.println("Enter the customer id");
		String custNo = sc.nextLine();
		System.out.println("Enter the customer name");
		String custName = sc.nextLine();
		System.out.println("Enter the customer category");
		String category = sc.nextLine();
		
		try 
		{
			Customer customer = new Customer(custNo, custName, category);
			System.out.println("Customer Number: "+customer.getCustNo()+"\nCustomer Name: "+customer.getCustName()+"\nCategory: "+customer.getCategory());
		}
		catch(InvalidInputException e) {
			System.out.println("Wrong Details. Try Again.");
		} 
      sc.close();
	}

}
