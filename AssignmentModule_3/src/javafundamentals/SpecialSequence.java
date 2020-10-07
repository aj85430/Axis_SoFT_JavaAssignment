package javafundamentals;
import java.util.*;
public class SpecialSequence {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);		
		int n=sc.nextInt();
		int a=2,b=1,c=3;
		int s=0;
		System.out.print(a+" "+b +" "+c +" ");
		while(s<n)
		{
			s=a+b+c;
			if(s>n)
			{
				break;
			}
			
			System.out.print(s +" ");
			a=b;
			b=c;
			c=s;
		}
		sc.close();
	}

}