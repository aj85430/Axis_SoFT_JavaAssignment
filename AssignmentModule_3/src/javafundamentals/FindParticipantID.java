package javafundamentals;
import java.util.*;
public class FindParticipantID {

	public static void main(String[] args) {
		System.out.println("Enter the number of participants");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println("Enter the ID's");
		int arr[]=new int[num];
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter ID to search");
		int id=sc.nextInt();
		if (id==0)
		{
			System.out.println("Program terminated");
			System.exit(0);
		}		   
		
		while(id!=0)
        {
        	int flag=0;
        	for(int i=0;i<num;i++)
            {
            	if(id==arr[i])
            	{
            		flag=1;
            		System.out.println("participant with id "+ id+ " exists");
            		break;            		
            	}
            }
        	if(flag==0)
        	{
        	System.out.println("participant with id "+ id+ " does not exists");
        	}
        	System.out.println("Enter id to search");
        	id=sc.nextInt();
        }
		sc.close();
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		