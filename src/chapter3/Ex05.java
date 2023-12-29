package chapter3;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		System.out.println("양의 정수 10개를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.print("3의 배수는 ");
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] % 3 == 0) {
				System.out.print(arr[j] + " ");
			}
		}
		scanner.close();
	}

}
