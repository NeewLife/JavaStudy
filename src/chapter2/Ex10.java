package chapter2;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		System.out.println("첫번째 원의 중심과 반지름 입력 >> ");
		Scanner scanner = new Scanner(System.in);
		
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int rad1 = scanner.nextInt();
		
		System.out.println("두번째 원의 중심과 반지름 입력 >> ");
		
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		int rad2 = scanner.nextInt();
		
		int subX = x2 - x1;
		int subY = y2 - y1;
		
		double distance = Math.sqrt(subX * subX + subY * subY);
		
		if(distance < rad1 + rad2 ) {
			System.out.println("두 원은 서로 겹친다.");
		}
		scanner.close();
	}

}
