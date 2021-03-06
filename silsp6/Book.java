package silsp6;

import java.io.Serializable;

public class Book implements Serializable {
	

	private String isbn;
	private String title;
	private String author;
	private int price;
	private int pubyear;
	private String publisher;
	private int point;
	
	public Book(String isbn, String title, String author, int price, int pubyear, String publisher, int point){
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
		this.pubyear = pubyear;
		this.publisher = publisher;
		this.point = point;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getPrice() {
		return price;
	}

	public String getTitle() {
		return title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPubyear() {
		return pubyear;
	}

	public void setPubyear(int pubyear) {
		this.pubyear = pubyear;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
	
	public String toString(){
		return getIsbn() + "," + getTitle() + "," + getAuthor() + "," + getPrice() + "," + getPubyear()+ "," + getPublisher()+ "," + getPoint();
	}

}
