package exam03;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Ex04 {
	static HashMap<String, String> word;
	static Scanner sc;
	
	static void insert() {
		while(true) {
			System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
			System.out.print("영어 한글 입력>> ");
			String w1=sc.next();
			if(w1.equals("그만"))
				break;
			String w2=sc.next();
			word.put(w1, w2);
		}
		System.out.println("영어단어 테스트를 종료합니다.");
	}
	
	static void test() {
		int answer[] = {1,2,3,4};
		System.out.println("현재 " + word.size() + "개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");
		while(true) {
			for
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("***** 영어 단어 테스트 프로그램 *****");
			System.out.println("영어단어의 테스트를 시작합니다. -1을 입력하면 종료합니다.");
			System.out.println("단어 테스트 : 1 / 단어 삽입 : 2 / 종료 : 3");

			int select = sc.nextInt();

			boolean flag = false;
			switch (select) {
			case 1:
				test();
			case 2:
				insert();
			case 3:
				flag = true;
				break;
			}

			if (flag) {
				break;

			}
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
