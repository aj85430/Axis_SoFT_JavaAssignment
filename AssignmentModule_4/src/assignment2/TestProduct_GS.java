package assignment2;

public class TestProduct_GS {

	public static void main(String[] args) {
		Product_GS pd= new Product_GS();
		pd.setProductCode("P101");
		pd.setProductName("Laptop");
		pd.setProductPrice(45000.00);
		System.out.println("Product Code : "+ pd.getProductCode());
		System.out.println("Product Name : "+ pd.getProductName());
		System.out.println("Product Price : "+ pd.getProductPrice());
		
		

	}

}
