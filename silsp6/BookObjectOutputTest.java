package silsp6;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class BookObjectOutputTest{

	public static void main(String[] args) {
		FileOutputStream fout = null;
		ObjectOutputStream oos = null;

		ArrayList list = new ArrayList();
		Book b1 = new Book("a0001", "자바완성", "홍길동", 10000, 1998, "한글과검뷰터", 22);
		Book b2 = new Book("a0002", "스트럿츠", "김유신", 20000, 1558, "아이러브사커", 11);
		Book b3 = new Book("a0003", "기초 EJB", "김성박", 25000, 1223, "읽지마", 55);
		Book b4 = new Book("a0004", "웃우!", "야요이", 9999, 2006, "나무코", 72);
		Book b5 = new Book("a0005", "아-후", "미키", 3737, 2006, "765", 72);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		list.add(b5);
		 
		try{
			fout = new FileOutputStream("booklist.dat");
			oos = new ObjectOutputStream(fout);
			
			oos.writeObject(list);
			oos.reset();
			oos.writeObject(list);
			oos.reset();
			
			System.out.println("저장되었습니다.");
			
		}catch(Exception ex){
		}finally{
			try{
				oos.close();
				fout.close();
			}catch(IOException ioe){}
		} // finally
	} // main end
} // class end
