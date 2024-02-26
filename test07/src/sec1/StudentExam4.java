package sec1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentExam4 {
	public static void main(String[] args) {
		List<Student> s = new ArrayList<Student>();
		
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 5 ; i++) {
			Student st = new Student();
			st.setNum(i+1);
			System.out.printf("%d번째 국어 : ",(i+1));
			st.setKor(scan.nextInt());
			System.out.printf("%d번째 영어 : ",(i+1));
			st.setEng(scan.nextInt());
			System.out.printf("%d번째 수학 : ",(i+1));
			st.setMat(scan.nextInt());
			
			s.add(st);
		}
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점");
		for(Student st : s) {
			st.show();
		}
	}
}
