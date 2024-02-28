package sec1;

public class Arithmetic extends Repeater {

	@Override
	public int multifly(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2 != 0) {
			return num1 / num2;
		}
		else {
			return 0;
		}
	}

	@Override
	int power(int num1, int num2) {
		int tmp = num1;
		if(num2 == 0) {
			return 1;
		}
		else {
			for(int i = 1; i < num2; i++) {
				num1 = num1 * tmp;
			}
			return num1;
		}
	}	
	
	public void print() {
		System.out.println("계산기, 중계기, 연산기를 구현합니다.");
	}
}


