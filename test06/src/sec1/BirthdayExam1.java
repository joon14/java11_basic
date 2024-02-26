package sec1;

public class BirthdayExam1 {

	public static void main(String[] args) {
		Birthday birth1 = new Birthday();
		birth1.setName("JDJ");
		birth1.setYear(1998);
		birth1.setMonth(1);
		birth1.setDay(4);
		
		birth1.birth();
		birth1.birthAddr();
		
		Birthday birth2 = new Birthday();
		birth2.setName("Kim");
		birth2.setYear(1990);
		birth2.setMonth(12);
		birth2.setDay(25);
		
		birth2.birth();
		birth2.birthAddr();
	}

}
