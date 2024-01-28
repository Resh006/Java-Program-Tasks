package Tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Books {
	private String ISBN;
	private String title;
	private String author;
	private double price;
	public Books(String ISBN,String title,String author,double price) {
		this.ISBN=ISBN;
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
	public String getISBN() {
		return ISBN;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
}
	class Book{
		private Map<String,Books> BookInventory;
		private Map<String, Integer> ShoppingCart;
		
		public Book() {
			this.BookInventory=new HashMap<>();
			this.ShoppingCart=new HashMap<>();
		}
		public void registerBook(String ISBN,String title,String author,double price) {
			Books newBook=new Books(ISBN,title,author,price);
			BookInventory.put(ISBN,newBook);
			System.out.println("Book Registered Successfully!!");
		}
		
		public void searchBook(String ISBN) {
			if(BookInventory.containsKey(ISBN)) {
			   Books foundBook=BookInventory.get(ISBN);
			   System.out.println("Book details : ");
			   System.out.println("ISBN : " + foundBook.getISBN());
		       System.out.println("title : " + foundBook.getTitle());
			   System.out.println("author : " + foundBook.getAuthor());
			   System.out.println("Price : Rs." + foundBook.getPrice());
			}
			else {
			   System.out.println("Book with ISBN " + ISBN + "not found.");
			}
		}
		
		public double calculateTotalRevenue() {
			double totalRevenue=0.0;
			for(Books book:BookInventory.values()) {
				totalRevenue+=book.getPrice();
			}
			return totalRevenue;
		}
		public void addToShoppingCart(String ISBN,int quantity) {
			if(BookInventory.containsKey(ISBN)) {
				ShoppingCart.put(ISBN, ShoppingCart.getOrDefault(ISBN, 0)+ quantity);
				System.out.println("Book added to the shopping cart");
			}
			else {
				System.out.println("Book with ISBN " + ISBN  +  " not found in the inventory." );
			}
		}
		public double calculateTotalCost() {
			double totalcost=0.0;
			for(Map.Entry<String,Integer>entry:ShoppingCart.entrySet()) {
				String ISBN=entry.getKey();
				int quantity=entry.getValue();
				Books book=BookInventory.get(ISBN);
				totalcost+=book.getPrice()*quantity;
			}
			return totalcost;
		}
	}
	
public class BookStore{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Book book=new Book();
		while(true) {
			System.out.println("Menu :");
			System.out.println("1.Register a new book");
			System.out.println("2.Search for a book");
			System.out.println("3.Calculate total revenue");
			System.out.println("4.Add books into shopping cart");
			System.out.println("5.Calculate Total cost in shopping cart");
			System.out.println("6.Exit");
			
			System.out.println("Enter your choice :");
			int choice=sc.nextInt();
			switch(choice){
			case 1:
				System.out.println("Enter ISBN :");
				String ISBN=sc.next();
				System.out.println("Enter title :");
				String title=sc.next();
				System.out.println("Enter author :");
				String author=sc.next();
				System.out.println("Enter price :");
				double price=sc.nextDouble();
				
				book.registerBook(ISBN, title, author, price);;
				break;
			
			case 2:
				System.out.println("Enter ISBN to search :");
				ISBN=sc.next();
				book.searchBook(ISBN);
				break;
				
			case 3:
				double totalRevenue=book.calculateTotalRevenue();
				System.out.println("Total Revenue : Rs." +totalRevenue);
				break;
				
			case 4:
				System.out.println("Enter ISBN to add to");
				ISBN=sc.next();
				System.out.println("Enter Quantity : ");
				int quantity=sc.nextInt();
				book.addToShoppingCart(ISBN,quantity);
				break;
				
			case 5:
				double totalCost=book.calculateTotalCost();
				System.out.println("Total cost in Shopping Cart " + totalCost);
				break;
				
			case 6:
				System.out.println("Exiting");
				System.exit(0);
				
			default:
				System.out.println("Invalid choice!!! \nType correct choice....");
    		}
	    }
    }
}
