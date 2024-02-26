package sec1;
//필드 : 번호, 국어, 영어, 수학
//메소드 : getter/setter 및 총점, 평균, 학점, 모든 학생 정보 출력
public class Student {
	private int num;
	private int kor;
	private int eng;
	private int mat;
	
	public Student() {
		this(0);
	}
	public Student(int num) {
		this(num, 0);
	}
	public Student(int num, int kor) {
		this(num, kor, 0);
	}
	public Student(int num, int kor, int eng) {
		this(num, kor, eng, 0);
	}
	public Student(int num, int kor, int eng, int mat) {
		this.num = num;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	
	public int tot() {
		return (this.kor + this.eng + this.mat);
	}
	public float avg() {
		return (this.tot()/3.0f);
	}
	public String grade() {
		if(avg() >= 90) {
			return "A";
		}
		else if(avg() >= 80) {
			return "B";
		}
		else if(avg() >= 70) {
			return "C";
		}
		else if(avg() >= 60) {
			return "D";
		}
		else {
			return "F";
		}
	}
	
	@Override
	public String toString() {
		return "Student [num=" + num + ", kor=" + kor + ", eng=" + eng + ", mat=" + mat + "]";
	}
	
	public void print() {
		System.out.println(toString());
		System.out.printf("total : %d, average : %.1f, grade : %s\n\n", this.tot(), this.avg(), this.grade());
	}
	
	public void show() {
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%.1f\t%s\n", 
				this.num, this.kor, this.eng, this.mat, this.tot(), this.avg(), this.grade());
	}
}
