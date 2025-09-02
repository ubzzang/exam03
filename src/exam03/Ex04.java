package exam03;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Vector;

public class Ex04 {
	static Vector<Word> v = new Vector<Word>();
	static Scanner sc;

	static void insert() {
		System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
		while (true) {
			System.out.print("영어 한글 입력>> ");
			String w1 = sc.next();
			if (w1.equals("그만"))
				break;
			String w2 = sc.next();
			v.add(new Word(w1, w2));
		}
		System.out.println("영어단어 테스트를 종료합니다.");
	}

	static void test() {
		Random rand = new Random();
		sc = new Scanner(System.in);

		System.out.println("현재 " + v.size() + "개의 단어가 들어있습니다. -1을 입력하면 테스트가 종료됩니다.");
		while (true) {
			int ex[] = { -1, -1, -1, -1 };
			int answerPos = rand.nextInt(4);
			int correctIndex = rand.nextInt(v.size());
			ex[answerPos] = correctIndex;
			
			for (int i = 0; i < 4; i++) {
				if (i == answerPos)
					continue;
				int n;
				do {
					n = rand.nextInt(v.size());
				} while (n == correctIndex || contains(ex, n));
				ex[i] = n;
			}

			System.out.println(v.get(correctIndex).getEng() + " ?");
			for (int i = 0; i < 4; i++) {
				System.out.print((i + 1) + ". " + v.get(ex[i]).getKor() + "\t");
			}

			int answer = sc.nextInt();

			if (answer == -1) {
				System.out.println("단어 테스트를 종료합니다.");
				break;
			}
			if (answer - 1 == answerPos) {
				System.out.println("정답입니다!\n");
			} else {
				System.out.println("틀렸습니다. 정답은 " + (answerPos + 1) + "번입니다.\n");
			}
		}

	}

	static boolean contains(int[] arr, int val) {
		for (int n : arr) {
			if (n == val)
				return true;
		}
		return false;
	}

	static void setWord() {
		v.add(new Word("love", "사랑"));
		v.add(new Word("animal", "동물"));
		v.add(new Word("picture", "그림"));
		v.add(new Word("emotion", "감정"));
		v.add(new Word("baby", "아기"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sc = new Scanner(System.in);
		setWord();

		while (true) {
			System.out.println("***** 영어 단어 테스트 프로그램 *****");
			System.out.println("단어 테스트 : 1 / 단어 삽입 : 2 / 종료 : 3");

			int select = sc.nextInt();
			sc.nextLine();

			boolean flag = false;
			switch (select) {
			case 1:
				test(); break;
			case 2:
				insert(); break;
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
