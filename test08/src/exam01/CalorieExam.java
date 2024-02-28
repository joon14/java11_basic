package exam01;

import java.util.Scanner;

public class CalorieExam {
	public static void main(String[] args) {
		int cal, pro, carbo, fat;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단백질 : ");
		pro = scan.nextInt();
		
		System.out.print("탄수화물 : ");
		carbo = scan.nextInt();
		
		System.out.print("지방 : ");
		fat = scan.nextInt();
		
		cal = 4*pro + 4*carbo + 9*fat;
		System.out.println("칼로리 : "+cal);
	}
}
