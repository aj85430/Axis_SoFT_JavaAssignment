package javafundamentals;
import java.util.*;
public class Marks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of students");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter marks scored");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int sum=0;
		for (int i = 0; i < arr.length; i++) 
		{
			sum +=  arr[i];
		}
             
		float avg= sum/num;
		System.out.println("Minimum marks: "+ arr[0]);
		System.out.println("Maximum marks: "+ arr[num-1]);
		System.out.println("Average marks: "+ avg);		
        sc.close();
	}

}
