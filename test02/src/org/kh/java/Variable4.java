package org.kh.java;

public class Variable4 {
	public static void main(String[] args) {
		String name = "정도준";	//String(reference type) : 문자열("")
		short age = 27;
		float height = 173.5f;
		double weight = 62.3;
		char init = 'j';		//char(primitive) : 문자('')
		
		System.out.printf("%n이름 : \" %s \"", name);
		System.out.printf("%n나이 : %d", age);
		System.out.printf("%n키 : %f", height);
		System.out.printf("%n체중 : %.3f", weight);
		System.out.println("\n이니셜 : "+init);
		
		/* 이스케이프 문자 
		 \n : 줄바꿈
		 \t : 탭
		 \\ : \를 출력
		 (ex. C:\\kim\\news\\temp -> [출력] C:\kim\news\temp)
		 \' : '를 출력
		 \" : "를 출력
		*/
	}
}
