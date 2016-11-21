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
		System.out.print("�޴��� �޴���, ������, ������ �Է��Ͻÿ� : ");
		String from = s.nextLine();
		String[] name = from.split(" ");
		orders++;
		mOrder order = new mOrder(orders, name[0], name[1], name[2]);    
		order_list.add(order);
		System.out.println("�ֹ� �Ϸ�");
		
	}
	
	void modifyOrder(){
		Scanner s = new Scanner(System.in);
		System.out.println("������ ��ȣ�� �Է��ϼ��� : ");
		int a = s.nextInt();
		mOrder edit = order_list.get(a-1);
		System.out.println("�޴��� �޴���, ������, ������ �Է��Ͻÿ�");
		String from = s.next();
		String[] name = from.split(" ");
		edit.setMenuname(name[0]);
		edit.setFrom(name[1]);
		edit.setPrice(name[2]);
		System.out.println("�����Ǿ����ϴ�");
	}
	
	void deleteOrder(){
		Scanner s = new Scanner(System.in);
		System.out.println("������ ��ȣ�� �Է��ϼ��� : ");
		int a = s.nextInt();
		order_list.remove(a-1);
		System.out.println("������");
	}
	
	void listOrder(){
		System.out.println("�޴���ȣ\t�޴��̸�\t\t������\t\t1�κа���");
		for(mOrder order : order_list){
			System.out.printf("%d\t%s\t\t%s\t\t%s��\n",order.getNo(),order.getMenuname(),order.getFrom(),order.getPrice());
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
			System.out.println("1.�߰�, 2.����, 3.����, 4.����Ʈ, 5.�Ѱ���, 6.����");
			System.out.print("�޴����� : ");
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
				System.out.println(orders+"���� �޴��� ��ϵǾ� �ֽ��ϴ�.");
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
