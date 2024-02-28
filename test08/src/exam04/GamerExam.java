package exam04;

public class GamerExam {
	public static void main(String[] args) {
		Gamer gamer;
		System.out.println("********** Amateur **********");
		gamer = new Amateur();
		gamer.run(100);
		gamer.jump(12);
		gamer.turn(60);
		gamer.show("Cho");
		
		System.out.println("\n********** Progamer **********");
		gamer = new Progamer();
		gamer.run(110);
		gamer.jump(15);
		gamer.turn(65);
		gamer.show("Kim");
	}
}
