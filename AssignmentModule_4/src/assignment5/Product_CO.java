package assignment5;

public class Product_CO {

	private String productCode;
	private String productName;
	private double productPrice;
	private char categoryCode;
	
	private static int prodCounter = 100;

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public char getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(char categoryCode) {
		this.categoryCode = categoryCode;
	}

	public static int getProdCounter() {
		return prodCounter;
	}

	public static void setProdCounter(int prodCounter) {
		Product_CO.prodCounter = prodCounter;
	}
	
	private String generateProductCode()
	{
		String code = ""+categoryCode+prodCounter;
		prodCounter++;
		return code;
	}
	
   public Product_CO(String productName, int productPrice, char categoryCode) {
		
		this.productName = productName;
		this.productPrice = productPrice;
		this.categoryCode = categoryCode;
		productCode = generateProductCode();
		
	}
	
	public Product_CO(String productName, int productPrice) {
		
		this.productName = productName;
		this.productPrice = productPrice;
		categoryCode = 'E';
		productCode = generateProductCode();
		
	}
	
	public String getProductDetails() {
		return "Product: Code - " + productCode + ", Name - " + productName + ", Price - " + productPrice + ", Category - " +categoryCode;
	}
	
}
