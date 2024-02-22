package org.kh.app2;

import java.util.Scanner;

public class Loop4 {
	public static void main(String[] args) {
		/*
		 	for와 마찬가지로 조건이 만족하는 동안만 반복수행
		 	for(초기식;조건식;증감식){
		 		반복할문장
		 	}
		 	그러나, while은 괄호에 조건만 기입하고 해당 블록 안에 증감식이 기재되며,
		 	초기식을 while문 시작 전에 해야함
		 	초기식;
		 	while(조건식){
		 		증감식;
		 		반복할문장;
		 	}
		*/
		int i = 0, tot = 0;
		while(i < 5) {					//i = 	0	1	2	3	4	5
			i++;		//i = i + 1		//i = 	1	2	3	4	5	
			tot += i;	//tot = tot + i //tot =	1 	3	6	10	15	
		}
		System.out.println("result : "+tot);
		
		System.out.println("**************************Practice**************************");
		//해당 숫자를 입력하면, 구구단 중 해당 숫자의 단을 출력하시오.
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 입력하세요(2~9) : ");
		int num = scan.nextInt();
		/*
		while(num < 2 || num > 9) {
			System.out.println("숫자를 잘못입력하셨습니다.");
			System.out.println("숫자를 다시 입력하세요(2~9) : ");
			num = scan.nextInt();
		}
		*/
		System.out.println("< while문 : "+num+"단 >");
		int j = 0;
		while(j < 9) {
			j++;
			System.out.println(num+" x "+j+" = "+(num*j));
		}
		
		System.out.println("\n< for문 : "+num+"단 >");
		for(int k = 1; k < 10; k++) {
			System.out.println(num+" x "+k+" = "+(num*k));
		}
	}
}
