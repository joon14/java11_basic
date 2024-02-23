package sec1;

public class Book {
	private int bno;
	private String bname;
	private int price;
	private String author;
	private String pub;
	
	public void print() {
		System.out.println("교재정보");
	}
	public void print(int bno) {
		System.out.println("교재코드 : "+bno);
	}
	public void print(int bno, String bname) {
		System.out.println("교재코드 : "+bno+", 교재명 : "+bname);
	}
	public void print(int bno, String bname, int price) {
		System.out.println("교재코드 : "+bno+", 교재명 : "+bname+", 가격 : "+price);
	}
	public void print(int bno, String bname, int price, String author) {
		System.out.println("교재코드 : "+bno+", 교재명 : "+bname+", 가격 : "+price+", 저자 : "+author);
	}
	public void print(int bno, String bname, int price, String author, String pub) {
		System.out.println("교재코드 : "+bno+", 교재명 : "+bname+", 가격 : "+price+", 저자 : "+author+", 출판사 : "+pub);
	}
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPub() {
		return pub;
	}
	public void setPub(String pub) {
		this.pub = pub;
	}
	
	@Override
	public String toString() {
		return "Book [bno=" + bno + ", bname=" + bname + ", price=" + price + ", author=" + author + ", pub=" + pub
				+ "]";
	}
}
