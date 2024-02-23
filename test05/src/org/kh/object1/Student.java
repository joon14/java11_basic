package org.kh.object1;

public class Student {
	String name = "kh 정보교육원";
	int kor = 100;
	int eng = 100;
	int mat = 100;
	public int tot() {
		return kor+eng+mat;
	}
	public float avg() {
		return tot()/3.0f;
	}
	/*
	 	int tot(){
	 		return this.kor+this.eng+this.mat;
	 	}
	 	double avg(){
	 		return (this.kor+this.eng+this.mat)/3.0f;
	 	}
	*/
	
	void resulting() {
		System.out.println("name : "+this.name+", total : "+this.tot()+", average : "+this.avg());
	}
}
