package sec3;

public class PeopleExam {
	public static void main(String[] args) {
		People p1 = new People();
		p1.selNum = 200;		//People.selNum = 200; 와 동일 => 클래스 변수 == 정적 필드
		p1.name = "Jung";		//인스턴스 변수 / 동적 필드
		p1.age = 27;
		p1.addr = "동대문구";
		System.out.println(p1.selNum+", "+p1.name);
		
		People p2 = new People();
		p2.selNum = 300;		//People.selNum = 300; 와 동일
		p2.name = "Kang";
		p2.age = 32;
		p2.addr = "강남구";
		
		System.out.println(p1.selNum+", "+p1.name);
		System.out.println(p2.selNum+", "+p2.name);
		
		System.out.println();
		p1.print1();
		p2.print1();
		
		System.out.println();
		p1.print2();		//People.print2(); 와 동일
		p2.print2();		//People.print2(); 와 동일
		
		//정적(static) 요소 : static으로 선언된 필드 또는 메소드, 객체의 생성없이 활용 가능
		//정적(static) 메소드 : 객체의 생성없이 클래스에서 바로 활용하는 메소드
		System.out.println("\n****** Static Method == Class Method ******");
		People.print2();
	}
}
