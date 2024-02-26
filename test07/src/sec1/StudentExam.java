package sec1;

public class StudentExam {
	public static void main(String[] args) {
		Student s1 = new Student(1, 95, 90, 100);
		Student s2 = new Student(2);
		s2.setKor(55);
		s2.setEng(65);
		s2.setMat(60);
		Student s3 = new Student(3, 80);
		s3.setEng(75);
		s3.setMat(90);
		Student s4 = new Student(4, 50, 40);
		s4.setMat(70);
		
		s1.print();
		s2.print();
		s3.print();
		s4.print();
	}
}
