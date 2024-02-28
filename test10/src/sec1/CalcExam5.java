package sec1;

public class CalcExam5 {
	public static void main(String[] args) {
		Repeater rep1;
		
		int num1 = 7;
		int num2 = 0;
		
		rep1 = new Repeater() {
			public int multifly(int num1, int num2) {
				return num1 * num2;
			}

			public int divide(int num1, int num2) {
				if(num2 != 0) {
					return num1 / num2;
				}
				else {
					return 0;
				}
			}

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
		};
		
		System.out.println("덧셈 : "+rep1.add(num1, num2));
		System.out.println("뺄셈 : "+rep1.substract(num1, num2));
		System.out.println("곱셈 : "+rep1.multifly(num1, num2));
		System.out.println("나눗셈 : "+rep1.divide(num1, num2));
		System.out.println("거듭제곱 : "+rep1.power(num1, num2));
		System.out.println();
		System.out.println("원주율 : "+rep1.PI);
	}
}
