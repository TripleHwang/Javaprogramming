import java.util.Scanner;;
public class TestC {
	
	void c1(){
		Scanner s = new Scanner(System.in);
		System.out.println("�¾ �⵵�� �Է��ϼ��� : ");
		int birth_year = s.nextInt();
		int age = 2012-birth_year+1;
		if (age<6){
			System.out.println("�����Դϴ�..");
		}
		else if(age>=7 && age<= 12){
			System.out.println("����Դϴ�.");
		}
		else if(age>=13 && age<= 20){
			System.out.println("���ҳ��Դϴ�.");
		}
		else if(age>=20 && age<=29){
			System.out.println("û���Դϴ�.");
		}
		else if(age>=30 && age<=59){
			System.out.println("�߳��Դϴ�.");
		}
		else{
			System.out.println("����Դϴ�.");
		}
	}
	
	void c2(){
		Scanner s = new Scanner(System.in);
		System.out.println("���� �µ��� �Է��ϼ���");
		double input_degree = s.nextDouble();
		if(0 <= input_degree && input_degree < 25){
			System.out.println("�ü��Դϴ�.");
		}
		else if(25<=input_degree && input_degree < 40){
			System.out.println("�̿¼��Դϴ�.");
		}
		else if(40<=input_degree && input_degree < 80){
			System.out.println("�¼��Դϴ�.");
		}
		else if(80<=input_degree){
			System.out.println("���¹� �Դϴ�.");
		}
	}
	
	void c3(){
		Scanner s = new Scanner(System.in);
		System.out.println("���簢���� ���� ũ�⸦ �Է��ϼ���");
		int width = s.nextInt();
		System.out.println("���簢���� ���� ũ�⸦ �Է��ϼ���");
		int height = s.nextInt();
		int area = width*height;
		System.out.println("���簢���� ���̴�"+area+"�̰�");
		if(width==height){
			System.out.println("���簢���Դϴ�.");
		}
		else if((width/height)>=2){
			System.out.println("�¿�� ������ ���簢���Դϴ�..");
		}
		else if((height/width)>=2){
			System.out.println("���Ʒ��� ������ ���簢���Դϴ�..");
		}
		else if(width>=height){
			System.out.println("�Ϲ����� ������ ���簢���Դϴ�.");
		}
		else if(height>=width){
			System.out.println("�Ϲ����� ������ ���簢���Դϴ�.");
		}
	}
	
	void c4(){
		Scanner s = new Scanner(System.in);
		System.out.println("����Ʈ�� �о� ����(��������)�� �Է��Ͻÿ�.");
		double m2_area = s.nextDouble();
		double pyung_area=m2_area/3.305;
		if (pyung_area<15){
			System.out.println("���� ����Ʈ�Դϴ�.");
		}
		else if (15<=pyung_area && pyung_area <30){
			System.out.println("�߼��� ����Ʈ�Դϴ�.");
		}
		else if (30<=pyung_area && pyung_area <50){
			System.out.println("���� ����Ʈ�Դϴ�.");
		}
		else if (50<=pyung_area){
			System.out.println("���� ����Ʈ�Դϴ�.");
		}
	}
	
	void c5(){
		Scanner s = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���.");
		int month = s.nextInt();
		System.out.println("���� �Է��ϼ���.");
		int days = s.nextInt();
		int seconds = days * 24 * 60 * 60;
		if(month == 1){
			int day_count = days;
		}
		else if(month==2){
			int day_count = 31+days;
		}
		else if(month==3){
			int day_count = 31+28+days;
		}
		else if(month==4){
			int day_count = 31+28+31+days;
		}
		else if(month==5){
			int day_count = 31+28+31+30+days;
		}
		else if(month==6){
			int day_count = 31+28+31+30+31+days;
		}
		else if(month==7){
			int day_count = 31+28+31+30+31+30+days;
		}
		else if(month==8){
			int day_count = 31+28+31+30+31+30+31+days;
		}
		else if(month==9){
			int day_count = 31+28+31+30+31+30+31+31+days;
		}
		else if(month==10){
			int day_count = 31+28+31+30+31+30+31+31+30+days;
		}
		else if(month==11){
			int day_count = 31+28+31+30+31+30+31+31+30+31+days;
		}
		else if(month==12){
			int day_count = 31+28+31+30+31+30+31+31+30+31+30+days;
		}
	}
	
	void c6(){
		Scanner s = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���.");
		int kor = s.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		int eng = s.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		int math = s.nextInt();
		
		int total = kor+eng+math;
		double average = total/3;
		if(average>=90){
			System.out.println("�Է��Ͻ� ������ ������" + total + "�̰�, �����" + average + "�Դϴ�.");
			System.out.println("�� �Դϴ�");
		}
		else if(average>=80 && average<90){
			System.out.println("�Է��Ͻ� ������ ������" + total + "�̰�, �����" + average + "�Դϴ�.");
			System.out.println("�� �Դϴ�");
		}
		else if(average>=70 && average<80){
			System.out.println("�Է��Ͻ� ������ ������" + total + "�̰�, �����" + average + "�Դϴ�.");
			System.out.println("�� �Դϴ�");
		}
		else if(average>=60 && average<70){
			System.out.println("�Է��Ͻ� ������ ������" + total + "�̰�, �����" + average + "�Դϴ�.");
			System.out.println("�� �Դϴ�");
		}
		else if(average<60){
			System.out.println("�Է��Ͻ� ������ ������" + total + "�̰�, �����" + average + "�Դϴ�.");
			System.out.println("�� �Դϴ�");
		}
	}
	
	void c7(){
		Scanner s = new Scanner(System.in);
		System.out.println("���� �뷮�� �ް�����Ʈ ������ �Է��ϼ���");
		int mega = s.nextInt();
		System.out.println("���� ����� 1: WI-FI, 2: BlueTooth, 3: LTE 4: USB���� �����Ͽ� �Է��ϼ���.");
		s = new Scanner(System.in);
		byte kind = s.nextByte();
		long bytes = mega*1024*1024;
		
		if(kind == 1){
			double time = bytes/1500000.0;
			System.out.println("���� ���� �ð���" + time + "���Դϴ�.");
		}
		else if (kind==2){
			double time = bytes/300000.0;
			System.out.println("���� ���� �ð���" + time + "���Դϴ�.");
		}
		else if (kind==3){
			double time = bytes/1000000.0;
			System.out.println("���� ���� �ð���" + time + "���Դϴ�.");
		}
		else if (kind==4){
			double time = bytes/60000000.0;
			System.out.println("���� ���� �ð���" + time + "���Դϴ�.");
		}
	}
	
	void c8(){
		Scanner s = new Scanner(System.in);
		System.out.println("ù���� ���ڸ� �Է��ϼ���.");
		int num1 = s.nextInt();
		System.out.println("�ι��� ���ڸ� �Է��ϼ���.");
		int num2 = s.nextInt();
		System.out.println("����° ���ڸ� �Է��ϼ���.");
		int num3 = s.nextInt();
		int max_num = ((num1 > num2) ? ((num1 > num3) ? num1 : num3 ) : ((num2 > num3) ? num2 : num3 )); 
		int min_num = ((num1 < num2) ? ((num1 < num3) ? num1 : num3 ) : ((num2 < num3) ? num2 : num3 ));
		System.out.println("���� ū ���� " + max_num +" �̰�, ���� ���� ���� " + min_num + " �Դϴ�.");
	}
	
	void c9(){
		
	}
	
	public static void main(String[] args){
		TestC t = new TestC();
		t.c7();
	}

}
