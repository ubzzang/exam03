package exam03;

import java.util.Scanner;
import java.util.Vector;

class rainAmount{
	int x;
	
	public rainAmount(){}
	public rainAmount(int x) {
		this.x = x;
	}
	
}

public class Ex02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Vector<rainAmount> rain = new Vector<>(); 
		
		while(true) {
			System.out.print("강수량 입력(0 입력시 종료)");
			int amount = sc.nextInt();
			if(amount==0)
				break;
				
			rain.add(new rainAmount(amount));
			
			int sum = 0;
			for(int i=0; i<rain.size(); i++) {
				rainAmount r= rain.get(i);
				System.out.println(r);
				System.out.println("현재 평균 : " + Math.round(sum/rain.size()));
			}
			
		}
		System.out.println("프로그램이 종료되었습니다.");
	}

}
