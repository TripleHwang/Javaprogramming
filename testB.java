import java.util.Scanner;
public class testB {
	
	void b1(){
		Scanner s = new Scanner(System.in);
		System.out.println("태어난 년도를 입력하세요 : ");
		int birth_year = s.nextInt();
		int age = 2014-birth_year+1;
		if (age<=19){
			System.out.println("미성년자입니다.");
		}
		else{
			System.out.println("미성년자가 아닙니다");
		}
	}
	
	void b2(){
		Scanner s = new Scanner(System.in);
		System.out.println("온도를 입력하세요");
		double input_degree = s.nextDouble();
		System.out.println("입력하신 온도가 섭씨온도이면 C를, 화씨온도이면 F를 입력하세요");
		s = new Scanner(System.in);
		String kind = s.nextLine();
		
		if(kind.equals("C")){
			double output_degree = input_degree * 1.8 + 32;
			System.out.println("변환된 온도는" + output_degree + "입니다.");
		}
		else if (kind.equals("F")){
			double output_degree = (input_degree-32)/1.8;
			System.out.println("변환된 온도는" + output_degree + "입니다.");
		} else
			System.out.println(kind);
	}
	
	void b3(){
		Scanner s = new Scanner(System.in);
		System.out.println("직사각형의 가로 크기를 입력하세요");
		int width = s.nextInt();
		System.out.println("직사각형의 세로 크기를 입력하세요");
		int height = s.nextInt();
		int area = width*height;
		System.out.println("직사각형의 넓이는"+area+"이고");
		if(width==height){
			System.out.println("정사각형입니다.");
		}
		else{
			System.out.println("직사각형이 아닙니다.");
		}
	}
	
	void b4(){
		Scanner s = new Scanner(System.in);
		System.out.println("아파트의 분양 면적(제곱미터)를 입력하시오.");
		double m2_area = s.nextDouble();
		double pyung_area=m2_area/3.305;
		System.out.println("아파트의 평형은"+pyung_area+"이고,");
		if (pyung_area>=30){
			System.out.println("30평 이상이므로 큰 아파트입니다.");
		}
		else{
			System.out.println("30폄 미만이므로 작은 아파트입니다.");
		}
	}
	
	void b5(){
		Scanner s = new Scanner(System.in);
		System.out.println("날수를 입력하세요.");
		int days = s.nextInt();
		int seconds = days * 24 * 60 * 60;
		System.out.println("날수에 해당되는 기간은 모두" + seconds + "초 입니다.");
		if(seconds>=1000000){
			int m_count = seconds/1000000;
			System.out.println("100만 초가 모두"+m_count+"번이나 포함됩니다.");
		}
	}
	
	void b6(){
		Scanner s = new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요.");
		int kor = s.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng = s.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math = s.nextInt();
		
		int total = kor+eng+math;
		double average = total/3;
		System.out.println("입력하신 점수의 총점은" + total + "이고, 평균은" + average + "입니다.");
		if(kor>=90){;
			System.out.println("국어 점수가 우수합니다.");
		}
		if(eng>=90){
			System.out.println("영어 점수가 우수합니다.");
		}
		if(math>=90){
			System.out.println("수학 점수가 우수합니다.");
		}
	}
	
	void b7(){
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
	
	void b8(){
		Scanner s = new Scanner(System.in);
		System.out.println("첫번쨰 숫자를 입력하세요.");
		int num1 = s.nextInt();
		System.out.println("두번쨰 숫자를 입력하세요.");
		int num2 = s.nextInt();
		System.out.println("세번째 숫자를 입력하세요.");
		int num3 = s.nextInt();
		if(num1 == num2 || num2==num3 || num1 == num3){
			System.out.println("1번 조건 만족 : 3개의 숫자 중 적어도 두 수의 값이 같다");
		}
		if(num1+num2>=51 || num2+num3>=51 || num1+num3>=51){
			System.out.println("2번 조건 만족 : 3개의 숫자 중 적어도 두 수의 크기가 50보다 크다.");
		}
		if(num1+num2==num3 || num2+num3==num1 || num1+num3==num2){
			System.out.println("3번 조건 만족 : 3개의 숫자 중 어떤 두 수의 합이 나머지 하나의 숫자와 같다.");
		}
		if((num2%num1 == 0 && num3%num1 == 0) || (num1%num2==0 && num3%num2 ==0) || (num1%num3==0 && num2%num3==0)){
			System.out.println("4번 조건 만족 : 3개의 숫자 중 어떤 하나의 수로 다른 두 수를 나누면 나누어떨어지는 경우가 있다.");
			
		}
	}
	
	void b9(){
		Scanner s = new Scanner (System.in);
		System.out.println("신장(cm단위)을 입력하세요");
		int height = s.nextInt();
		System.out.println("체중(kg단위)를 입력하세요");
		int weight = s.nextInt();
		int bmi= weight/((height/100)*(height/100));
		if(bmi>=25){
			System.out.println("당신은 비만입니다.");
		}
		else{
			System.out.println("비만이 아닙니다.");
		}
	}
	
	public static void main(String[] args){
		testB t = new testB();
		t.b9();
		
	}

}
