import java.util.Scanner;
public class testA {
	void test(){
		System.out.println("Hello JAVA!");
	}
	
	void a1(){
		Scanner s = new Scanner(System.in);
		System.out.println("�¾ �⵵ �Է�:");
		int birth_age = s.nextInt();
		
		int age = 2016-birth_age+1;
		System.out.println("����� ���̴�" + age + "�� �Դϴ�. �޽������� �𸣰ڳ׿�");
		
	}
	
	void a2(){
		Scanner s = new Scanner(System.in);
		System.out.println("���� �µ�?:");
		double c_degree = s.nextInt();
		
		double f_degree = c_degree*1.8+32;
		System.out.println("ȭ�� �µ���" + f_degree + "�� �Դϴ�.");
		
	}
	
	void a3(){
		Scanner s = new Scanner(System.in);
		System.out.println("���� ����??:");
		int width = s.nextInt();
		
		System.out.println("���� ����??:");
		int height = s.nextInt();
		
		int area = height*width;
		System.out.println("���̴�" + area + "�Դϴ�.");
		
	}
	
	void a4(){
		Scanner s = new Scanner(System.in);
		System.out.println("����Ʈ ����:");
		double m2_area = s.nextDouble();
		
		double pyung_area = m2_area/3.305;
		System.out.println("�����" + pyung_area + "�� �Դϴ�.");
		
	}
	
	void a5(){
		Scanner s = new Scanner(System.in);
		System.out.println("��¥:");
		int days = s.nextInt();
		
		int seconds = days * 60 * 60 * 12;
		System.out.println("�ʴ�" + seconds + "��");
		
	}
	
	void a6(){
		Scanner s = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���:");
		int kor = s.nextInt();
		System.out.println("���� ������ �Է��ϼ���:");
		int eng = s.nextInt();
		System.out.println("���� ������ �Է��ϼ���:");
		int math = s.nextInt();
		
		int total = kor+eng+math;
		double average = total/3.0;
		
		System.out.println("�Է��Ͻ� ������ ������ " + total + "�̰�, ����� " + average + "�Դϴ�.");
	}
	
	void a7(){
		int giga, mega;
		long kilo;
		long bytes;
		Scanner s = new Scanner(System.in);
		System.out.println("���� �뷮�� �Ⱑ����Ʈ ������ �Է��ϼ���");
		giga = s.nextInt();
		mega = giga*1024;
		kilo = mega * 1024;
		bytes = kilo * 1024;
		System.out.println("�Է��Ͻ� ���� �뷮��\n" + mega + "�ް�����Ʈ,\n" + kilo + "ų�ι���Ʈ,\n" + bytes + "����Ʈ�Դϴ�.");
	}
	
	public static void main(String[] args){
		testA t = new testA();
		t.test();
		t.a7();
	}
		
}
