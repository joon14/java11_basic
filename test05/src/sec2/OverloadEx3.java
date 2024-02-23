package sec2;

public class OverloadEx3 {
	public static void main(String[] args) {
		Board b0 = new Board();
		b0.setBno(100);
		b0.setTitle("Title 0");
		b0.setUname("Lim");
		b0.setContent("Sleep");
		b0.setResdate("2024.02");
		b0.setVisited(77);
		
		Board b1 = new Board(101);
		b1.setTitle("Title 1");
		b1.setUname("Cho");
		b1.setContent("Game");
		b1.setResdate("2024.02.20");
		b1.setVisited(61);
		
		Board b2 = new Board(102, "Title 2");
		b2.setUname("Jin");
		b2.setContent("TV");
		b2.setResdate("2024.02.22");
		b2.setVisited(9);
		
		Board b3 = new Board(103, "Title 3", "Jung");
		b3.setContent("Movie");
		b3.setResdate("2024.02.24");
		b3.setVisited(11);
		
		Board b4 = new Board(104, "Title 4", "Kang", "Play");
		b4.setResdate("2024.02.25");
		b4.setVisited(101);
		
		Board b5 = new Board(105, "Title 5", "Kim", "Study", "2024.02.26");
		b5.setVisited(91);
		
		Board b6 = new Board(106, "Title 6", "Lee", "Java Programming", "2024.02.27", 33);
		
		Notice n1 = new Notice(200, "Java Program", "Bae", "Practice", "2024.02", 0);
		System.out.println(n1.toString());
	}
}
