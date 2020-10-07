package javafundamentals;
import java.util.*;
public class CalculateSalary {
	public static int CalculateSal(int salary, int shifts){ 
  	  int value;
        if(salary>8000)
        { System.out.println("Salary too large");
             return 0;
         }
        else if(shifts<0)
      	  {System.out.println("Shifts too small");
            return 0;}
        else if(salary<0)
        { System.out.println("Salary too small");
            return 0;}
        else
      	  {
      	   value = (salary + shifts*(salary*2)/100 - (salary*30)/100 - (salary*20)/100 );
      	   return value;
      	  }     
         }      
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary");
		int salary=sc.nextInt();
		System.out.println("Enter the shifts");
		int shifts=sc.nextInt();
		int s= CalculateSal(salary,shifts);
		System.out.println(s);
		sc.close();
				
	}

}
