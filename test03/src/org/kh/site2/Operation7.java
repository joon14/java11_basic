package org.kh.site2;
//대입 연산자 : 연산 후에 대입하는 연산자 +=, -=, *=, /=, %=, &=, |=, >>=, <<=, >>>=, ^=
//비트 연산자 : &(AND), |(OR), ~(Complement), ^(XOR), >>, >>>(right shift), <<(left shift)
public class Operation7 {
	public static void main(String[] args) {
		int a = 20;
		int b = 15;
		int tmp;	//임시기억장소
		a += b;	//a = 35, b = 15
		b -= a;	//a = 35, b = -20
		System.out.println("< a와 b의 값을 맞교환 하기 전 >");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		//a와 b의 값을 맞교환
		tmp = a;
		a = b;
		b = tmp;
		System.out.println("< a와 b의 값을 맞교환 >");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		//비트(2진수) 연산
		int x = 0b01101;
		int y = 0b01011;
		System.out.println("\nx = "+Integer.toBinaryString(x));
		System.out.println("y = "+Integer.toBinaryString(y));
		System.out.println("x & y = "+Integer.toBinaryString(x & y));	//and
		System.out.println("x | y = "+Integer.toBinaryString(x | y));	//or
		System.out.println("x ^ y = "+Integer.toBinaryString(x ^ y));	//xor 
		System.out.println("~x = "+Integer.toBinaryString(~x));			//not
		System.out.println("x >> 2 = "+Integer.toBinaryString(x >> 2));	//right shift(= 나누기 2)
		System.out.println("x << 2 = "+Integer.toBinaryString(x << 2));	//left shift(= 곱하기 2)
		
		System.out.println("************** 대입 연산자 **************");
		int i = 25;	//11001
		int j = 30;	//11110
		i &= j;		//11000
		System.out.println("i &= j : "+i);
		
		i = 25;
		i |= j;		//11111
		System.out.println("i |= j : "+i);
		
		i = 25;
		i ^= j;		//00111
		System.out.println("i ^= j : "+i);
		
		j >>= 2;	//00111
		System.out.println("j >>= 2 : "+j);
		j = 30;
		j <<= 2;	//1111000
		System.out.println("j <<= 2 : "+j);
		
		j = 30;
		j >>>= 2;	//00111
		System.out.println("j >>>= 2 : "+j);
	}
}
