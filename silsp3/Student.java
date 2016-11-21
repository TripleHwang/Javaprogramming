package silsp3;

public class Student extends Person {
	
	private String haknum;
	private String isbok;

	public Student(String name, String haknum, String sex, String addr, String phone, String isbok) {
		super(name, sex, addr, phone);
		this.haknum = haknum;
		this.isbok = isbok;
	}
	public String getHaknum() {
		return haknum;
	}

	public void setHaknum(String haknum) {
		this.haknum = haknum;
	}

	public String getIsbok() {
		return isbok;
	}

	public void setIsbok(String isbok) {
		this.isbok = isbok;
	}
	
	@Override
	public String toString(){
		return haknum;
	}

}
