package exam03;

import java.util.Scanner;

public class Ex04 {

	static void test() {

	}

	static void insert() {

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
