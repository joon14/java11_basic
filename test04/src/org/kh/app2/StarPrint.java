package org.kh.app2;
//중첩 for문을 활용한 별 찍기
public class StarPrint {
	public static void main(String[] args) {
		System.out.println("--------------Practice(1)--------------");
		/*
		  	******
		  	******
		  	******
		  	******
		*/
		for(int i = 1; i <= 4; i++) {		//i =	0	1	2	3	=> 4
			for(int j = 1; j <= 6; j++) {	//j =	0~5	0~5	0~5	0~5	=> 6
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------Practice(2)--------------");
		/*
	  		*
	  		**
	  		***
	  		****
	  		*****
	  		******
	  	*/
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------Practice(3)--------------");
		/*
	  		******
	  		*****
	  		****
	  		***
	  		**
	  		*
	  	*/
		for(int i = 1; i <= 6; i++) {
			for(int j = 6; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------Practice(4)--------------");
		/*
	  		******
	  		 *****
	  		  ****
	  		   ***
	  		    **
	  		     *
	  	*/
		for(int i = 1; i <= 6; i++) {
			for(int j = 6; j > 7-i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 7-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------Practice(5)--------------");
		/*
	  		     *
	  		    **
	  		   ***
	  		  ****
	  		 *****
	  		******
	  	*/
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j < 7-i; j++) {
				System.out.print(" ");
			}
			for(int j = 6; j >= 7-i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------Practice(6)--------------");
		/*
	  		*
	  		**
	  		***
	  		****
	  		*****
	  		******
	  		*****
	  		****
	  		***
	  		**
	  		*
	  	*/
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i <= 6; i++) {
			for(int j = 5; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------Practice(7)--------------");
		/*
	  		******
	  		*****
	  		****
	  		***
	  		**
	  		*
	  		**
	  		***
	  		****
	  		*****
	  		******
	  	*/
		for(int i = 0; i < 6; i++) {
			for(int j = 6; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i < 6; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------Practice(8)--------------");
		/*
	  		     *
	  		    **
	  		   ***
	  		  ****
	  		 *****
	  		******
	  		 *****
	  		  ****
	  		   ***
	  		    **
	  		     *
	  	*/
		for(int i = 1; i <= 6; i++) {
			for(int j = 1; j < 7-i; j++) {
				System.out.print(" ");
			}
			for(int j = 5; j >= 6-i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i = 1; i <= 6; i++) {
			for(int j = 6; j >= 7-i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 6-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("--------------Practice(9)--------------");
		/*
		     *
		    ***
		   *****
		  *******
		 *********
		*/
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; i+j <= 5; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 9; j++) {
				if(j/i <= 1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------Practice(10)--------------");
		/*
		 *********
		  *******
		   *****
		    ***
		     *
		*/
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 9; j >= 1; j--) {
				if(j <= (2*(5-i)+1)) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------Practice(11)--------------");
		/*
		     *
		    ***
		   *****
		  *******
		 *********
		  *******
		   *****
		    ***
		     *
		*/
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; i+j <= 5; j++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= 9; j++) {
				if(j/i <= 1) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i-1; j++) {
				System.out.print(" ");
			}
			for(int j = 9; j >= 1; j--) {
				if(j <= (2*(5-i)+1)) {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("--------------Practice(12)--------------");
		/*
		 ***** *****
		 ****   ****
		 ***     ***
		 **       **
		 *         *
		 **       **
		 ***     ***
		 ****   ****
		 ***** *****
		*/
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 11; j++) {
				if((6-(i-1) <= j) && (6+(i-1) >= j)) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		for(int i = 6; i <= 9; i++) {
			for(int j = 1; j <= 11; j++) {
				if((i-3 <= j) && (15-i >= j)) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
