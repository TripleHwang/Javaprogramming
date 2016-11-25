package Midturm;

/*
2016-2�б� ���α׷���������[��米�� : �豤] �߰����

�а� : ��ǻ�Ͱ��а�
�г� : 1�г�
�й� : 2016004020
�̸� : Ȳ����

���� : �Ѿ���� �ֹ����� ���α׷� HFCManager 
*/

import java.util.Scanner;

import midturm1.Score;

import java.util.ArrayList;
import java.util.Date;					// �ֹ��Ͻ� �ڵ��Է��� ���� ���� (�ֹ��� ������ �޼ҵ� ��)
import java.text.SimpleDateFormat;	// �ֹ��Ͻ� �ڵ��Է��� ���� ���� (�ֹ��� ������ �޼ҵ� ��)

class Order  
{
	int no, price; // �ֹ��Ϸù�ȣ, ���ֹ�����
	int count[];		// �޴��� �ֹ����� (count[0]:�Ķ��̵� count[1]:��� count[2]:�ݹ� count[3]:�Ĵ� )
	String buyer, date;	//�ֹ��ڼ���, �ֹ��Ͻ�(�ڵ��Էµ�) 
	
	public Order(int n, int p, int c[], String b) // �ֹ��� ������.. ������ �ʿ� ����  
	{
		this.no = n;
		this.price = p;
		this.count = new int[4];
		for (int i=0;i<4;i++)
		{
			this.count[i] = c[i];
		}
		this.buyer = b;
		Date dt = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd, hh:mm:ss"); 
		this.date = sdf.format(dt).toString();
	}
	int getPrice()
	{
		return price;
	}
	int[] getCount()
	{
		return count;
	}
	String getBuyer()
	{
		return buyer;
	}
	String getDate()
	{
		return date;
	}
	void setPrice(int new_price)
	{
		this.price = new_price;
	}
	void setCount(int[] new_count)
	{
		for (int i=0;i<4;i++){
			this.count[i] = new_count[i];  //setcount �Լ��Դϴ�. for���� �Ἥ ī��Ʈ �迭�� ���� �ֵ��� �߽��ϴ�.
		}
	}
	int getNo(){
		return no;						//������ ���� ����, �ֹ� ��ȣ�� get�ϴ� �Լ��Դϴ�.
	}

}
class HFCManager 
{
	ArrayList<Order> order_list;	// �ֹ��� ��ü ����Ʈ
	String menu_name[] = {"�Ķ��̵�","���","�ݹ�","�Ĵ�"};			// �޴��̸�
	int order_menu[];				// �޴��� �� �ֹ�����
	int price_menu[];				// �޴��� �ǸŴܰ�
	int orders;					// ��������� �ֹ��� ����
	int income;					// ��������� �� ����ݾ�

	public HFCManager()	// ������ü ������ 
	{
		order_list = new ArrayList<Order>();
		order_menu = new int[4];
		price_menu = new int[4];

		orders = 0;
		income = 0;
		for (int i=0;i<4;i++)
		{
			 order_menu[i]=0;
			 price_menu[i]=0;
		}
	}

