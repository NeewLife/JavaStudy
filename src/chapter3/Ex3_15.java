package chapter3;

import java.util.Scanner;

public class Ex3_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			int dividend;
			int divisor;
			System.out.print("나뉨수를 입력하시오:");
			dividend = scanner.nextInt();
			System.out.println("나눗수를 입력하시오:");
			divisor = scanner.nextInt();
			try {
				System.out.println(dividend + "를 " + divisor + "롤 나누면 몫은 "
						+ dividend/divisor + "입니다.");
				scanner.close();
			} catch (ArithmeticException e) {
				System.out.println("0으로 나눌 수 없습니다! 다시 입력하세요.");
			}
		}
	}

}
