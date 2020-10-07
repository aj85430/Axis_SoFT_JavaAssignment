package javafundamentals;
import java.util.*;
public class ProductOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num>32767 || num<0)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		int product=1;
		while(num>0)
		{
			int rem=num%10;
			product=product*rem;
			num=num/10;
		}
		System.out.println("The product of digits of the number is "+ product);
        sc.close();
	}

}
