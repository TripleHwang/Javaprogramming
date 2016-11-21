package silsp4;

import java.util.ArrayList;
import java.util.Scanner;

class mOrder{
	int no;
	String menuname;
	String from;
	String price;
	
	public mOrder(int n, String p, String c, String b)
	{
		this.no = n;
		this.menuname = p;
		this.from = c;
		this.price = b;
	}
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getMenuname() {
		return menuname;
	}

	public void setMenuname(String menuname) {
		this.menuname = menuname;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}
}

public class test {
	ArrayList<mOrder> order_list;
	int orders = 0;
	public test(){
		order_list = new ArrayList<mOrder>();
	}

	
	void addOrder(){
		Scanner s = new Scanner(System.in);
		System.out.print("메뉴의 메뉴명, 원산지, 가격을 입력하시오 : ");
		String from = s.nextLine();
		String[] name = from.split(" ");
		orders++;
		mOrder order = new mOrder(orders, name[0], name[1], name[2]);    
		order_list.add(order);
		System.out.println("주문 완료");
		
	}
	
	void modifyOrder(){
		Scanner s = new Scanner(System.in);
		System.out.println("수정할 번호를 입력하세요 : ");
		int a = s.nextInt();
		mOrder edit = order_list.get(a-1);
		System.out.println("메뉴의 메뉴명, 원산지, 가격을 입력하시오");
		String from = s.next();
		String[] name = from.split(" ");
		edit.setMenuname(name[0]);
		edit.setFrom(name[1]);
		edit.setPrice(name[2]);
		System.out.println("수정되었습니다");
	}
	
	void deleteOrder(){
		Scanner s = new Scanner(System.in);
		System.out.println("삭제할 번호를 입력하세요 : ");
		int a = s.nextInt();
		order_list.remove(a-1);
		System.out.println("삭제됨");
	}
	
	void listOrder(){
		System.out.println("메뉴번호\t메뉴이름\t\t원산지\t\t1인분가격");
		for(mOrder order : order_list){
			System.out.printf("%d\t%s\t\t%s\t\t%s원\n",order.getNo(),order.getMenuname(),order.getFrom(),order.getPrice());
		}
	}
	
	void start()
	{
		Scanner s = new Scanner(System.in);
		int menu;
		boolean go=true;
		while(go)
		{
			System.out.println("\n===============================================================");
			System.out.println("1.추가, 2.변경, 3.삭제, 4.리스트, 5.총갯수, 6.종료");
			System.out.print("메뉴선택 : ");
			menu = s.nextInt();
			switch (menu)
			{
			case 1 : 
				addOrder();	
				break;
			case 2 :
				modifyOrder();
				break;
			case 3 :
				deleteOrder();
				break;
			case 4 :
				listOrder();
				break;
			case 5 :
				System.out.println(orders+"개의 메뉴가 등록되어 있습니다.");
			case 6 :
				go=false;
				break;
			}
		}
	
	}
	public static void main(String[] args){
		test t = new test();
		t.start();
	}

}
