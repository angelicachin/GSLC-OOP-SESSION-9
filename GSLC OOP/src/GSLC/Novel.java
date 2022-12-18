package GSLC;

public class Novel extends Book implements Discount{

	private String genre;
	
	public Novel(String title, String author, String type, int quantity, String membership, String genre) {
		super(title, author, type, quantity, membership);
		this.genre = genre;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	@Override
	public int generatePrice() {
		int price = this.getAuthor().length() * 10000;
		return price;
	}

	@Override
	public int getDiscount() {
		int price = this.getAuthor().length() * 10000;
		int discount = (int)(price * 0.15);
		return discount;
	}
	
	

}
