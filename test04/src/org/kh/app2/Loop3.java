package org.kh.app2;

public class Loop3 {
	public static void main(String[] args) {
		int[] scores = {80, 95, 75, 60, 100, 65, 70, 90, 85, 95};
		String pass;
		
		for(int i = 0; i < 10; i++) {
			if(scores[i] >= 80) {
				pass = "합격";
			}
			else {
				pass = "불합격";
			}
			
			System.out.println(scores[i]+"\t"+pass);
		}
		//중요함
		for(int n : scores) {
			if(n >= 80) {
				System.out.println(n+" => pass");
			}
			else {
				System.out.println(n+" => no pass");
			}
		}
		for(int i = 0; i < scores.length; i++) {
			System.out.println(i+" = "+scores[i]);
		}
	}
}
