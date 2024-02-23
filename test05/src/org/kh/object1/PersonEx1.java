package org.kh.object1;

public class PersonEx1 {
	public static void main(String[] args) {
		Person jung = new Person(); //new : 생성자 함수를 호출
		jung.name = "정도준";
		jung.year = 1998;
		jung.gender = "male";
		jung.job = "student";
		
		jung.running();
		
		Person lee = new Person();
		lee.name = "이완석";
		lee.running();
	}
}
