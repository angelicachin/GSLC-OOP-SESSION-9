package GSLC;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	Scanner scan = new Scanner(System.in);
	ArrayList<Book> bookList = new ArrayList<>();
	
	public Main() {
		int menu;
		
		do {
			System.out.println("BOOKS");
			System.out.println("=================");
			System.out.println("1. View Books");
			System.out.println("2. Add Book");
			System.out.println("3. Buy Book");
			System.out.println("4. Exit");
			System.out.print("Choose: ");
			
			menu = scan.nextInt();
			scan.nextLine();
			
			if(menu == 1) {
				viewBook();
			}else if(menu == 2) {
				addBook();
			}else if(menu == 3) {
				buyBook();
			}
			
		}while(menu != 4);
	}

	// Untuk menambahkan buku ke dalam arraylist
	public void addBook() {
		String title;
		String author;
		String type;
		int quantity;
		String membership;
		String kpoptype;
		String genre;
		String color;
		
	
		do {
			System.out.print("Input the title of the book [1-20]: ");
			title = scan.nextLine();
		}while(title.length() < 0 || title.length() > 20);
		
		do {
			System.out.print("Input the author's name [3-15]: ");
			author = scan.nextLine();
		}while(author.length() < 3 || author.length() > 15);
		
		do {
			System.out.print("Input the type of the book [Kpop | Novel | Comic]: ");
			type = scan.nextLine();
		}while(!(type.equals("Kpop") || type.equals("Novel") || type.equals("Comic")));
		
		do {
			System.out.print("Input the quantity of the book: ");
			quantity = scan.nextInt();
			scan.nextLine();
		}while(quantity < 0);
		
		do {
			System.out.print("Input your membership status [VIP | Regular]: ");
			membership = scan.nextLine();
		}while(!(membership.equals("VIP") || membership.equals("Regular")));
		
		if(type.equals("Kpop")) { 
			do {
				System.out.print("Input the type of the KPOP book [Unofficial | Official]: ");
				kpoptype = scan.nextLine();
			}while(!(kpoptype.equals("Unofficial") || kpoptype.equals("Official")));
			
			// menambahkan buku tipe kpop ke dalam arraylist
			bookList.add(new Kpop(title, author, type, quantity, membership, kpoptype));
		}else if(type.equals("Novel")) {
			do {
				System.out.print("Input the genre of the novel [Romance | Fantasy | Horror]: ");
				genre = scan.nextLine();
			}while(!(genre.equals("Romance") || genre.equals("Fantasy") || genre.equals("Horror")));
			
			// menambahkan buku tipe novel ke dalam arraylist
			bookList.add(new Novel(title, author, type, quantity, membership, genre));
		}else if(type.equals("Comic")) {
			do {
				System.out.print("Input the color [BnW | Colorful]: ");
				color = scan.nextLine();
			}while(!(color.equals("BnW") || color.equals("Colorful")));
			
			// menambahkan buku tipe komik ke dalam arraylist
			bookList.add(new Comic(title, author, type, quantity, membership, color));
		}
		
		System.out.println("");
		System.out.println("Book already added!");
		System.out.println("Press enter to continue");
		scan.nextLine();
	}
	
	// untuk menampilkan buku yang telah dimasukkan
	public void viewBook() {
		int count = 0;
		if(bookList.isEmpty()) {
			System.out.println("There is no book!");
			System.out.println("Press enter to continue");
			scan.nextLine();
		}else {
			System.out.println("===========================================================================================================");
			System.out.printf("| %-3s | %-20s | %-15s | %-7s | %-8s | %-12s | %-7s | %-10s |\n", "No", "Title", "Author Name", "Type", "Quantity",
							"Kpop Type", "Genre", "Color");
			System.out.println("===========================================================================================================");
			for(Book book: bookList) {
				count++;
				if(book instanceof Kpop) {
					System.out.printf("| %-3d | %-20s | %-15s | %-7s | %-8d | %-12s | %-7s | %-10s |\n", count, book.getTitle(), book.getAuthor(),
							book.getType(), book.getQuantity(), ((Kpop)book).getKpoptype(), "-", "-");
				}else if(book instanceof Novel) {
					System.out.printf("| %-3d | %-20s | %-15s | %-7s | %-8d | %-12s | %-7s | %-10s |\n", count, book.getTitle(), book.getAuthor(),
							book.getType(), book.getQuantity(), "-", ((Novel)book).getGenre() ,"-");
				}else if(book instanceof Comic) {
					System.out.printf("| %-3d | %-20s | %-15s | %-7s | %-8d | %-12s | %-7s | %-10s |\n", count, book.getTitle(), book.getAuthor(),
							book.getType(), book.getQuantity(), "-", "-", ((Comic)book).getColor());
				}
			}
			System.out.println("===========================================================================================================");
			System.out.println("");
			System.out.println("Press enter to continue");
			scan.nextLine();
		}
	}
	
	public void buyBook() {
		int count = 0;
		if(bookList.isEmpty()) {
			System.out.println("There is no book!");
			System.out.println("Press enter to continue");
			scan.nextLine();
		}else {
			System.out.println("===========================================================================================================");
			System.out.printf("| %-3s | %-20s | %-15s | %-7s | %-8s | %-12s | %-7s | %-10s |\n", "No", "Title", "Author Name", "Type", "Quantity",
							"Kpop Type", "Genre", "Color");
			System.out.println("===========================================================================================================");
			for(Book book: bookList) {
				count++;
				if(book instanceof Kpop) {
					System.out.printf("| %-3d | %-20s | %-15s | %-7s | %-8d | %-12s | %-7s | %-10s |\n", count, book.getTitle(), book.getAuthor(),
							book.getType(), book.getQuantity(), ((Kpop)book).getKpoptype(), "-", "-");
				}else if(book instanceof Novel) {
					System.out.printf("| %-3d | %-20s | %-15s | %-7s | %-8d | %-12s | %-7s | %-10s |\n", count, book.getTitle(), book.getAuthor(),
							book.getType(), book.getQuantity(), "-", ((Novel)book).getGenre() ,"-");
				}else if(book instanceof Comic) {
					System.out.printf("| %-3d | %-20s | %-15s | %-7s | %-8d | %-12s | %-7s | %-10s |\n", count, book.getTitle(), book.getAuthor(),
							book.getType(), book.getQuantity(), "-", "-", ((Comic)book).getColor());
				}
			}
			System.out.println("===========================================================================================================");
			System.out.println("");
			
			int buy = 0;
			do {
				System.out.print("Input the book that you want to buy [1 - " + bookList.size() + "]: ");
				buy = scan.nextInt();
				scan.nextLine();
			}while(buy < 1 || buy > bookList.size());
			
			// menampilkan detail buku yang ingin dibeli
			System.out.println("Title        : " + bookList.get(buy-1).getTitle());
			System.out.println("Author Name  : " + bookList.get(buy-1).getAuthor());
			System.out.println("Type         : " + bookList.get(buy-1).getType());
			System.out.println("Membership   : " + bookList.get(buy-1).getMembership());
			
			// menampilkan atribut lain dari masing-masing tipe buku
			if(bookList.get(buy-1) instanceof Kpop) {
				System.out.println("Kpop Type    : " + ((Kpop)bookList.get(buy-1)).getKpoptype());
				System.out.println("Price        : " + ((Kpop)bookList.get(buy-1)).generatePrice());
			}else if(bookList.get(buy-1) instanceof Novel) {
				System.out.println("Novel Genre  : " + ((Novel)bookList.get(buy-1)).getGenre());
				System.out.println("Price        : " + ((Novel)bookList.get(buy-1)).generatePrice());
			}else if(bookList.get(buy-1) instanceof Comic) {
				System.out.println("Color        : " + ((Comic)bookList.get(buy-1)).getColor());
				System.out.println("Price        : " + ((Comic)bookList.get(buy-1)).generatePrice());	
			}
			
			
			int payment = 0;
			int change = 0;
			int discount = 0;
			
			// jika membershipnya VIP maka mendapatkan keuntungan
			if(bookList.get(buy-1).getMembership().equals("VIP")) {
				System.out.println("");
				if(bookList.get(buy-1) instanceof Kpop) {
					// untuk buku kpop mendapatkan merchandise
					Merchandise merch1 = new Kpop(bookList.get(buy-1).getTitle(), bookList.get(buy-1).getAuthor(), bookList.get(buy-1).getType(),
						bookList.get(buy-1).getQuantity(),bookList.get(buy-1).getMembership(),((Kpop)bookList.get(buy-1)).getKpoptype());
					System.out.println("");
					merch1.getMerchandise();
				}else if(bookList.get(buy-1) instanceof Novel) {
					// untuk novel mendapatkan diskon 15%
					System.out.println("You got a discount!");
					Discount discount1 = new Novel(bookList.get(buy-1).getTitle(), bookList.get(buy-1).getAuthor(), bookList.get(buy-1).getType(),
						bookList.get(buy-1).getQuantity(),bookList.get(buy-1).getMembership(),((Novel)bookList.get(buy-1)).getGenre());
					discount = discount1.getDiscount();
					System.out.println("Discount     : " + discount);
				}else if(bookList.get(buy-1) instanceof Comic) {
					// untuk komik mendapatkan diskon 10%
					System.out.println("You got a discount!");
					Discount discount1 = new Novel(bookList.get(buy-1).getTitle(), bookList.get(buy-1).getAuthor(), bookList.get(buy-1).getType(),
							bookList.get(buy-1).getQuantity(),bookList.get(buy-1).getMembership(),((Comic)bookList.get(buy-1)).getColor());
					discount = discount1.getDiscount();
					System.out.println("Discount     : " + discount);
				}
			}
			
			// untuk menampilkan jumlah harga yang harus dibayar
			do {
				System.out.print("Input payment [min. " + (bookList.get(buy-1).generatePrice()-discount) + "]: " );
				payment = scan.nextInt();
				scan.nextLine();
			}while(payment < (bookList.get(buy-1).generatePrice()-discount));
			
			// untuk menghitung kembalian 
			change = payment - (bookList.get(buy-1).generatePrice()-discount);
			
			// untuk menampilkan kembalian
			System.out.println("Here's the change " + change);
			
			int qty = bookList.get(buy-1).getQuantity();
			
		
			if(bookList.get(buy-1).getQuantity() == 1) { // jika jumlah buku hanya ada 1 maka buku langsung dihapus dari arraylist
				bookList.remove(buy-1);
			}else if(bookList.get(buy-1).getQuantity() > 1) { // jika jumlah buku lebih dari 1 maka jumlah buku dikurangi satu 
				bookList.get(buy-1).setQuantity(qty-1);
			}
			
			System.out.println("");
			System.out.println("Thank you for buying this book!");
			System.out.println("Press enter to continue ...");
			scan.nextLine();
		}
	}
	
	public static void main(String[] args) {
		new Main();

	}

}
