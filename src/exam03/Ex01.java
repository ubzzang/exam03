package exam03;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> nations = new HashMap<String, Integer>();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("나라이름과 인구를 입력하세요. (예 : Korea 5000)");
			String nation = sc.next();
			
			if(nation.equals("그만"))
				break;
			
			int people = sc.nextInt();
			
			nations.put(nation, people);
		}
		while(true) {
			System.out.println("인구검색 >>");
			String search = sc.next();
			
			if(search.equals("그만")) 
				break;
			
			boolean flag = nations.containsKey(search);
			if(flag)
				System.out.println(nations.get(search));
			else
				System.out.println("찾는 나라가 없습니다.");
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
