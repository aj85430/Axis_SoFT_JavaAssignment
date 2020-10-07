package assignment1;

public class Customer {
	
	private String customerName;
    Address residentialAddress;
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Address getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(Address residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
    
    Customer()
    {
    }
    
    Customer(String customerName, Address residentialAddress)
    {
    	this.customerName = customerName;
    	this.residentialAddress = residentialAddress;
    }
    
    public String getCustomerDetails()
    {
    	return ("Customer : "+ getCustomerName()+ "\n"+ "Residential Address : "+ getResidentialAddress());
    }
    
}
