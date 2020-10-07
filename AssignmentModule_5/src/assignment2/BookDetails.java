package assignment2;

import java.util.*;
public class BookDetails {

	public static void main(String[] args) {
		//Book book=new Book();
		Scanner sc=new Scanner(System.in);
		
		EngineeringBook engibook= new EngineeringBook();
		
		System.out.println("Enter the book No");
		engibook.setBookNo(sc.nextInt());
		System.out.println("Enter the book title");
		engibook.setTitle(sc.next());
		System.out.println("Enter the book author");
		engibook.setAuthor(sc.next());
		System.out.println("Enter the book price");
		engibook.setPrice(sc.nextFloat());
		//System.out.println("Enter the book category");		
		
		
		
		
		System.out.println(engibook.getBookNo());
		System.out.println(engibook.getTitle());
		System.out.println(engibook.getAuthor());
		System.out.println(engibook.getPrice());
		//System.out.println(engibook.getCategory());
	
		sc.close();
		

	}

}
