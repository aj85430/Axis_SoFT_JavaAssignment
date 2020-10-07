package javafundamentals;
import java.util.*;
public class RepeatedSalaryCount {
	public static void main(String args[])
	{
		System.out.println("Enter the number of employee");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if (num<0)
		{
			System.out.println("Invalid Output");
			System.exit(0);
		}
		System.out.println("Enter the salary");
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();	
			if (arr[i]<0)
			{
				System.out.println("Invalid Output");
				System.exit(0);
			}
		}
		Arrays.sort(arr);
		int c=0;
		for (int i = 1; i <num; i++)
		{
			if(arr[i-1]==arr[i])
			{
				c=c+1;
			}
		}
        c=c+1;		
		System.out.println(c);
		sc.close();
	}

}
