package org.kh.object1;

public class Compute01 {
	void fnc1(){
		System.out.println("테스트");
	}
	
	void fnc2(String name) {
		System.out.println("Name : "+name);
	}
	
	int fnc3() {
		return 1;
	}
	
	char fnc4(int score) {
		if(score >= 90) {
			return 'A';
		}
		else if(score >= 80) {
			return 'B';
		}
		else if(score >= 70) {
			return 'C';
		}
		else if(score >= 60) {
			return 'D';
		}
		else {
			return 'F';
		}
	}
}
