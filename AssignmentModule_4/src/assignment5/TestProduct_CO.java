package assignment5;

public class TestProduct_CO {

	public static void main(String[] args) {
		
		Product_CO pd = new Product_CO("Laptop",45000,'T');
		System.out.println(pd.getProductDetails());
		Product_CO pdn = new Product_CO("Laptop",45000);
		System.out.println(pdn.getProductDetails());

	}

}
