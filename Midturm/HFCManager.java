package Midturm;

/*
2016-2학기 프로그램설계방법론[담당교수 : 김광] 중간고사

학과 : 컴퓨터공학과
학년 : 1학년
학번 : 2016004020
이름 : 황한혁

주제 : 한양통닭 주문관리 프로그램 HFCManager 
*/

import java.util.Scanner;

import midturm1.Score;

import java.util.ArrayList;
import java.util.Date;					// 주문일시 자동입력을 위한 구문 (주문서 생성자 메소드 내)
import java.text.SimpleDateFormat;	// 주문일시 자동입력을 위한 구문 (주문서 생성자 메소드 내)

class Order  
{
	int no, price; // 주문일련번호, 총주문가격
	int count[];		// 메뉴별 주문갯수 (count[0]:후라이드 count[1]:양념 count[2]:반반 count[3]:파닭 )
	String buyer, date;	//주문자성명, 주문일시(자동입력됨) 
	
	public Order(int n, int p, int c[], String b) // 주문서 생성자.. 수정할 필요 없음  
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
			this.count[i] = new_count[i];  //setcount 함수입니다. for문을 써서 카운트 배열에 값을 넣도록 했습니다.
		}
	}
	int getNo(){
		return no;						//편리성을 위해 만든, 주문 번호를 get하는 함수입니다.
	}

}
class HFCManager 
{
	ArrayList<Order> order_list;	// 주문서 객체 리스트
	String menu_name[] = {"후라이드","양념","반반","파닭"};			// 메뉴이름
	int order_menu[];				// 메뉴별 총 주문갯수
	int price_menu[];				// 메뉴별 판매단가
	int orders;					// 현재까지의 주문서 갯수
	int income;					// 현재까지의 총 매출금액

	public HFCManager()	// 관리객체 생성자 
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

	void setPrice() // 관리작업 시작전에 메뉴별 단가 입력을 위한 메소드 
	{
		Scanner s = new Scanner(System.in);

		System.out.println("메뉴별 단가를 입력하시오.");
		for (int i=0;i<4;i++)
		{
			System.out.print(menu_name[i]+" : ");
			price_menu[i]=s.nextInt();
		}
	}

	void printMenu() // 메뉴판(메뉴이름과 가격)을 보여주는 메소드 
	{
		System.out.print("메뉴판 : ");
		for (int i=0;i<4;i++)
		{
			System.out.println("["+(i+1)+"] "+menu_name[i] + " - "+price_menu[i] + "원");
		}
		System.out.println();
	}
	//주문 추가
	void addOrder()
	{
		Scanner s = new Scanner(System.in);
		System.out.print("주문자 이름을 입력하세요 : ");
		String buyer = s.next();
		System.out.print("메뉴별 주문 갯수를 입력하세요 : [1]후라이드 [2]양념 [3]반반 [4]파닭 --> ");
		int amount[] = new int[4];		// 4가지 메뉴별 주문갯
		for (int i=0;i<4;i++)
		{
			amount[i] = s.nextInt();		// 주문갯수 4번 입력받
		}
		int price = 0;						// 주문금액 초기화 
		for (int i=0;i<4;i++)
		{
			price += amount[i] * price_menu[i];		// 주문금액 누산 
			order_menu[i] += amount[i];		// 메뉴별 총 주문갯수에 누적계산  
		}
		orders++;
		income += price;
		Order order = new Order(orders,price,amount,buyer);     // order는 1씩 늘어나고, 가격은 누계됩니다. order 객체를 만들어서 값을 넣고, order_list객체배열에 객체를 넣습니다.
		order_list.add(order);
		System.out.println("주문 완료");
	}
	
	void modifyOrder()
	{
		Scanner s = new Scanner(System.in);
		listOrder();
		System.out.print("변경할 주문서 번호는? (0 취소) : ");
		int num = s.nextInt();
		if (num == 0) {
			System.out.println("취소하셨습니다.");
		}
		else if (num > orders){
			System.out.println("없는 주문서 번호입니다.");	
		}
		else {
			Order edit = order_list.get(num-1);                //찾아온 객체를 edit에 넣습니다.
			System.out.println("메뉴별 주문 갯수를 다시 입력하세요 : [1]후라이드 [2]양념 [3]반반 [4]파닭 -->");
			int amount[] = new int[4];	
			for (int i=0;i<4;i++)
			{
				amount[i] = s.nextInt();                      //add메소드와 비슷하게 메뉴 갯수를 입력합니다.
			}
			int before_price = edit.getPrice();               //예전 값을 가져옵니다.
			int present_price = 0;                            //바꿀 가격입니다.
			for (int i=0;i<4;i++)
			{
				order_menu[i] -= edit.getCount()[i];          //총 합에서 기존에 있던 것들을 뺍니다.
				present_price += amount[i] * price_menu[i];	  //그리고 나서 바꿀 가격에 누계합니다.
				order_menu[i] += amount[i];		
			}
			income -= before_price;                           //예전 값을 빼고, 현재 값을 넣습니다.
			income += present_price;
			edit.setCount(amount);                            //setcount합니다.
			edit.setPrice(present_price);                     //setprice합니다.
			System.out.println("수정되었습니다.");
		}
	}
	
