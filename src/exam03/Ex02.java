package exam03;

import java.util.Scanner;
import java.util.Vector;

class rainAmount {
    int x;

    public rainAmount() {}
    public rainAmount(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "강수량: " + x;
    }
}

public class Ex02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<rainAmount> rain = new Vector<>();

        while (true) {
            System.out.print("강수량 입력(0 입력시 종료) >> ");
            int amount = sc.nextInt();
            if (amount == 0)
                break;

            rain.add(new rainAmount(amount));

            int sum = 0;
            for (int i = 0; i < rain.size(); i++) {
                rainAmount r = rain.get(i);
                System.out.print(r.x + " ");
                sum += r.x;
            }
            System.out.println("\n현재 평균 : " + (sum / rain.size()));
        }
        System.out.println("프로그램이 종료되었습니다.");
    }
}
