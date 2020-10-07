package javafundamentals;
import java.util.*;
public class CircleData {
	public static void main(String[] args) {
		System.out.println("Enter the radius");
		Scanner sc= new Scanner(System.in);
		float radius= sc.nextFloat();
		System.out.println("Enter the output code");
		String code=sc.next();
		double result;
		switch(code)
		{
		case "DIA": 
			result=2*radius;
			System.out.println("Diameter of circle is " + String.format("%.2f",result));
			break;
		
		case "AR": 
			result=3.14*radius*radius;
			System.out.println("Area of circle is " + String.format("%.2f",result) );
			break;
		
		case "PER": 
			result=2*3.14*radius;
			System.out.println("Perimeter of circle is " + String.format("%.2f",result) );
			break;
		case "ARSEM": 
			result=3.14*radius;
			System.out.println("Area of semicircle is " + String.format("%.2f",result) );
			break;
		
		}
		sc.close();
	}

}
