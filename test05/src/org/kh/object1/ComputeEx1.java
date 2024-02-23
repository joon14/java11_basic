package org.kh.object1;
//메서드(method) : 정의 -> 호출
//특정 클래스(객체)에 속하므로 호출 시 "객체.메소드명()"으로 호출
public class ComputeEx1 {
	public static void main(String[] args) {
		Compute01 c1 = new Compute01();
		//메서드 호출
		c1.fnc1();
		c1.fnc2("jdj");
		int num = c1.fnc3();
		System.out.println("Number : "+num);
		char grade = c1.fnc4(91);
		System.out.println("Grade : "+grade);
		
		System.out.println("******************************************");
		fnc1();
		fnc2("kim");
		System.out.println("Number : "+fnc3());
		System.out.println("원의 넓이 : "+fnc4(5));
	}
	
	//함수(Function) : 정의 호출
	public static void fnc1() {
		System.out.println("반환(x), 매개 변수(x)");
	}
	public static void fnc2(String name) {
		System.out.println("Name : "+name);
	}
	public static int fnc3() {
		return 2;
	}
	public static double fnc4(int r) {
		return (r*r*3.14f);
	}
}
