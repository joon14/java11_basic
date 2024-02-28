package exam03;

import java.util.ArrayList;
import java.util.List;

public class BoardExam {
	public static void main(String[] args) {
		List<Board> boardList = new ArrayList<Board>();
		
		for(int i = 0; i < 6; i++) {
			Board board = new Board(i, "title"+i, "username"+i, "content"+i, "2024. 02. 28", 0);
			boardList.add(board);
		}
		
		System.out.println("Number\tTitle\tUsername\tContent");
		
		for(Board board : boardList) {
			System.out.println(board.getBno()+"\t"+board.getTitle()+"\t"+board.getUname()+"\t"+board.getContent());
		}

	}
}
