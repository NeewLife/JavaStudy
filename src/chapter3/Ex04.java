package chapter3;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		System.out.println("소문자 알파벳 하나를 입력하시오 >> ");
		Scanner scanner = new Scanner(System.in);
		String s = scanner.next();
		char c = s.charAt(0);
		for(int i = c; i > 96; i--) {
			int count = 0;
			for (int j = 97; j <= i - count; j++) {
				System.out.print((char)j);
			}
			System.out.println();
			count++;
		}
		scanner.close();
	}

}
