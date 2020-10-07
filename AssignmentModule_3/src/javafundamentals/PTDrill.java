package javafundamentals;
import java.util.*;
public class PTDrill {
	public static void main(String[] args) {
		System.out.println("Enter the number of students");
		Scanner sc=new Scanner(System.in);		
		int num=sc.nextInt();
		int row=(int)Math.sqrt(num);
		String arr[][]=new String[row][row]; 
		System.out.println("Enter names");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<row;j++)
			{
				arr[i][j]=sc.next();
			}
		}
		int mid=row/2;
		System.out.print("Middle row:");
		for(int i=0;i<row;i++)
		{			
			for(int j=0;j<row;j++)
			{
				if(i==mid)
				System.out.print(arr[i][j]+" ");				
			}
			
		}
		System.out.println();
		System.out.print("Middle column:");
		for(int i=0;i<row;i++)
		{		
			for(int j=0;j<row;j++)
			{
				if(j==mid)
				System.out.print(arr[i][j]+" ");
				
			}
			
		}
		sc.close();
	}

}