package org.kh.app2;
//반복문 : for, while, do~while~
public class Loop1 {
	public static void main(String[] args) {
		int n = 0;	//전역변수 : 한 번만 선언할 수 있다.
		/*
			n = n + 1;
			n = n + 1;
			n = n + 1;
			n = n + 1;
			n = n + 1;
			n = n + 1;
			n = n + 1;
			n = n + 1;
			n = n + 1;
			n = n + 1;
		*/
		/*
			조건식이 참 일때 동안만 반복수행한다.
			for(ⓐ초기식;ⓑ조건식;ⓒ증감식){
				ⓓ반복해야할문장;
			} 
			ⓐ -> ⓑ -> ⓓ -> | ⓒ -> ⓑ -> ⓓ 반복하다가 조건이 만족되지 않으면 종료
		*/
		for(int i = 0; i < 10; i++) {	// i = 0 1 2 3 4 5 6 7 8 9 	10	//지역변수 : 다시 선언 할 수 있다.
			n += 1;						// n = 1 2 3 4 5 6 7 8 9 10
		}
		System.out.println("n = "+n);
		System.out.println("**********************************************************");
		
		int total = 0;
		float avg = 0;
		String grade, pass;
		
		int[] scores = {80, 95, 75, 60, 100, 65, 70, 90, 85}; //배열 : reference
		String names[] = {"김", "이", "박", "최", "정", "오", "배", "강", "장"};
		
		int MaxScore = 0, MinScore = scores[0];
		
		System.out.println("이름\t점수\t학점\t판정");
		
		for(int i = 0; i < 9; i++) {
			total += scores[i];
			if(scores[i] >= 90) {
				grade = "A";
			}
			else if(scores[i] >= 80) {
				grade = "B";
			}
			else if(scores[i] >= 70) {
				grade = "C";
			}
			else if(scores[i] >= 60) {
				grade = "D";
			}
			else {
				grade = "F";
			}
			if(scores[i] >= 70) {
				pass = "합격";
			}
			else {
				pass = "불합격";
			}
			
			if(MaxScore < scores[i]) {
				MaxScore = scores[i];
			}
			
			if(MinScore > scores[i]) {
				MinScore = scores[i];
			}
			System.out.println(names[i]+"\t"+scores[i]+"\t"+grade+"\t"+pass);
		}
		
		avg = total / 9.0f;
		System.out.println("총점 : "+total+"\t평균 : "+avg);
		System.out.println("최대 점수 : "+MaxScore+"\t최소 점수 : "+MinScore);
			
		//*************************************************************************************************
		System.out.printf("\n************************ Practice ************************\n");
		int total2 = 0;
		float avg2 = 0;
		String grade2, pass2;
		
		int scores2[] = {97, 55, 63, 72, 88};
		String names2[] = {"Kim", "Kang", "Lee", "Cho", "Jung"};
		
		int MaxScore2 = 0, MinScore2 = scores2[0];
		
		System.out.println("\tName\tScore\tGrade\tPass(Y/N)");
		
		for(int i = 0; i < 5; i++) {
			total2 += scores2[i];
			
			if(scores2[i] >= 90) {
				grade2 = "A";
			}
			else if(scores2[i] >= 80) {
				grade2 = "B";
			}
			else if(scores2[i] >= 70) {
				grade2 = "C";
			}
			else if(scores2[i] >= 60) {
				grade2 = "D";
			}
			else {
				grade2 = "F";
			}
			
			if(grade2 != "F") {
				if(scores2[i]%10 >= 7) {
					grade2 += "+";
				}
				else if(scores2[i]%10 >= 3) {
					grade2 += "0";
				}
				else {
					grade2 += "-";
				}
			}
			
			if(scores2[i] >= 70) {
				pass2 = "Y";
			}
			else {
				pass2 = "N";
			}
			
			if(MaxScore2 < scores2[i]) {
				MaxScore2 = scores2[i];
			}
			
			if(MinScore2 > scores2[i]) {
				MinScore2 = scores2[i];
			}
			
			System.out.println((i+1)+"\t"+names2[i]+"\t"+scores2[i]+"\t"+grade2+"\t"+pass2);
		}
		avg2 = total2 / 5.0f;
		System.out.println("total : "+total2+"\taverage : "+avg2);
		System.out.println("Max Score : "+MaxScore2+"\tMin Score : "+MinScore2);
	}
}