package org.kh.object1;

public class StudentEx1 {
	public static void main(String[] args) {
		Student jung = new Student();
		jung.name = "정도준";
		jung.kor = 77;
		jung.eng = 50;
		jung.mat = 65;	
		jung.resulting();
		
		
		Student kim = new Student();
		kim.name = "김기태";
		kim.kor = 100;
		kim.eng = 99;
		kim.mat = 88;
		kim.resulting();
		
		Student lee = new Student();
		lee.resulting();
		
		Student cho = new Student();
		cho.kor = 71;
		cho.eng = 86;
		cho.resulting();
	}
}
