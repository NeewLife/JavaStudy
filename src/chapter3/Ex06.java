package chapter3;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		int[] unit = {50000, 10000, 1000, 500, 100, 50, 10, 1};
		System.out.println("금액을 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		
		for(int i = 0; i < unit.length; i++) {
			int change = money / unit[i];
			if(change == 0) continue;
			System.out.println(unit[i] + "원 짜리 : " + change + "개");
			money %= unit[i];
		}
		scanner.close();
	}

}
