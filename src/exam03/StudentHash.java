package exam03;

import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;
import java.util.Scanner;

public class StudentHash {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Student> st = new HashMap<>();
		System.out.println("학생이름, 학과, 학번, 학점평균을 입력하세요.");
		
		for (int i = 0; i < 5; i++) {
			String name = sc.next();
			String major = sc.next();
			int sno = sc.nextInt();
			double avg = sc.nextDouble();
			st.put(name, new Student(name, major, sno, avg));
		}
		
		for (int i = 0; i < 5; i++) {
			Set<String> keys = st.keySet();
			Iterator<String> it = keys.iterator();
			
			while(it.hasNext()) {
				String key = it.next();
				st.get(key).display();
			}
			System.out.println("========================");
		}
		
		while(true) {
			System.out.println("학생 이름 >> ");
			String search = sc.next();
			if(search.equals("그만"))
				break;
			
			boolean flag=st.containsKey(search);
			if(flag)
				System.out.println(st.get(search).toString());
			else
				System.out.print("찾는 이름이 없습니다.");
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
