package javafundamentals;
import java.util.*;
public class FahrenToCenti {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the fahrenheit degree");
		int fah=sc.nextInt();
		if (fah<0)
		{
			System.out.println("Invalid input");
			System.exit(0);
		}
		float cen= ((fah-32)*5)/9;
		System.out.println("The centigrade degree is " + String.format("%.2f", cen));
		sc.close();
	}

}