	void setPrice() // �����۾� �������� �޴��� �ܰ� �Է��� ���� �޼ҵ� 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("�޴��� �ܰ��� �Է��Ͻÿ�.");
		for (int i=0;i<4;i++)
		{
			System.out.print(menu_name[i]+" : ");
			price_menu[i]=s.nextInt();
		}
	}

	void printMenu() // �޴���(�޴��̸��� ����)�� �����ִ� �޼ҵ� 
	{
		System.out.print("�޴��� : ");
		for (int i=0;i<4;i++)
		{
			System.out.println("["+(i+1)+"] "+menu_name[i] + " - "+price_menu[i] + "��");
		}
		System.out.println();
	}
	//�ֹ� �߰�
	void addOrder()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("�ֹ��� �̸��� �Է��ϼ��� : ");
		String buyer = s.next();
		System.out.print("�޴��� �ֹ� ������ �Է��ϼ��� : [1]�Ķ��̵� [2]��� [3]�ݹ� [4]�Ĵ� --> ");
		int amount[] = new int[4];		// 4���� �޴��� �ֹ���
		for (int i=0;i<4;i++)
		{
			amount[i] = s.nextInt();		// �ֹ����� 4�� �Է¹�
		}
		int price = 0;						// �ֹ��ݾ� �ʱ�ȭ 
		for (int i=0;i<4;i++)
		{
			price += amount[i] * price_menu[i];		// �ֹ��ݾ� ���� 
			order_menu[i] += amount[i];		// �޴��� �� �ֹ������� �������  
		}
		orders++;
		income += price;
		Order order = new Order(orders,price,amount,buyer);     // order�� 1�� �þ��, ������ ����˴ϴ�. order ��ü�� ���� ���� �ְ�, order_list��ü�迭�� ��ü�� �ֽ��ϴ�.
		order_list.add(order);
		System.out.println("�ֹ� �Ϸ�");
	}
	
	void modifyOrder()
	{
		Scanner s = new Scanner(System.in);
		listOrder();
		System.out.print("������ �ֹ��� ��ȣ��? (0 ���) : ");
		int num = s.nextInt();
		if (num == 0) {
			System.out.println("����ϼ̽��ϴ�.");
		}
		else if (num > orders){
			System.out.println("���� �ֹ��� ��ȣ�Դϴ�.");	
		}
		else {
			Order edit = order_list.get(num-1);                //ã�ƿ� ��ü�� edit�� �ֽ��ϴ�.
			System.out.println("�޴��� �ֹ� ������ �ٽ� �Է��ϼ��� : [1]�Ķ��̵� [2]��� [3]�ݹ� [4]�Ĵ� -->");
			int amount[] = new int[4];	
			for (int i=0;i<4;i++)
			{
				amount[i] = s.nextInt();                      //add�޼ҵ�� ����ϰ� �޴� ������ �Է��մϴ�.
			}
			int before_price = edit.getPrice();               //���� ���� �����ɴϴ�.
			int present_price = 0;                            //�ٲ� �����Դϴ�.
			for (int i=0;i<4;i++)
			{
				order_menu[i] -= edit.getCount()[i];          //�� �տ��� ������ �ִ� �͵��� ���ϴ�.
				present_price += amount[i] * price_menu[i];	  //�׸��� ���� �ٲ� ���ݿ� �����մϴ�.
				order_menu[i] += amount[i];		
			}
			income -= before_price;                           //���� ���� ����, ���� ���� �ֽ��ϴ�.
			income += present_price;
			edit.setCount(amount);                            //setcount�մϴ�.
			edit.setPrice(present_price);                     //setprice�մϴ�.
			System.out.println("�����Ǿ����ϴ�.");
		}
	}
	
	void listOrder()
	{
		System.out.println("��ȣ\t�ֹ��Ͻ�\t\t\t�ֹ���\t�ֹ��ݾ�\t�ֹ�����(�Ķ��̵�/���/�ݹ�/�Ĵ�)");
		for(Order order : order_list){ //foreach������ ����մϴ�.
			System.out.printf("%d\t%s\t%s\t%d��\t%d��/%d��/%d��/%d��\n",order.getNo(),order.getDate(), order.getBuyer(), order.getPrice(), order.getCount()[0],order.getCount()[1],order.getCount()[2],order.getCount()[3]);
		}
	}
	
	void listOrder(int price)
	{
		ArrayList<Order> found;
		found = new ArrayList<>();
		for(Order order : order_list){ 
			if(price<=order.getPrice()){
				found.add(order); //��ü �迭���� ���ǿ� �´� ��ü�� found��ü�迭�� �ֽ��ϴ�.
			}
		}
		System.out.println(price+"�� �̻� �ֹ��� ������ ������ �����ϴ�");
		System.out.println("��ȣ\t�ֹ��Ͻ�\t\t\t�ֹ���\t�ֹ��ݾ�\t�ֹ�����(�Ķ��̵�/���/�ݹ�/�Ĵ�)");
		for(Order order : found){ //foreach
			System.out.printf("%d\t%s\t%s\t%d��\t%d��/%d��/%d��/%d��\n",order.getNo(),order.getDate(), order.getBuyer(), order.getPrice(), order.getCount()[0],order.getCount()[1],order.getCount()[2],order.getCount()[3]);
		}
	}
	void listOrder(String name)
	{
		ArrayList<Order> found;
		found = new ArrayList<>();
		for(Order order : order_list){
			if(name.equals(order.getBuyer())){
				found.add(order); //��ü �迭���� ���ǿ� �´� ��ü�� found��ü�迭�� �ֽ��ϴ�.
			}
		}
		System.out.println(name+" ������ �ֹ��Ͻ� ������ ������ �����ϴ�");
		System.out.println("��ȣ\t�ֹ��Ͻ�\t\t\t�ֹ���\t�ֹ��ݾ�\t�ֹ�����(�Ķ��̵�/���/�ݹ�/�Ĵ�)");
		for(Order order : found){ //foreach
			System.out.printf("%d\t%s\t%s\t%d��\t%d��/%d��/%d��/%d��\n",order.getNo(),order.getDate(), order.getBuyer(), order.getPrice(), order.getCount()[0],order.getCount()[1],order.getCount()[2],order.getCount()[3]);
		}
	}
	
	//���� �Լ� ���� �����ε��� ����� �Լ��Դϴ�.
	
	void findBestOrder(){
		int max_price = 0;
		int max_price_num = 0;
		for(Order order : order_list){
			if(order.getPrice() > max_price){
				max_price = order.getPrice();  //max������ �����մϴ�.
				max_price_num = order.getNo(); //�׿� ���缭 ��ȣ�� �����մϴ�.
			}
		}
		Order edit = order_list.get(max_price_num-1); //edit ��ü�� �ֹ���ȣ�� ��ü�� �����ɴϴ�.
		System.out.println("���� ���� �ݾ��� �ֹ��� �ֹ����� ������ �����ϴ�.");
		System.out.println("�ֹ��Ͻ� :"+edit.getDate());																									
		System.out.println("�ֹ��� :"+edit.getBuyer());																									//���� ������ ����մϴ�.
		System.out.println("�ֹ��ݾ� :"+edit.getPrice());
		System.out.printf("�ֹ����� : �Ķ��̵� %d��/ ���%d��/ �ݹ�%d��/ �Ĵ�%d��\n", edit.getCount()[0],edit.getCount()[1],edit.getCount()[2],edit.getCount()[3]);
	}
	
	void report(){
		System.out.printf("���� ����(�ֹ� Ƚ�� %d��)\n",orders);
		listOrder();
		System.out.println("�޴��� �� �ֹ� ����");
		for(int i = 0; i<4;i++){
			System.out.println(menu_name[i]+" : "+order_menu[i]+"��");	//�� �޴� ������ ����մϴ�.
		}
		System.out.println("�� �Ǹű��� : "+income);					//�� ������ ����մϴ�.
	}
	

	//�ֹ������۾�����(start)
	void start()
	{
		Scanner s = new Scanner(System.in);
		int menu;
		boolean go=true;

		setPrice();
		while(go)
		{
			System.out.println("\n===============================================================");
			System.out.println("1.�ֹ��߰�, 2.�ֹ�����, 3.�ֹ��˻�(����) 4.�ֹ��˻�(�ݾ׺�), 5.����Ʈ, 6.����, 7.����");
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
				System.out.println("�˻��� ȣ������ �̸���? : ");
				String buyname = new Scanner(System.in).nextLine();
				listOrder(buyname);
				break;
			case 4 :
				System.out.println("�˻��� �ּ� �ֹ��ݾ���? : ");
				int min_price = new Scanner(System.in).nextInt();
				listOrder(min_price);
				break;
			case 5 :
				findBestOrder();
				break;
			case 6 :
				report();
				break;
			case 7 :
				go=false;
				break;
			
			}
		}
	
	}

	public static void main(String[] args) 
	{
		HFCManager m = new HFCManager();
		m.start();
	}
}
