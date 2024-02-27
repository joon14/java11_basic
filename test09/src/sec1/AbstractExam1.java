package sec1;

public class AbstractExam1 {
	public static void main(String[] args) {
		//User user1 = new User();		//User 클래스는 추상 클래스이므로 추상 메소드의 구현 내용이 기술되어 있지 않아 객체를 생성할 수 없음
		User user1;
		user1 = new Member();
		user1.setIp("192.168.1.152");
		user1.setPort(80);
		user1.connect();
		
		user1 = new Staff();
		user1.connect();
		
		Member user2;
		user2 = new Member();
		user2.setIp("192.168.0.121");
		user2.setPort(80);
		user2.setId("jdj14");
		user2.setPw("1234");
		user2.connect();
		
		Staff user3;
		user3 = new Staff();
		user3.setIp("192.168.0.164");
		user3.setPort(80);
		user3.setLevel(2);
		user3.setPart("기술부");
		user3.setName("Kang");
		user3.connect();
	}
}
