import java.util.Scanner;
import java.util.regex.*;

public class silsp2 {
	
	void s1(){
		Scanner s = new Scanner(System.in);
		int number=0;
		int max_num, min_num;
		System.out.println("0부터 100 사이의 숫자를 입력하세요.");
		number = s.nextInt();
		max_num = number;
		min_num = number;
		while(0<=number && number<=100){
			System.out.println("0부터 100 사이의 숫자를 입력하세요.");
			number = s.nextInt();
			if (number>=max_num){
				max_num = number;
			}
			if (number<=min_num){
				min_num = number;
			}
			
		}
		System.out.println("입력된 숫자들중 가장 큰 수는 " + max_num + "이고, 가장 작은 수는" + min_num + "입니다.");
	}
	
	void s2(){
		Scanner s = new Scanner(System.in);
		System.out.println("이등변삼각형의 높이를 입력하세요. ");
		int height = s.nextInt();
		for(int i=0;i<20;i++){
			for (int j=0;j<height-i;j++){
				System.out.print(" ");
			}
			for (int j=0;j<i*2+1;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	void s3(){
		Scanner s = new Scanner(System.in);
		int height, weight, bmi;
		int count = 0;
		int bmilist[][] = new int[10][3];
		for(int i=0;i<10;i++){
			System.out.println(i+1 + "번째 사람의 신장과 체중을 입력하시오.");
			height = s.nextInt();
			weight = s.nextInt();
			bmi = (int) Math.round(weight/((height/100.0)*(height/100.0)));
			bmilist[i][0] = height;
			bmilist[i][1] = weight;
			bmilist[i][2] = bmi;
		}
		for(int i=0; i<10; i++){
			if(bmilist[i][2]>=25){
				System.out.println(i+1+"번째 사람은 비만입니다.");
			}
		}
	}
	
	void s4(){
		int charge[] = new int[4];
		charge[0]=5000; charge[1]=10000; charge[2]=15000; charge[3]=3000;
		int count[] = new int[4];
		int v_count[] = new int[4];
		int total_count = 0;
		int sum = 0;
		int total_sum = 0;
		int membership=0;
		Scanner s = new Scanner(System.in);
		System.out.println("오늘 방문한 팀 수를 입력하세요 ");
		int team_count = s.nextInt();
		for(int i=0;i<team_count;i++){
			System.out.println(i+1+"번팀 인원수(초등학생,청소년, 일반, 경로대상)을 입력하세요.");
			count[0] = s.nextInt(); count[1] = s.nextInt(); count[2] = s.nextInt(); count[3] = s.nextInt();
			System.out.println(i+1+"번팀 할인카드 종류(카드없음:0, 일반등급 : 1, VIP등급 : 2)를 입력하세요");
			membership = s.nextInt();
			if(membership == 0){
				sum = (charge[0] * count[0]) + (charge[1] * count[1]) + (charge[2] * count[2]) + (charge[3] * count[3]);
				total_sum += sum;
			}
			else if(membership == 1){
				sum =(int) Math.round( ((charge[0] * count[0]) + (charge[1] * count[1]) + (charge[2] * count[2]) + (charge[3] * count[3])) * 0.9);
				total_sum += sum;
			}
			else if(membership == 2){
				sum =(int) Math.round( ((charge[0] * count[0]) + (charge[1] * count[1]) + (charge[2] * count[2]) + (charge[3] * count[3])) * 0.8);
				total_sum += sum;
			}
			System.out.println(i+1+"번팀 입장료는 "+sum+"원입니다");
			v_count[0] += count[0]; v_count[1] += count[1]; v_count[2] += count[2]; v_count[3] += count[3];
			total_count = v_count[0]+v_count[1]+v_count[2]+v_count[3];
		}
		System.out.println("오늘 총 방문자 수는" + total_count + "명입니다.");
		System.out.println("초등학생 수는" + v_count[0] + "명입니다.");
		System.out.println("청소년 수는" + v_count[1] + "명입니다.");
		System.out.println("일반인 수는" + v_count[2] + "명입니다.");
		System.out.println("경로대상 수는" + v_count[3] + "명입니다.");
		System.out.println("총 입장료는" + total_sum +"원 입니다.");
	}
	
	void s5(){
		int count = 0;
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("=>문자열을 입력하세요 (x: 종료) :");
			String input = s.nextLine();
			if(input.equals("x"))
				break;
			System.out.println("찾을 문자열을 입력하세요 : ");
			String findStr = s.nextLine();
			Pattern a = Pattern.compile(findStr);
			Matcher m = a.matcher(input);
			for(int i=0; m.find(i); i=m.end()){
				count++;
			}
			System.out.println("바꿀 문자열을 입력하세요 : ");
			String replaceStr = s.nextLine();
			input = input.replace(findStr, replaceStr);
			System.out.println("=> 총" + count + "번 바뀌었습니다.");
			System.out.println(input);
		}
		System.out.println("* 종료되었습니다.");
	}
	
	public static void main(String[] args){
		silsp2 s = new silsp2();
		s.s1();
		s.s2();
		s.s3();
		s.s4();
		s.s5();
	}

}
