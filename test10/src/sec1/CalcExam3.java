package sec1;

public class CalcExam3 {
	public static void main(String[] args) {
		Repeater rep1;
		
		//자식 클래스로 선언된 인스턴스(객체)는 부모 생성자로 생성할 수 없음
		//rep1 = new Calculator();
		
		//Repeater 클래스는 추상 클래스이므로 내부에 추상 메소드가 존재하고 있어
		//구현 내용이 없으므로 생성할 수 없음
		//rep1 = new Repeater();
		
		rep1 = new Arithmetic();
		
		int num1 = 7;
		int num2 = 0;
		
		//rep1은 Repeater로 선언되어 있으므로 Repeater에는 print()에 선언되어 있지 않아 사용불가 
		//rep1.print();
		
		System.out.println("덧셈 : "+rep1.add(num1, num2));
		System.out.println("뺄셈 : "+rep1.substract(num1, num2));
		System.out.println("곱셈 : "+rep1.multifly(num1, num2));
		System.out.println("나눗셈 : "+rep1.divide(num1, num2));
		System.out.println("거듭제곱 : "+rep1.power(num1, num2));
		System.out.println();
		System.out.println("원주율 : "+rep1.PI);
	}
}
