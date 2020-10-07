package com.bookutil;

import java.util.*;

import com.book.*;


public class BookUtil {

	public static void main(String[] args) 
	{
		BookStore bookstore = new BookStore();
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("-------------------------------------------------------------");
			System.out.println("Choose Any Option\n 1: Add Book\n 2: Search By Title\n 3: Search By Author\n 4: Display All\n 5: Display Book\n 6: Update Book\n 7: Exit");
			System.out.println("-------------------------------------------------------------");
			int input = sc.nextInt();
			sc.nextLine();
			switch(input) 
			{
			case 1:				 
				System.out.println("Enter BookId: ");
				String bookId = sc.nextLine();
				System.out.println("Enter Title: ");
				String title = sc.nextLine();
				System.out.println("Enter Author: ");
				String author = sc.nextLine();
				System.out.println("Enter Category: ");
				String category = sc.nextLine();
				System.out.println("Enter Price: ");
				float price = sc.nextFloat();
				Book book = new Book(bookId, title, author, category, price);
				if(!(book.getCategory() == null || book.getPrice() == 0.0 || book.getBookId() == null))
				{
					bookstore.addBook(book);
					System.out.println("Thank You, Book Added");
				}
				else
					System.out.println("No Book Added");
				break;

			case 2:
				System.out.println("Enter the Title to be searched: ");
				String search = sc.nextLine();
				bookstore.searchByTitle(search);
				break;

			case 3:
				System.out.println("Enter the Author to be searched: ");
				String search1 = sc.nextLine();
				bookstore.searchByAuthor(search1);
				break;

			case 4:
				bookstore.displayAll();
				break;

			case 5:
				System.out.println("Enter the Book ID to be searched: ");
				String search2 = sc.nextLine();
				bookstore.displayBook(search2);
				break;

			case 6:
				System.out.println("Enter the Book ID to be updated: ");
				String update = sc.nextLine();
				bookstore.updateBook(update);
				break;

			case 7:
				System.out.println("Thank You");
				System.exit(0);
			default:
				System.out.println("Wrong Option");
			}
		}
	}	

}


