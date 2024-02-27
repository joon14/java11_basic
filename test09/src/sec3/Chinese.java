package sec3;

public class Chinese implements Lunch {

	@Override
	public void eating(String menu) {
		System.out.println("중식 메뉴 : "+menu);	
	}
	
	@Override
	public void date(int year, int month, int day, String week) {
		System.out.println("약속 날짜 : "+year+"년 "+ month+"월 " +day+ "일 "+ week);
	}

	@Override
	public void meet(String location, int personNum) {
		System.out.println("약속 장소 : "+location+", 인원 : "+personNum);	
	}
}
