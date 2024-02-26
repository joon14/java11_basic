package sec2;

public class BookExam {
	public static void main(String[] args) {
		//100개의 Book 배열 선언
		Book book[] = new Book[100];
		/*
		for(int i = 0; i < 10; i++) {
			book[i] = new Book("책 제목"+i,"저자"+i);
		}
		*/
		book[0] = new Book("Java Programming", "Park");
		book[1] = new Book("C Programming I", "Lee");
		book[2] = new Book("C++ Programming", "Kang");
		book[3] = new Book("Python", "Jung");
		book[4] = new Book("C Programming II", "Lim");
		
		for(int i = 0; i < 5; i++) {
			System.out.println(book[i].toString());
		}
	}
}
