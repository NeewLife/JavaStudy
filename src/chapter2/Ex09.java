package chapter2;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		System.out.println("원의 중심과 반지름 입력>>");
		Scanner scanner = new Scanner(System.in);
		
		double circleX = scanner.nextDouble();
		double circleY = scanner.nextDouble();
		double radius = scanner.nextDouble();
		
		System.out.println("점 입력>>");
		
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		double a1 = circleX - x;
		double a2 = circleY - y;
		
		if(a1*a1 + a2*a2 < radius*radius) {
			System.out.println(String.format("점 (%.1f, %.1f)는 원 안에 있다.", x, y));
		}
		scanner.close();
	}

}
