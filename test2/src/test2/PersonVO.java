package test2;

public class PersonVO {
	private String name;
	private String addr;
	private String tel;
	private int no;
	private int age;
	// HEAD 는 마스터에서 수정한 부분, 같은 라인을 수정시켰기때문에 충돌이 일어남 내용과는 무관하다!

	private String gender;
	

	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	



}
