package javafundamentals;
import java.util.*;
public class CricketRunRate {

	public static void main(String[] args) {
		
		System.out.println("Enter the number of overs bowled so far");
	    Scanner sc= new Scanner(System.in);
	    int over= sc.nextInt();
	    System.out.println("Enter the current runrate");
	    float runrate= sc.nextFloat();
	    System.out.println("Enter the target score");
	    int target= sc.nextInt();
	    float req_runrate;
	    req_runrate= (target- (runrate*over))/(50-over);
	    System.out.println("Required run rate is " + String.format("%.2f", req_runrate));
	    sc.close();
	    

	}

}
