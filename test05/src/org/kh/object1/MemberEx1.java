package org.kh.object1;

public class MemberEx1 {
	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setName("Jung");			//mem1.name = "Jung";
		mem1.setId("jdj");				//mem1.id = "jung";
		mem1.setPw("1234");				//mem1.pw = "1234";
		mem1.setEmail("jdj98@kh.com");	//mem1.email = "jdj98@kh.com";
		mem1.setBirth(1998);			//mem1.birth = 1998
		mem1.setTel("010-1234-5678");	//mem1.tel = "010-1234-5678";
		
		System.out.println("Name : "+mem1.getName());
		System.out.println("ID : "+mem1.getId());
		System.out.println("E-mail : "+mem1.getEmail());
		System.out.println(mem1.toString());
	}
}
