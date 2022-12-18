package GSLC;

public abstract class Book {

	private String title;
	private int quantity;
	private String author;
	private String type;
	private String membership;
	
	public Book(String title, String author, String type, int quantity, String membership) {
		this.title = title;
		this.author = author;
		this.type = type;
		this.quantity = quantity;
		this.membership = membership;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getMembership() {
		return membership;
	}

	public void setMembership(String membership) {
		this.membership = membership;
	}

	public abstract int generatePrice();
	
}
