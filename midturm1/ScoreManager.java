package midturm1;
import java.util.Scanner;
import java.util.ArrayList;


public class ScoreManager {
	ArrayList<Score> scores;
	String teamname[];
	int count_game[], count_win[], count_draw[] ,count_lose[], point[];
	int gameno;
	
	public ScoreManager(){
		scores = new ArrayList<Score>();
		count_game = new int[4];
		count_win = new int[4];
		count_draw = new int[4];
		count_lose = new int[4];
		point = new int[4];
		teamname = new String[4];
		gameno = 0;
		for (int i=0;i<4;i++){
			count_game[i] = 0;
			count_win[i] = 0;
			count_draw[i] = 0;
			count_lose[i] = 0;
			point[i] = 0;
		}
	}
	
	void printTeamname(){
		System.out.println("�� ��� : ");
		for(int i=0;i<4;i++){
			System.out.println("["+i+"]"+teamname[i] + " ");
		}
		System.out.println();
	}
	
	void addScore(){
		Scanner s = new Scanner(System.in);
		printTeamname();
		System.out.println("��� ���ڸ� �Է��ϼ��� : ");
		String d = s.next();
		System.out.println("Ȩ�� ��ȣ�� ������ �Է��ϼ��� : ");
		int h = s.nextInt()-1;
		int s1 = s.nextInt();
		System.out.println("������ ��ȣ�� ������ �Է��ϼ��� : ");
		int a = s.nextInt()-1;
		int s2 = s.nextInt();
		gameno++;
		Score score = new Score(gameno, h, a, s1, s2, d);
		scores.add(score);
		count_game[h]++;
		count_game[a]++;
		if(s1>s2){
			count_win[h]++;
			count_lose[a]++;
			point[h] += 3;
		}
		else if(s1>s2){
			count_win[a]++;
			count_lose[h]++;
			point[a] += 3;
		}
		else if(s1==s2){
			count_draw[a]++;
			count_draw[h]++;
			point[h] += 1;
			point[a] += 1;
		}
	}
	
	void printScore(){
		System.out.println("����ȣ\t�����\t\t\t�����\t\t\t");
		for(Score score : scores){
			System.out.printf("%d\t%s\t%s %d : %d %s\n",score.getNo(),score.getDate(),teamname[score.getHome()],score.getH_score(),score.getA_score(),teamname[score.getAway()]);
		}
		
	}
	
	void printScore(ArrayList<Score> scores){
		System.out.println("����ȣ\t�����\t\t\t�����\t\t\t");
		for(Score score : scores){
			System.out.printf("%d\t%s\t%s %d : %d %s\n",score.getNo(),score.getDate(),teamname[score.getHome()],score.getH_score(),score.getA_score(),teamname[score.getAway()]);
		}
		
	}
	
	void findScores(int no){
		int teamno = no;
		ArrayList<Score> found;
		found = new ArrayList<>();
		for(Score score : scores){
			if(teamno==score.getHome() || teamno == score.getAway()){
				found.add(score);
			}
		}
		printScore(found);
	}
	
	void findScores(String name){
		String team_name = name;
		ArrayList<Score> found;
		found = new ArrayList<>();
		for(Score score : scores){
			if(team_name.equals(teamname[score.getHome()]) || team_name.equals(teamname[score.getAway()])){
				found.add(score);
			}
		}
		printScore(found);
	}
	
	void modifyScore(){
		System.out.println("���ϴ� ����� ��ȣ�� �Է��ϼ��� : ");
		int gamelistno = new Scanner(System.in).nextInt();
		Score edit = scores.get(gameno-1);
		if(edit.getH_score()>edit.getA_score()){
			count_win[edit.getHome()]--;
			count_lose[edit.getAway()]--;
			point[edit.getHome()] -= 3;
		}
		else if(edit.getH_score()<edit.getA_score()){
			count_win[edit.getAway()]--;
			count_lose[edit.getHome()]--;
			point[edit.getAway()] -= 3;
		}
		if(edit.getH_score()==edit.getA_score()){
			count_draw[edit.getHome()]--;
			count_draw[edit.getAway()]--;
			point[edit.getHome()] -= 1;
			point[edit.getAway()] -= 1;
		}
		System.out.println("Ȩ���� ���ھ��? : ");
		edit.setH_score(new Scanner(System.in).nextInt());
		System.out.println("����� ���� ���ھ��?");
		edit.setA_score(new Scanner(System.in).nextInt());
		System.out.println("�����Ϸ�");
		if(edit.getH_score()>edit.getA_score()){
			count_win[edit.getHome()]++;
			count_lose[edit.getAway()]++;
			point[edit.getHome()] += 3;
		}
		else if(edit.getH_score()<edit.getA_score()){
			count_win[edit.getAway()]++;
			count_lose[edit.getHome()]++;
			point[edit.getAway()] += 3;
		}
		if(edit.getH_score()==edit.getA_score()){
			count_draw[edit.getHome()]++;
			count_draw[edit.getAway()]++;
			point[edit.getHome()] += 1;
			point[edit.getAway()] += 1;
		}
	}
	
	void viewMatchScore(){
		System.out.println("��1�� ��ȣ�� �����ϼ���");
		int firstteam = new Scanner(System.in).nextInt()-1;
		System.out.println("��2�� ��ȣ�� �����ϼ���");
		int secondteam = new Scanner(System.in).nextInt()-1;
		int win = 0, lose = 0, draw = 0;
		ArrayList<Score> found;
		found = new ArrayList<>();
		for(Score score : scores){
			if((teamname[firstteam].equals(teamname[score.getHome()]) || (teamname[firstteam].equals(teamname[score.getAway()])) && teamname[secondteam].equals(teamname[score.getHome()]) || teamname[secondteam].equals(teamname[score.getAway()])) ){
				found.add(score);
			}
		}
		for (Score f : found){
			
		}
		
	}
	
	void viewResult(){
		int bestteam = 0;
		int lastteamscore = 0;
		for(int i = 0; i<4;i++){
			System.out.printf("%s:%d�� %d�� %d�� %d��",teamname[i],count_win[i],count_lose[i],count_draw[i],point[i]);
			if(lastteamscore<point[i]){
				bestteam = i;
				lastteamscore = point[i];
			}
		}
		System.out.println("1�� ����" + teamname[bestteam] + "�Դϴ�!");
	}
	
	
	void start(){
		int menu;
		boolean go=true;
		Scanner s = new Scanner(System.in);
		for(int i = 0; i<4;i++){
			System.out.println((i+1) + "�� ���� �̸���?");
			teamname[i] = s.next();
		}
		while(go){
			System.out.println("1.���ھ� ���, 2.���ھ� ����, 3.��ü ���ھ� ���, 4.���ھ� �˻�, 5.������, 6.�������, 7.����");
			System.out.println("�޴� ���� : ");
			menu = new Scanner(System.in).nextInt();
			switch(menu){
			case 1 :
				addScore();
				break;
			case 2 :
				modifyScore();
				break;
			case 3 :
				printScore();
				break;
			case 4 :
				printScore();
				break;
			case 5 :
				printScore();
				break;
			case 6 :
				printScore();
				break;
			case 7 :
				go = false;
				break;
			}
		}
		
	}
	
	public static void main(String[] args){
		ScoreManager s = new ScoreManager();
		s.start();
	}
}
