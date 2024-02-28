package sec1;

public class CalcExam1 {
	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 0;
		
		Arithmetic a1 = new Arithmetic();
		
		System.out.println("덧셈 : "+a1.add(num1, num2));
		System.out.println("뺄셈 : "+a1.substract(num1, num2));
		System.out.println("곱셈 : "+a1.multifly(num1, num2));
		System.out.println("나눗셈 : "+a1.divide(num1, num2));
		System.out.println("거듭제곱 : "+a1.power(num1, num2));
		System.out.println();
		System.out.println("원주율 : "+a1.PI);
	}
}