	void listOrder()
	{
		System.out.println("번호\t주문일시\t\t\t주문자\t주문금액\t주문갯수(후라이드/양념/반반/파닭)");
		for(Order order : order_list){ //foreach문으로 출력합니다.
			System.out.printf("%d\t%s\t%s\t%d원\t%d개/%d개/%d개/%d개\n",order.getNo(),order.getDate(), order.getBuyer(), order.getPrice(), order.getCount()[0],order.getCount()[1],order.getCount()[2],order.getCount()[3]);
		}
	}
	
	void listOrder(int price)
	{
		ArrayList<Order> found;
		found = new ArrayList<>();
		for(Order order : order_list){ 
			if(price<=order.getPrice()){
				found.add(order); //객체 배열에서 조건에 맞는 객체를 found객체배열에 넣습니다.
			}
		}
		System.out.println(price+"원 이상 주문한 내역은 다음과 같습니다");
		System.out.println("번호\t주문일시\t\t\t주문자\t주문금액\t주문갯수(후라이드/양념/반반/파닭)");
		for(Order order : found){ //foreach
			System.out.printf("%d\t%s\t%s\t%d원\t%d개/%d개/%d개/%d개\n",order.getNo(),order.getDate(), order.getBuyer(), order.getPrice(), order.getCount()[0],order.getCount()[1],order.getCount()[2],order.getCount()[3]);
		}
	}
	void listOrder(String name)
	{
		ArrayList<Order> found;
		found = new ArrayList<>();
		for(Order order : order_list){
			if(name.equals(order.getBuyer())){
				found.add(order); //객체 배열에서 조건에 맞는 객체를 found객체배열에 넣습니다.
			}
		}
		System.out.println(name+" 고객님이 주문하신 내역은 다음과 같습니다");
		System.out.println("번호\t주문일시\t\t\t주문자\t주문금액\t주문갯수(후라이드/양념/반반/파닭)");
		for(Order order : found){ //foreach
			System.out.printf("%d\t%s\t%s\t%d원\t%d개/%d개/%d개/%d개\n",order.getNo(),order.getDate(), order.getBuyer(), order.getPrice(), order.getCount()[0],order.getCount()[1],order.getCount()[2],order.getCount()[3]);
		}
	}
	
	//위의 함수 셋은 오버로딩을 사용한 함수입니다.
	
	void findBestOrder(){
		int max_price = 0;
		int max_price_num = 0;
		for(Order order : order_list){
			if(order.getPrice() > max_price){
				max_price = order.getPrice();  //max가격을 갱신합니다.
				max_price_num = order.getNo(); //그에 맞춰서 번호도 갱신합니다.
			}
		}
		Order edit = order_list.get(max_price_num-1); //edit 객체로 주문번호의 객체를 가져옵니다.
		System.out.println("가장 많은 금액을 주문한 주문서는 다음과 같습니다.");
		System.out.println("주문일시 :"+edit.getDate());																									
		System.out.println("주문고객 :"+edit.getBuyer());																									//세부 정보를 출력합니다.
		System.out.println("주문금액 :"+edit.getPrice());
		System.out.printf("주문내역 : 후라이드 %d개/ 양념%d개/ 반반%d개/ 파닭%d개\n", edit.getCount()[0],edit.getCount()[1],edit.getCount()[2],edit.getCount()[3]);
	}
	
	void report(){
		System.out.printf("매출 보고(주문 횟수 %d건)\n",orders);
		listOrder();
		System.out.println("메뉴별 총 주문 갯수");
		for(int i = 0; i<4;i++){
			System.out.println(menu_name[i]+" : "+order_menu[i]+"개");	//총 메뉴 갯수를 출력합니다.
		}
		System.out.println("총 판매굼액 : "+income);					//총 가격을 출력합니다.
	}
	

	//주문관리작업진행(start)
	void start()
	{
		Scanner s = new Scanner(System.in);
		int menu;
		boolean go=true;

		setPrice();
		while(go)
		{
			System.out.println("\n===============================================================");
			System.out.println("1.주문추가, 2.주문변경, 3.주문검색(고객별) 4.주문검색(금액별), 5.베스트, 6.매출, 7.종료");
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
				System.out.println("검색할 호갱님의 이름은? : ");
				String buyname = new Scanner(System.in).nextLine();
				listOrder(buyname);
				break;
			case 4 :
				System.out.println("검색할 최소 주문금액은? : ");
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
