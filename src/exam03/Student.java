package exam03;

public class Student {
	String name;
	String major;
	int sno;
	double avg;
	
	public Student() {}

	public Student(String name, String major, int sno, double avg) {
		super();
		this.name = name;
		this.major = major;
		this.sno = sno;
		this.avg = avg;
	}

	public void display() {
		System.out.println("이름 : "+name+"\n"+"학과 : "+major+"\n"+"학번 : "+sno+"\n"+"학점 평균"+avg);
	}
}
