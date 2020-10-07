package javafundamentals;
import java.util.Scanner;
public class ArithmeticOperation {
	public static void performAO(int a, int b, int c)
	{
		int ans=0;
		if (c==1)
		{
			ans=a+b;
		}
		else if(c==2)
		{
			ans=a-b;
		}
		else if(c==3)
		{
			ans=a*b;
		}
		else if(c==4)
		{
			ans=a/b;
		}
		else
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}
		System.out.println(ans);
	}
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		
		if(a<0 || b<0 || a>32767 || b>32767)
		{
			System.out.println("Invalid Input");
			System.exit(0);
		}		
		performAO(a,b,c);
		sc.close();

	}

}
