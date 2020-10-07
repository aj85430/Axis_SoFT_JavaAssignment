package javafundamentals;
import java.util.*;
public class DigitFactorial {
	
	public static int fact(int n)
	{
		if(n==0)
			return 1;
		else
			return(n*fact(n-1));
	}
	public static void digitfact(int n)
    {
         int c=0;
         int t=n;
         while(n!=0)
         {
               c++;
              n=n/10;
         }
         int arr[]= new int[c];
         for(int i=arr.length -1;i>=0;i--)
          { 
               int rem=t%10;
               arr[i]=fact(rem);
               t=t/10;
          }
          for(int a:arr)
               System.out.println(a);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		if(num<0)
		{
			System.out.println("Number too small");
			System.exit(0);
		}
		if(num>32767)
		{
			System.out.println("Number too big");
			System.exit(0);
		}
	  digitfact(num);		
     sc.close();
	}

}
