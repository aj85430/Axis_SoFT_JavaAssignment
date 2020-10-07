package assignment3;
public class Product_Cons {
	String productCode;
	String productName;
	double productPrice;
	
	Product_Cons(String a, String b, double c)
	{
		productCode=a;
		productName=b;
		productPrice=c;		
	}
	
	void display() {
		System.out.println("Product Code : "+ productCode);
		System.out.println("Product Name : "+ productName);
		System.out.println("Product Price : "+ productPrice);
	}
	
	
	
	
}
