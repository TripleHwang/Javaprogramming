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
		System.out.println("팀 목록 : ");
		for(int i=0;i<4;i++){
			System.out.println("["+i+"]"+teamname[i] + " ");
		}
		System.out.println();
	}
	
	void addScore(){
		Scanner s = new Scanner(System.in);
		printTeamname();
		System.out.println("경기 일자를 입력하세요 : ");
		String d = s.next();
		System.out.println("홈팀 번호와 점수를 입력하세요 : ");
		int h = s.nextInt()-1;
		int s1 = s.nextInt();
		System.out.println("원정팀 번호와 점수를 입력하세요 : ");
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
		System.out.println("경기번호\t경기일\t\t\t경기결과\t\t\t");
		for(Score score : scores){
			System.out.printf("%d\t%s\t%s %d : %d %s\n",score.getNo(),score.getDate(),teamname[score.getHome()],score.getH_score(),score.getA_score(),teamname[score.getAway()]);
		}
		
	}
	
	void printScore(ArrayList<Score> scores){
		System.out.println("경기번호\t경기일\t\t\t경기결과\t\t\t");
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
		System.out.println("원하는 경기의 번호를 입력하세요 : ");
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
		System.out.println("홈팀의 스코어는? : ");
		edit.setH_score(new Scanner(System.in).nextInt());
		System.out.println("어웨이 팀의 스코어는?");
		edit.setA_score(new Scanner(System.in).nextInt());
		System.out.println("수정완료");
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
		System.out.println("팀1의 번호를 선택하세요");
		int firstteam = new Scanner(System.in).nextInt()-1;
		System.out.println("팀2의 번호를 선택하세요");
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
			System.out.printf("%s:%d승 %d패 %d무 %d점",teamname[i],count_win[i],count_lose[i],count_draw[i],point[i]);
			if(lastteamscore<point[i]){
				bestteam = i;
				lastteamscore = point[i];
			}
		}
		System.out.println("1위 팀은" + teamname[bestteam] + "입니다!");
	}
	
	
	void start(){
		int menu;
		boolean go=true;
		Scanner s = new Scanner(System.in);
		for(int i = 0; i<4;i++){
			System.out.println((i+1) + "번 팀의 이름은?");
			teamname[i] = s.next();
		}
		while(go){
			System.out.println("1.스코어 등록, 2.스코어 수정, 3.전체 스코어 출력, 4.스코어 검색, 5.경기통계, 6.상대전적, 7.종료");
			System.out.println("메뉴 선택 : ");
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
