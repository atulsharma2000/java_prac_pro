package library;

public class Book implements Manageable{
	
	private int isbn;
	private String title;
	private String author;
	private double price;
	

	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
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


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void view() {
		// TODO Auto-generated method stub
		
	}




}
