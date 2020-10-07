package com.book;

public class Book 
{
    String bookId;
    String title;
    String author;
    String category;
    float price;
    
	public String getBookId() {
		return bookId;
	}
	
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public Book(){};
	
	public Book(String bookId, String title, String author, String category, float price) 
	{		
		if(bookId.charAt(0) == 'B' && bookId.length() == 4)
		{
			this.bookId = bookId;
		}
		else
		{
			System.out.println("Wrong id");
		}
		
		this.title = title;
		this.author = author;		
		
		if(category.equals("Science") || category.equals("Fiction") || category.equals("Technology") || category.equals("Others"))
		{
			this.category = category;
		}		
		else
		{
			System.out.println("Wrong Category");
		}			
		
		if(price < 0)
		{
			System.out.println("Price can't be negative");
		}			
		else
		{
			this.price = price;
		}		
		
	}
	
}
