package sec3;

public class LunchExam {
	public static void main(String[] args) {
		Lunch lunch;
		
		System.out.println("오늘의 점심은?");
		
		System.out.println("\nKorean");
		lunch = new Korean();
		lunch.eating("비빔밥");
		lunch.date(2024, 2, 27, "화요일");
		lunch.meet("광화문", 4);
		
		System.out.println("\nChinese");
		lunch = new Chinese();
		lunch.eating("마라탕");
		lunch.date(2024, 3, 9, "토요일");
		lunch.meet("인천", 10);
		
		System.out.println("\nJapanese");
		lunch = new Japanese();
		lunch.eating("초밥");
		lunch.date(2024, 4, 10, "수요일");
		lunch.meet("강남", 6);
	}
}
