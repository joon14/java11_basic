package sec1;

public class OverloadEx1 {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.print();
		p1.print("robot");
		p1.print(100);
		p1.print("pen", 30);
		p1.print(55, "book");
	}
}
