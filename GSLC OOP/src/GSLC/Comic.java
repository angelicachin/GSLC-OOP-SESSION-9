package GSLC;

public class Comic extends Book implements Discount{

	private String color;
	
	public Comic(String title, String author, String type, int quantity, String membership, String color) {
		super(title, author, type, quantity, membership);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}


	@Override
	public int generatePrice() {
		int price = 0;
		if(this.color.equals("BnW")) {
			price = 15000;
		}else if(this.color.equals("Colorful")) {
			price = 25000;
		}
		return price;
	}

	@Override
	public int getDiscount() {
		int price = 0;
		int discount = 0;
		if(this.color.equals("BnW")) {
			price = 15000;
			discount = (int)(price * 0.1);
		}else if(this.color.equals("Colorful")) {
			price = 25000;
			discount = (int)(price * 0.1);
		}
		return discount;
	}

	
}
