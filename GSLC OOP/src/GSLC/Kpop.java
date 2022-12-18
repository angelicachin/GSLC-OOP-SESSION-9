package GSLC;

public class Kpop extends Book implements Merchandise {

	private String kpoptype;
	
	public Kpop(String title, String author, String type, int quantity, String membership, String kpoptype) {
		super(title, author, type, quantity, membership);
		this.kpoptype = kpoptype;
	}

	public String getKpoptype() {
		return kpoptype;
	}

	public void setKpoptype(String kpoptype) {
		this.kpoptype = kpoptype;
	}

	@Override
	public int generatePrice() {
		int price = 0;
		if(this.kpoptype.equals("Unofficial")) {
			price = 50000;
		}else if(this.kpoptype.equals("Official")) {
			price = 100000;
		}
		return price;
	}

	@Override
	public void getMerchandise() {
		if(this.kpoptype.equals("Official")) {
			System.out.println("Selamat! Anda mendapatkan merchandise poster dan photocard secara gratis");
		}else if(this.kpoptype.equals("Unofficial")) {
			System.out.println("Selamat! Anda mendapatkan merchandise poster secara gratis");
		}
		
	}

	
}
