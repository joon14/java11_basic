package sec4;

public class ShopExam {
	public static void main(String[] args) {
		Shop shop1;
		shop1 = new Shop();
		
		shop1.buy();
		shop1.sell();
		shop1.delivery();
		
		Delivery shop2;
		shop2 = new Shop();
		
		shop2.buy();
		shop2.sell();
		shop2.delivery();
	}
}
