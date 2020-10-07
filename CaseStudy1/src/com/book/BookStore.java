package com.book;

import java.util.*;

public class BookStore
{
    Book book[]=new Book[100];
    
    int c=0;
    
    public void addBook(Book b)
    {
    	book[c]=b;
    	c=c+1;
    }
    
    public void searchByTitle(String title)
    {
    	boolean flag = false;
		for(int i = 0; i < c; i++)
		{
			if(book[i].title.equals(title))
			{
			  System.out.println("BookId: "+book[i].bookId+"\nTitle: "+book[i].title+"\nAuthor: "+book[i].author+"\nCategory: "+book[i].category+"\nPrice: "+book[i].price);
			  flag= true;
			  break;
			}
		}
		if(!flag)
		{
			System.out.println("Book Not Found");
		}			
    }
    
    public void searchByAuthor(String author)
    {
    	boolean flag = false;
		for(int i=0;i<c;i++)
		{
			if(book[i].author.equals(author))
			{
			  System.out.println("BookId: "+book[i].bookId+"\nTitle: "+book[i].title+"\nAuthor: "+book[i].author+"\nCategory: "+book[i].category+"\nPrice: "+book[i].price);
			  flag= true;
			  break;
			}
		}
		if(!flag)
		{
			System.out.println("Book Not Found");
		}	
    }
    
    public void displayAll()
    {
    	for(int i=0;i<c;i++) 
    	{
			System.out.println("Book"+(i+1)+"------");
			System.out.println("BookId: "+book[i].bookId+"\nTitle: "+book[i].title+"\nAuthor: "+book[i].author+"\nCategory: "+book[i].category+"\nPrice: "+book[i].price);
		}
    }
    
    public void displayBook(String bookId)
    {
    	for(int i=0;i<c;i++) 
    	{
			if(book[i].bookId.equals(bookId)) {
				System.out.println("BookId: "+book[i].bookId+"\nTitle: "+book[i].title+"\nAuthor: "+book[i].author+"\nCategory: "+book[i].category+"\nPrice: "+book[i].price);
				break;
			}
		}
    }
    
     public void updateBook(String bookId)
     {		
		int index= 0;
		for(int i=0;i<c;i++) 
		{
			if(book[i].bookId.equals(bookId))
			{
				index = i;
			}
	    }
		
		Scanner sc = new Scanner(System.in);
		int update = 0;
		while(update != 5) 
		{		
			System.out.println("Choose what you want to update\n 1: Title \n 2: Author\n 3: Category\n 4: Price\n 5: Exit");
			update = sc.nextInt();
			switch(update)
			{
			case 1:
				System.out.println("Enter The New Title: ");
				sc.nextLine();
				book[index].title = sc.nextLine();
				break;
			case 2:
				System.out.println("Enter The New Author: ");
				sc.nextLine();
				book[index].author = sc.nextLine();
				break;
			case 3:
				System.out.println("Enter The New Category: ");
				sc.nextLine();
				book[index].category = sc.nextLine();
				break;
			case 4:
				System.out.println("Enter The New Price: ");
				book[index].price = sc.nextInt();
				break;
			case 5:
				System.out.println("Thanks");
				break;
			default:
				System.out.println("Wrong Option");
			}
			sc.close();
		}		
	}
	
		
 }
    

