package org.kh.app;

import java.util.Scanner;

//조건문 다단계 if
public class Condition4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력[0~100] : ");
		int point = scan.nextInt();	//문자나 문자열의 경우 => .next()
		String result, award;
		/*
	 		학점(result)은 점수(point)가 
	 		97~100이면	'A+',	93~96이면		'A0',	90~92이면		'A-',
	 		87~89이면		'B+',	83~86이면		'B0',	80~82이면		'B-',
	 		77~79이면		'C+',	73~76이면		'C0',	70~72이면		'C-', 
	 		67~69이면		'D+',	63~66이면		'D0',	60~62이면		'D-',
	 		60미만이면		'F'
	 		=> 다단계 if와 if/elseif/else 문 활용
	 		
	 		시상내용은 학점이 A+이면 '학업우수상',	A0이면 '노력상',	A-이면 '아차상', 나머지는 ''
	 		=> switch~case~문 활용
		*/
		/*
		if(point >= 90) {
			if(point >= 97) {
				result = "A+";
			}
			else if(point >= 93) {
				result = "A0";
			}
			else {
				result = "A-";
			}
		}
		else if(point >= 80) {
			if(point >= 87) {
				result = "B+";
			}
			else if(point >= 83) {
				result = "B0";
			}
			else {
				result = "B-";
			}
		}
		else if(point >= 70) {
			if(point >= 77) {
				result = "C+";
			}
			else if(point >= 73) {
				result = "C0";
			}
			else {
				result = "C-";
			}
		}
		else if(point >= 60) {
			if(point >= 67) {
				result = "D+";
			}
			else if(point >= 63) {
				result = "D0";
			}
			else {
				result = "D-";
			}
		}
		else {
			result = "F";
		}
		*/
		if(point >= 90) {
			result = "A";
		}
		else if(point >= 80) {
			result = "B";
		}
		else if(point >= 70) {
			result = "C";
		}
		else if(point >= 60) {
			result = "D";
		}
		else {
			result = "F";
		}
		
		if(result != "F") {
			if((point%10 >= 7) || (point == 100)) {
				result += "+";
			}
			else if(point%10 >= 3) {
				result += "0";
			}
			else {
				result += "-";
			}
		}
		System.out.printf("\n당신의 점수는 %d점, 학점은 %s입니다.", point, result);
		
		switch(result) {
			case "A+": 
				award = "학업우수상"; 
				break;
			case "A0": 
				award = "노력상"; 
				break;
			case "A-": 
				award = "아차상"; 
				break;
			default: 
				award = "";
		}
		
		if(point >= 90) {
			System.out.printf("\n시상내역은 %s입니다.", award);
		}
		else {
			System.out.print("\n시상내역이 없습니다.");
		}
	}
}
