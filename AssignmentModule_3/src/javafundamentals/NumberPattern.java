package javafundamentals;
import java.util.*;
public class NumberPattern {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int i,j;
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=i;j++)
			{
				if(i%3!=0)		
					System.out.print(i+ " ");
			}
			System.out.println();
		}
	}
}
