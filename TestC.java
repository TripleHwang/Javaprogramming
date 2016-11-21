import java.util.Scanner;;
public class TestC {
	
	void c1(){
		Scanner s = new Scanner(System.in);
		System.out.println("태어난 년도를 입력하세요 : ");
		int birth_year = s.nextInt();
		int age = 2012-birth_year+1;
		if (age<6){
			System.out.println("유아입니다..");
		}
		else if(age>=7 && age<= 12){
			System.out.println("어린이입니다.");
		}
		else if(age>=13 && age<= 20){
			System.out.println("정소년입니다.");
		}
		else if(age>=20 && age<=29){
			System.out.println("청년입니다.");
		}
		else if(age>=30 && age<=59){
			System.out.println("중년입니다.");
		}
		else{
			System.out.println("노년입니다.");
		}
	}
	
	void c2(){
		Scanner s = new Scanner(System.in);
		System.out.println("물의 온도를 입력하세요");
		double input_degree = s.nextDouble();
		if(0 <= input_degree && input_degree < 25){
			System.out.println("냉수입니다.");
		}
		else if(25<=input_degree && input_degree < 40){
			System.out.println("미온수입니다.");
		}
		else if(40<=input_degree && input_degree < 80){
			System.out.println("온수입니다.");
		}
		else if(80<=input_degree){
			System.out.println("끓는물 입니다.");
		}
	}
	
	void c3(){
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
		else if((width/height)>=2){
			System.out.println("좌우로 길쭉한 직사각형입니다..");
		}
		else if((height/width)>=2){
			System.out.println("위아래로 길쭉한 직사각형입니다..");
		}
		else if(width>=height){
			System.out.println("일반적인 가로형 직사각형입니다.");
		}
		else if(height>=width){
			System.out.println("일반적인 가로형 직사각형입니다.");
		}
	}
	
	void c4(){
		Scanner s = new Scanner(System.in);
		System.out.println("아파트의 분양 면적(제곱미터)를 입력하시오.");
		double m2_area = s.nextDouble();
		double pyung_area=m2_area/3.305;
		if (pyung_area<15){
			System.out.println("소형 아파트입니다.");
		}
		else if (15<=pyung_area && pyung_area <30){
			System.out.println("중소형 아파트입니다.");
		}
		else if (30<=pyung_area && pyung_area <50){
			System.out.println("중형 아파트입니다.");
		}
		else if (50<=pyung_area){
			System.out.println("대형 아파트입니다.");
		}
	}
	
	void c5(){
		Scanner s = new Scanner(System.in);
		System.out.println("월을 입력하세요.");
		int month = s.nextInt();
		System.out.println("일을 입력하세요.");
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
		System.out.println("국어 점수를 입력하세요.");
		int kor = s.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int eng = s.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int math = s.nextInt();
		
		int total = kor+eng+math;
		double average = total/3;
		if(average>=90){
			System.out.println("입력하신 점수의 총점은" + total + "이고, 평균은" + average + "입니다.");
			System.out.println("수 입니다");
		}
		else if(average>=80 && average<90){
			System.out.println("입력하신 점수의 총점은" + total + "이고, 평균은" + average + "입니다.");
			System.out.println("우 입니다");
		}
		else if(average>=70 && average<80){
			System.out.println("입력하신 점수의 총점은" + total + "이고, 평균은" + average + "입니다.");
			System.out.println("미 입니다");
		}
		else if(average>=60 && average<70){
			System.out.println("입력하신 점수의 총점은" + total + "이고, 평균은" + average + "입니다.");
			System.out.println("양 입니다");
		}
		else if(average<60){
			System.out.println("입력하신 점수의 총점은" + total + "이고, 평균은" + average + "입니다.");
			System.out.println("가 입니다");
		}
	}
	
	void c7(){
		Scanner s = new Scanner(System.in);
		System.out.println("파일 용량을 메가바이트 단위로 입력하세요");
		int mega = s.nextInt();
		System.out.println("전송 방식을 1: WI-FI, 2: BlueTooth, 3: LTE 4: USB에서 선택하여 입력하세요.");
		s = new Scanner(System.in);
		byte kind = s.nextByte();
		long bytes = mega*1024*1024;
		
		if(kind == 1){
			double time = bytes/1500000.0;
			System.out.println("파일 전송 시간은" + time + "초입니다.");
		}
		else if (kind==2){
			double time = bytes/300000.0;
			System.out.println("파일 전송 시간은" + time + "초입니다.");
		}
		else if (kind==3){
			double time = bytes/1000000.0;
			System.out.println("파일 전송 시간은" + time + "초입니다.");
		}
		else if (kind==4){
			double time = bytes/60000000.0;
			System.out.println("파일 전송 시간은" + time + "초입니다.");
		}
	}
	
	void c8(){
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
	
	void c9(){
		
	}
	
	public static void main(String[] args){
		TestC t = new TestC();
		t.c7();
	}

}
