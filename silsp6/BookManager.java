package silsp6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
	ArrayList<Book> book_list;
	
	public BookManager(){
		book_list = new ArrayList<Book>();
	}

	void readfile(){
		FileInputStream fin = null;
		ObjectInputStream ois = null;

		try{
			fin = new FileInputStream("booklist.dat");
			ois = new ObjectInputStream(fin);
			
			ArrayList list = (ArrayList)ois.readObject();
			for(int i = 0; i<5;i++){
				book_list.add((Book)list.get(i));
			}
			for(Object book : list){
				System.out.println(book.toString());
			}
			
		}catch(Exception ex){
		}finally{
			try{
				ois.close();
				fin.close();
			}catch(IOException ioe){}
		}
	}
	
	void searchfile(int n){
		ArrayList<Book> found;
		found = new ArrayList<>();
		if(n==1){
			System.out.println("�Ϸù�ȣ �Է�");
			String isbn = new Scanner(System.in).nextLine();
			for(Book book : book_list){
				if(isbn.equals(book.getIsbn())){
					found.add(book);
				}
			}
			for(Book f : found){
				System.out.println(f.toString());
			}
		}
		else if(n==2){
			System.out.println("å �̸� �Է�");
			String title = new Scanner(System.in).nextLine();
			for(Book book : book_list){
				if(title.equals(book.getTitle())){
					found.add(book);
				}
			}
			for(Book f : found){
				System.out.println(f.toString());
			}
		}
		else if(n==3){
			System.out.println("���� �Է�");
			String author = new Scanner(System.in).nextLine();
			for(Book book : book_list){
				if(author.equals(book.getAuthor())){
					found.add(book);
				}
			}
			for(Book f : found){
				System.out.println(f.toString());
			}
			
		}
		else if(n==4){
			System.out.println("���� �Է�");
			int price = new Scanner(System.in).nextInt();
			for(Book book : book_list){
				if(price == book.getPrice()){
					found.add(book);
				}
			}
			for(Book f : found){
				System.out.println(f.toString());
			}
			
		}
		else if(n==5){
			System.out.println("���ǳ⵵ �Է�");
			int pubyear = new Scanner(System.in).nextInt();
			for(Book book : book_list){
				if(pubyear == book.getPubyear()){
					found.add(book);
				}
			}
			for(Book f : found){
				System.out.println(f.toString());
			}
		}
		else if(n==6){
			System.out.println("���ǻ� �Է�");
			String publisher = new Scanner(System.in).nextLine();
			for(Book book : book_list){
				if(publisher.equals(book.getPublisher())){
					found.add(book);
				}
			}
			for(Book f : found){
				System.out.println(f.toString());
			}
			
		}
		else if(n==7){
			System.out.println("�α⵵ �Է�");
			int point = new Scanner(System.in).nextInt();
			for(Book book : book_list){
				if(point == book.getPoint()){
					found.add(book);
				}
			}
			for(Book f : found){
				System.out.println(f.toString());
			}
		}
	}
	
	void savefile(){
		FileOutputStream fout = null;
		ObjectOutputStream oos = null;
		try{
			fout = new FileOutputStream("booklist.dat");
			oos = new ObjectOutputStream(fout);
			
			oos.writeObject(book_list);
			oos.reset();
			oos.writeObject(book_list);
			oos.reset();
			
			System.out.println("����Ǿ����ϴ�.");
			
		}catch(Exception ex){
		}finally{
			try{
				oos.close();
				fout.close();
			}catch(IOException ioe){}
		}
	}
	
	void start(){
		while(true){
			System.out.println("-----------------------------------");
			System.out.println("1)������� 2)�����˻� 3)������� ���Ͽ� �����ϱ�");
			int a = new Scanner(System.in).nextInt();
			if(a == 1){
				readfile();
			}
			else if(a == 2){
				System.out.println("1)�Ϸú�ȣ �˻� 2)å �̸� �˻� 3)���� �˻� 4)���� �˻� 5)���ǳ⵵ �˻� 6)���ǻ� �˻� 7)�α⵵ �˻�");
				int n = new Scanner(System.in).nextInt();
				searchfile(n);
			}
			else if(a == 3){
				savefile();
			}
		}
	}
	
	public static void main(String[] args){
		BookManager b = new BookManager();
		b.start();
	}
}
