package chapter3;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex3_17 {

	public static void main(String[] args) {
		System.out.println("정수 3개를 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		int a = 0;
		
		for(int i = 0; i < 3; i++) {
			try {
				a = scanner.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("정수만 입력해주세요");
				scanner.nextLine();
				i--;
				continue;
			}
			sum += a;
		}
		System.out.println("합은 " + sum);
		scanner.close();
		
	}

}
