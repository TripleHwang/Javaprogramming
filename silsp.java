import java.util.Scanner;

public class silsp {
	void test1(){
		Scanner s = new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���:");
		int kor = s.nextInt();
		System.out.println("���� ������ �Է��ϼ���:");
		int eng = s.nextInt();
		System.out.println("���� ������ �Է��ϼ���:");
		int math = s.nextInt();
		
		int total = kor+eng+math;
		double average = Math.round(total/3.0*10d) / 10d;
		
		System.out.println("�Է��Ͻ� ������ ������ " + total + "�̰�, ����� " + average + "�Դϴ�.");
	}
	
	void test2(){
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
	
	void test3(){
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
	
	public static void main(String[] args){
		silsp s = new silsp();
		s.test1();
		s.test2();
		s.test3();
	}

}
