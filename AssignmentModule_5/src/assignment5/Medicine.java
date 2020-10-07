package assignment5;

abstract class Medicine {

	int price;
	String expiryDate;
	
	abstract void displayLabel();
	
	public void getDetails()
	{
		System.out.println("Price : "+ price);
		System.out.println("Expiry Date : "+ expiryDate);
	}
	
}

class Tablet extends Medicine
{
	@Override
	void displayLabel()
	{
		System.out.println("store in a cool and dry place");
	}
}

class Syrup extends Medicine
{
	@Override
	void displayLabel()
	{
		System.out.println("close the bottle lightly");
	}
}

class Ointment extends Medicine
{
	@Override
	void displayLabel()
	{
		System.out.println("for external use only");
	}
}