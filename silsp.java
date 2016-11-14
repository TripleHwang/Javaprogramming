import java.util.Scanner;

public class silsp {
	void test1(){
		Scanner s = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요:");
		int kor = s.nextInt();
		System.out.println("영어 점수를 입력하세요:");
		int eng = s.nextInt();
		System.out.println("수학 점수를 입력하세요:");
		int math = s.nextInt();
		
		int total = kor+eng+math;
		double average = Math.round(total/3.0*10d) / 10d;
		
		System.out.println("입력하신 점수의 총점은 " + total + "이고, 평균은 " + average + "입니다.");
	}
	
	void test2(){
		Scanner s = new Scanner(System.in);
		System.out.println("파일 용량을 메가바이트 단위로 입력하세요");
		int mega = s.nextInt();
		System.out.println("USB포트가 2.0이면 Y, 아니면 N을 입력하세요.");
		s = new Scanner(System.in);
		String usb2 = s.nextLine();
		
		if(usb2.equals("Y")){
			long bytes = mega*1024*1024;
			long time = bytes/60000000;
			System.out.println("파일 전송 시간은" + time + "초입니다.");
			
		}
		else{
			long bytes = mega*1024*1024;
			long time = bytes/1500000;
			System.out.println("파일 전송 시간은" + time + "초입니다.");
		}
	}
	
	void test3(){
		Scanner s = new Scanner(System.in);
		System.out.println("첫번쨰 숫자를 입력하세요.");
		int num1 = s.nextInt();
		System.out.println("두번쨰 숫자를 입력하세요.");
		int num2 = s.nextInt();
		System.out.println("세번째 숫자를 입력하세요.");
		int num3 = s.nextInt();
		int max_num = ((num1 > num2) ? ((num1 > num3) ? num1 : num3 ) : ((num2 > num3) ? num2 : num3 )); 
		int min_num = ((num1 < num2) ? ((num1 < num3) ? num1 : num3 ) : ((num2 < num3) ? num2 : num3 ));
		System.out.println("가장 큰 수는 " + max_num +" 이고, 가장 작은 수는 " + min_num + " 입니다.");
	}
	
	public static void main(String[] args){
		silsp s = new silsp();
		s.test1();
		s.test2();
		s.test3();
	}

}
