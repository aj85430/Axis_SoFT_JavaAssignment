package javafundamentals;
import java.util.*;
public class ClassRooms {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter C1 capacity");
		int c1=sc.nextInt();
		System.out.println("Enter C2 capacity");
		int c2=sc.nextInt();
		System.out.println("Enter C3 capacity");
		int c3=sc.nextInt();
		System.out.println("Enter the number of students");
		int num=sc.nextInt();
		int c=0;
		if (num<=c1)
			c=c+1;
		if (num<=c2)
			c=c+1;
		if (num<=c3)
			c=c+1;
		System.out.println(c + " labs can accommodate the students");
		sc.close();
		
	}

}
