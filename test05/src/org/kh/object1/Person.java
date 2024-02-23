package org.kh.object1;

public class Person {
	String name;
	int year;
	String gender;
	String job;
	
	void running() {	//void : return할 필요가 없는경우
		System.out.println(this.name+"이(가) 달립니다.");
	}
}
