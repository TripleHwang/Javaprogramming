import java.util.Scanner;
public class testB {
	
	void b1(){
		Scanner s = new Scanner(System.in);
		System.out.println("�¾ �⵵�� �Է��ϼ��� : ");
		int birth_year = s.nextInt();
		int age = 2014-birth_year+1;
		if (age<=19){
			System.out.println("�̼������Դϴ�.");
		}
		else{
			System.out.println("�̼����ڰ� �ƴմϴ�");
		}
	}
	
	void b2(){
		Scanner s = new Scanner(System.in);
		System.out.println("�µ��� �Է��ϼ���");
		double input_degree = s.nextDouble();
		System.out.println("�Է��Ͻ� �µ��� �����µ��̸� C��, ȭ���µ��̸� F�� �Է��ϼ���");
		s = new Scanner(System.in);
		String kind = s.nextLine();
		
		if(kind.equals("C")){
			double output_degree = input_degree * 1.8 + 32;
			System.out.println("��ȯ�� �µ���" + output_degree + "�Դϴ�.");
		}
		else if (kind.equals("F")){
			double output_degree = (input_degree-32)/1.8;
			System.out.println("��ȯ�� �µ���" + output_degree + "�Դϴ�.");
		} else
			System.out.println(kind);
	}
	
	void b3(){
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
		else{
			System.out.println("���簢���� �ƴմϴ�.");
		}
	}
	
	void b4(){
		Scanner s = new Scanner(System.in);
		System.out.println("����Ʈ�� �о� ����(��������)�� �Է��Ͻÿ�.");
		double m2_area = s.nextDouble();
		double pyung_area=m2_area/3.305;
		System.out.println("����Ʈ�� ������"+pyung_area+"�̰�,");
		if (pyung_area>=30){
			System.out.println("30�� �̻��̹Ƿ� ū ����Ʈ�Դϴ�.");
		}
		else{
			System.out.println("30�� �̸��̹Ƿ� ���� ����Ʈ�Դϴ�.");
		}
	}
	
	void b5(){
		Scanner s = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���.");
		int days = s.nextInt();
		int seconds = days * 24 * 60 * 60;
		System.out.println("������ �ش�Ǵ� �Ⱓ�� ���" + seconds + "�� �Դϴ�.");
		if(seconds>=1000000){
			int m_count = seconds/1000000;
			System.out.println("100�� �ʰ� ���"+m_count+"���̳� ���Ե˴ϴ�.");
		}
	}
	
	void b6(){
		Scanner s = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���.");
		int kor = s.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		int eng = s.nextInt();
		System.out.println("���� ������ �Է��ϼ���.");
		int math = s.nextInt();
		
		int total = kor+eng+math;
		double average = total/3;
		System.out.println("�Է��Ͻ� ������ ������" + total + "�̰�, �����" + average + "�Դϴ�.");
		if(kor>=90){;
			System.out.println("���� ������ ����մϴ�.");
		}
		if(eng>=90){
			System.out.println("���� ������ ����մϴ�.");
		}
		if(math>=90){
			System.out.println("���� ������ ����մϴ�.");
		}
	}
	
	void b7(){
		Scanner s = new Scanner(System.in);
		System.out.println("���� �뷮�� �ް�����Ʈ ������ �Է��ϼ���");
		int mega = s.nextInt();
		System.out.println("USB��Ʈ�� 2.0�̸� Y, �ƴϸ� N�� �Է��ϼ���.");
		s = new Scanner(System.in);
		String usb2 = s.nextLine();
		
		if(usb2.equals("Y")){
			long bytes = mega*1024*1024;
			long time = bytes/60000000;
			System.out.println("���� ���� �ð���" + time + "���Դϴ�.");
			
		}
		else{
			long bytes = mega*1024*1024;
			long time = bytes/1500000;
			System.out.println("���� ���� �ð���" + time + "���Դϴ�.");
		}
	}
	
	void b8(){
		Scanner s = new Scanner(System.in);
		System.out.println("ù���� ���ڸ� �Է��ϼ���.");
		int num1 = s.nextInt();
		System.out.println("�ι��� ���ڸ� �Է��ϼ���.");
		int num2 = s.nextInt();
		System.out.println("����° ���ڸ� �Է��ϼ���.");
		int num3 = s.nextInt();
		if(num1 == num2 || num2==num3 || num1 == num3){
			System.out.println("1�� ���� ���� : 3���� ���� �� ��� �� ���� ���� ����");
		}
		if(num1+num2>=51 || num2+num3>=51 || num1+num3>=51){
			System.out.println("2�� ���� ���� : 3���� ���� �� ��� �� ���� ũ�Ⱑ 50���� ũ��.");
		}
		if(num1+num2==num3 || num2+num3==num1 || num1+num3==num2){
			System.out.println("3�� ���� ���� : 3���� ���� �� � �� ���� ���� ������ �ϳ��� ���ڿ� ����.");
		}
		if((num2%num1 == 0 && num3%num1 == 0) || (num1%num2==0 && num3%num2 ==0) || (num1%num3==0 && num2%num3==0)){
			System.out.println("4�� ���� ���� : 3���� ���� �� � �ϳ��� ���� �ٸ� �� ���� ������ ����������� ��찡 �ִ�.");
			
		}
	}
	
	void b9(){
		Scanner s = new Scanner (System.in);
		System.out.println("����(cm����)�� �Է��ϼ���");
		int height = s.nextInt();
		System.out.println("ü��(kg����)�� �Է��ϼ���");
		int weight = s.nextInt();
		int bmi= weight/((height/100)*(height/100));
		if(bmi>=25){
			System.out.println("����� ���Դϴ�.");
		}
		else{
			System.out.println("���� �ƴմϴ�.");
		}
	}
	
	public static void main(String[] args){
		testB t = new testB();
		t.b9();
		
	}

}
