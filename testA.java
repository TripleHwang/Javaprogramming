import java.util.Scanner;
public class testA {
	void test(){
		System.out.println("Hello JAVA!");
	}
	
	void a1(){
		Scanner s = new Scanner(System.in);
		System.out.println("태어난 년도 입력:");
		int birth_age = s.nextInt();
		
		int age = 2016-birth_age+1;
		System.out.println("당신의 나이는" + age + "세 입니다. 급식일지도 모르겠네여");
		
	}
	
	void a2(){
		Scanner s = new Scanner(System.in);
		System.out.println("섭씨 온도?:");
		double c_degree = s.nextInt();
		
		double f_degree = c_degree*1.8+32;
		System.out.println("화씨 온도는" + f_degree + "도 입니다.");
		
	}
	
	void a3(){
		Scanner s = new Scanner(System.in);
		System.out.println("가로 넓이??:");
		int width = s.nextInt();
		
		System.out.println("세로 넓이??:");
		int height = s.nextInt();
		
		int area = height*width;
		System.out.println("넓이는" + area + "입니다.");
		
	}
	
	void a4(){
		Scanner s = new Scanner(System.in);
		System.out.println("아파트 면적:");
		double m2_area = s.nextDouble();
		
		double pyung_area = m2_area/3.305;
		System.out.println("평수는" + pyung_area + "평 입니다.");
		
	}
	
	void a5(){
		Scanner s = new Scanner(System.in);
		System.out.println("날짜:");
		int days = s.nextInt();
		
		int seconds = days * 60 * 60 * 12;
		System.out.println("초는" + seconds + "초");
		
	}
	
	void a6(){
		Scanner s = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요:");
		int kor = s.nextInt();
		System.out.println("영어 점수를 입력하세요:");
		int eng = s.nextInt();
		System.out.println("수학 점수를 입력하세요:");
		int math = s.nextInt();
		
		int total = kor+eng+math;
		double average = total/3.0;
		
		System.out.println("입력하신 점수의 총점은 " + total + "이고, 평균은 " + average + "입니다.");
	}
	
	void a7(){
		int giga, mega;
		long kilo;
		long bytes;
		Scanner s = new Scanner(System.in);
		System.out.println("파일 용량을 기가바이트 단위로 입력하세요");
		giga = s.nextInt();
		mega = giga*1024;
		kilo = mega * 1024;
		bytes = kilo * 1024;
		System.out.println("입력하신 파일 용량은\n" + mega + "메가바이트,\n" + kilo + "킬로바이트,\n" + bytes + "바이트입니다.");
	}
	
	public static void main(String[] args){
		testA t = new testA();
		t.test();
		t.a7();
	}
		
}
