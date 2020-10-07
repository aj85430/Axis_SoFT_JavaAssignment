package javafundamentals;
import java.util.*;
public class ProfitLoss {
	public static void main(String[] args) {
		System.out.println("Enter the number of dozens of eggs purchased");
		Scanner sc =new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("Enter the price per dozen");
		int y=sc.nextInt();
		System.out.println("Enter the selling price of 1 egg");
		int z=sc.nextInt();
		int tcp= x*y;
		int tsp= (x*12)*z;
		int profit=tsp-tcp;
		float ans= (float)(profit*100)/(tcp);
		System.out.println("Percentage profit is "+String.format("%.2f", ans));
	    sc.close();
	}
}
