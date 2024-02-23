package sec1;

public class OverloadEx2 {
	public static void main(String[] args) {
		Book b0 = new Book();
		
		Book b1 = new Book();
		b1.setBno(101);
		b1.setBname("C Programming");
		b1.setPrice(15000);
		b1.setAuthor("Kang");
		b1.setPub("Sky media");
		
		Book b2 = new Book();
		b2.setBno(102);
		b2.setBname("C++ Programming");
		b2.setPrice(13000);
		b2.setAuthor("Cho");
		b2.setPub("Ocean media");
		
		Book b3 = new Book();
		b3.setBno(103);
		b3.setBname("Python Programming");
		b3.setPrice(17000);
		b3.setAuthor("Lee");
		b3.setPub("MT media");
		
		b0.print();
		b0.print(b1.getBno());
		b0.print(b1.getBno(), b1.getBname());
		b0.print(b2.getBno(), b2.getBname(), b2.getPrice());
		b0.print(b3.getBno(), b3.getBname(), b3.getPrice(), b3.getAuthor());
		b0.print(b3.getBno(), b3.getBname(), b3.getPrice(), b3.getAuthor(), b3.getPub());
	}
}
