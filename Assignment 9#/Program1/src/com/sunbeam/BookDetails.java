package com.sunbeam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

enum Category{
	Mystery,
	Novel,
	HistoricalFiction
};

public class BookDetails {

	private	String isbn;
	private Category category;
	private	double price;
	private	String authorName;
	private	int quantity;

		
	
	public BookDetails(String isbn,Category category, double price, String authorName,int quantity){
			this.isbn = isbn;
			this.category = category;
			this.price = price;
			this.authorName = authorName;
			this.quantity = quantity;
		}
	
		
		
		public String getIsbn() {
			return isbn;
		}
		
		public Category getCategory() {
			return category;
		}
		
		public double getPrice() {
			return price;
		}
		
		public String getAuthorName() {
			return authorName;
		}
		
		public int getQuantity() {
			return quantity;
		}
		
		@Override
		public String toString() {
			return "ISBN:" + isbn + "Category:" + category + "Price:" + price + "AuthorName:" + authorName + "Quantity:" + quantity;
			
		}
		
		HashSet<BookDetails> library = new HashSet<>();
		 
		 public void addBook() {
		        Scanner sc = new Scanner(System.in);

		        System.out.println("Enter the ISBN:");
		        String isbn = sc.next();
		        
		        for(BookDetails book: library) {
		        	if(book.getIsbn().equals(isbn)) {
		        		System.out.println("ISBN Already Exists. Please Enter Different ISBN");
		        		return;
		        	}
		        }

		        System.out.println("Select the category:");
		        for (Category category : Category.values()) {
		            System.out.println(category.ordinal() + ". " + category);
		        }
		        int categoryChoice = sc.nextInt();
		        sc.nextLine(); 

		        Category category = Category.values()[categoryChoice];

		        System.out.println("Enter the price:");
		        double price = sc.nextDouble();

		        System.out.println("Enter author of the book:");
		        String authorName = sc.next();

		        System.out.println("Enter the quantity of the books:");
		        int quantity = sc.nextInt();

		        BookDetails book = new BookDetails(isbn, category, price, authorName, quantity);
		        library.add(book);
		        System.out.println("Book is added");
		    }
		 
		 public void displayBook() {
		        System.out.println("All the books in the Collection are:");
		        for (BookDetails book : library) {
		            System.out.println(book);
		        }
		    }

		    public  void sortBookByCategory() {
		        List<BookDetails> sortedBooks = new ArrayList<>(library);
		        Collections.sort(sortedBooks, Comparator.comparing(BookDetails::getCategory));
		        System.out.println("Books Sorted by Category:");
		        for (BookDetails book : sortedBooks) {
		            System.out.println(book);
		        }
		    }
		    
		    public  void sortByAuthorName() {
		        List<BookDetails> sortedBooks = new ArrayList<>(library);
		        Collections.sort(sortedBooks, Comparator.comparing(BookDetails::getAuthorName));
		        System.out.println("Books Sorted by Author Name:");
		        for (BookDetails book : sortedBooks) {
		            System.out.println(book);
		        }
		    }
		    public void findById() {
		        Scanner sc = new Scanner(System.in);
		        System.out.println("Enter the ISBN:");
		        String isbn = sc.next();
		        boolean found = false;
		        for (BookDetails book : library) {
		            if (book.getIsbn().equals(isbn)) {
		                System.out.println("Book Found:");
		                System.out.println(book);
		                found = true;
		                break;
		            }
		        }
		    
		 
		        if (!found) {
		            System.out.println("Book not found");
		        }
	}
		
	}


