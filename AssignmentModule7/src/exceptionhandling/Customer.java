package exceptionhandling;

public class Customer {
	
	private String custNo;
	private String custName;
	private String category;	
	
	 Customer() {};
	 Customer(String custNo, String custName, String category) throws InvalidInputException
	{ 
		
		this.custNo=custNo;
		this.custName=custName;
		this.category=category;
		
		if(!(custNo.charAt(0) == 'C' || custNo.charAt(0) == 'c' ))
		{
			throw new InvalidInputException();
		}
		
		if(custName.length() != 4)
		{
			throw new InvalidInputException();
		}
			
		if(!(category.equals("Platinum") || category.equals("Gold") || category.equals("Silver")))
		{
			throw new InvalidInputException();
		}
			
	}
	
	public String getCustNo() {
		return custNo;
	}
	
	public String getCustName() {
		return custName;
	}
	
	public String getCategory() {
		return category;
	}
}

class InvalidInputException extends Exception{}
