package sec1;

public class StudentExam3 {

	public static void main(String[] args) {
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균\t학점");
		//2차원 배열(5x4)
		int s[][] = {{1,90,95,100},{2,80,85,88},{3,70,80,88},{4,88,70,60},{5,60,65,71}};
		
		for(int i = 0; i < s.length; i++) {
			int tot = 0;
			double avg = 0.0f;
			
			System.out.print((i+1)+"\t");
			String grade;
			
			for(int j = 1; j <s[i].length; j++) {	
				tot += s[i][j];
				avg = tot/3.0f;
				
				System.out.print(s[i][j]+"\t");
			}
			if(avg >= 90) {
				grade = "A";
			}
			else if(avg >= 80) {
				grade = "B";
			}
			else if(avg >= 70) {
				grade = "C";
			}
			else if(avg >= 60) {
				grade = "D";
			}
			else {
				grade = "F";
			}
			System.out.printf("%d\t%.1f\t%s", tot, avg, grade);
			System.out.println();
		}

	}

}
