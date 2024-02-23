package org.kh.object1;
//public(모든 패키지/클래스(*)에서 접근 가능) 
//> protected(동일/상속/연관, 동일 패키지에서 접근 가능) 
//> default(동일 패키지에서 접근 가능) 
//> private(현재 클래스에서 접근 가능, 같은 패키지에서도 접근 불가능) 
public class Member {
	private String name;
	private String id;
	private String pw;
	private String email;
	private int birth;
	private String tel;
	
	//메소드에는 private를 쓰지 않음
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getBirth() {
		return birth;
	}

	public void setBirth(int birth) {
		this.birth = birth;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", pw=" + pw + ", email=" + email + ", birth=" + birth + ", tel="
				+ tel + "]";
	}

	
}
