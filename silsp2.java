import java.util.Scanner;
import java.util.regex.*;

public class silsp2 {
	
	void s1(){
		Scanner s = new Scanner(System.in);
		int number=0;
		int max_num, min_num;
		System.out.println("0���� 100 ������ ���ڸ� �Է��ϼ���.");
		number = s.nextInt();
		max_num = number;
		min_num = number;
		while(0<=number && number<=100){
			System.out.println("0���� 100 ������ ���ڸ� �Է��ϼ���.");
			number = s.nextInt();
			if (number>=max_num){
				max_num = number;
			}
			if (number<=min_num){
				min_num = number;
			}
			
		}
		System.out.println("�Էµ� ���ڵ��� ���� ū ���� " + max_num + "�̰�, ���� ���� ����" + min_num + "�Դϴ�.");
	}
	
	void s2(){
		Scanner s = new Scanner(System.in);
		System.out.println("�̵�ﰢ���� ���̸� �Է��ϼ���. ");
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
			System.out.println(i+1 + "��° ����� ����� ü���� �Է��Ͻÿ�.");
			height = s.nextInt();
			weight = s.nextInt();
			bmi = (int) Math.round(weight/((height/100.0)*(height/100.0)));
			bmilist[i][0] = height;
			bmilist[i][1] = weight;
			bmilist[i][2] = bmi;
		}
		for(int i=0; i<10; i++){
			if(bmilist[i][2]>=25){
				System.out.println(i+1+"��° ����� ���Դϴ�.");
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
		System.out.println("���� �湮�� �� ���� �Է��ϼ��� ");
		int team_count = s.nextInt();
		for(int i=0;i<team_count;i++){
			System.out.println(i+1+"���� �ο���(�ʵ��л�,û�ҳ�, �Ϲ�, ��δ��)�� �Է��ϼ���.");
			count[0] = s.nextInt(); count[1] = s.nextInt(); count[2] = s.nextInt(); count[3] = s.nextInt();
			System.out.println(i+1+"���� ����ī�� ����(ī�����:0, �Ϲݵ�� : 1, VIP��� : 2)�� �Է��ϼ���");
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
			System.out.println(i+1+"���� ������ "+sum+"���Դϴ�");
			v_count[0] += count[0]; v_count[1] += count[1]; v_count[2] += count[2]; v_count[3] += count[3];
			total_count = v_count[0]+v_count[1]+v_count[2]+v_count[3];
		}
		System.out.println("���� �� �湮�� ����" + total_count + "���Դϴ�.");
		System.out.println("�ʵ��л� ����" + v_count[0] + "���Դϴ�.");
		System.out.println("û�ҳ� ����" + v_count[1] + "���Դϴ�.");
		System.out.println("�Ϲ��� ����" + v_count[2] + "���Դϴ�.");
		System.out.println("��δ�� ����" + v_count[3] + "���Դϴ�.");
		System.out.println("�� ������" + total_sum +"�� �Դϴ�.");
	}
	
	void s5(){
		int count = 0;
		Scanner s = new Scanner(System.in);
		while(true){
			System.out.println("=>���ڿ��� �Է��ϼ��� (x: ����) :");
			String input = s.nextLine();
			if(input.equals("x"))
				break;
			System.out.println("ã�� ���ڿ��� �Է��ϼ��� : ");
			String findStr = s.nextLine();
			Pattern a = Pattern.compile(findStr);
			Matcher m = a.matcher(input);
			for(int i=0; m.find(i); i=m.end()){
				count++;
			}
			System.out.println("�ٲ� ���ڿ��� �Է��ϼ��� : ");
			String replaceStr = s.nextLine();
			input = input.replace(findStr, replaceStr);
			System.out.println("=> ��" + count + "�� �ٲ�����ϴ�.");
			System.out.println(input);
		}
		System.out.println("* ����Ǿ����ϴ�.");
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
