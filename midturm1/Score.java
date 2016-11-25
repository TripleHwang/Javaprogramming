package midturm1;

public class Score {
	int no, home, away, h_score, a_score;
	String date;
	
	public Score(int n, int h, int a, int s1, int s2, String d){
		this.no = n;
		this.home = h;
		this.away = a;
		this.h_score = s1;
		this.a_score = s2;
		this.date = d;
		
	}
	
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public int getHome() {
		return home;
	}

	public void setHome(int home) {
		this.home = home;
	}

	public int getAway() {
		return away;
	}

	public void setAway(int away) {
		this.away = away;
	}

	public int getH_score() {
		return h_score;
	}

	public void setH_score(int h_score) {
		this.h_score = h_score;
	}

	public int getA_score() {
		return a_score;
	}

	public void setA_score(int a_score) {
		this.a_score = a_score;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
