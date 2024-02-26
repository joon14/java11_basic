package sec2;

public class StudentExam1 {
	public static void main(String[] args) {
		Student s1 = new Student("Jung", 1, 10000);
		Student s2 = new Student("Kim", 2, 7000);
		Student s3 = new Student("Lee", 3, 12000);
		
		Bus bus1 = new Bus(101);
		s1.takeBus(bus1);
		s1.print();
		bus1.show();
		
		//Kim 학생이 버스(101번 버스)를 두 번 이용하고, 지하철 2호선을 세 번 이용하였을 경우
		//Kim 학생의 정보와 버스 101호 정보와 지하철 2호선의 정보를 출력하여라
		Subway sub2 = new Subway(2);
		for(int i = 0; i < 2; i++) {
			s2.takeBus(bus1);
		}
		for(int i = 0; i < 3; i++) {
			s2.takeSubway(sub2);
		}
		s2.print();
		bus1.show();
		sub2.show();
	}
}
