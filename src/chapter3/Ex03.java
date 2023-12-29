package chapter3;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		System.out.print("정수를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for(int i = n; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}System.out.println();
		}
		scanner.close();
	}

}
