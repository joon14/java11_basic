package sec1;

public abstract class Repeater implements Calculator {
	//인터페이스로부터 상속받은 추상 클래스는 전부 또는 일부만 추상화 할 수 있으며,
	//물려받은 메소드에 대하여 구현이 가능하다.
	//별도의 추상 메소드를 정의할 수 없음

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1 - num2;
	}
	
	abstract int power(int num1, int num2);	
}
