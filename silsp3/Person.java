package silsp3;

public class Person {
	private String name;
	private String sex;
	private String addr;
	private String phone;
	
	public Person(String name, String sex, String addr, String phone){
		this.name = name;
		this.sex = sex;
		this.addr = addr;
		this.phone = phone;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}
