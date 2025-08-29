package exam03;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> st = new ArrayList<>();
		System.out.println("학생이름, 학과, 학번, 학점평균을 입력하세요.");
		
		for (int i = 0; i < 5; i++) {
			String name = sc.next();
			String major = sc.next();
			int sno = sc.nextInt();
			double avg = sc.nextDouble();
			st.add(new Student(name, major, sno, avg));
		}
		
		for (int i = 0; i < 5; i++) {
			st.get(i).display();
		}
		
		while(true) {
			System.out.println("학생 이름 >> ");
			String search = sc.next();
			if(search.equals("그만"))
				break;
			for(int i=0; i<st.size(); i++) {
				if(search.equals(st.get()))
			}
		}
	}

}
