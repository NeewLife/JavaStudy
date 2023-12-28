package chapter2;

import java.util.Scanner;
public class Ex07 {
	
	public void insideSquare(int x, int y) {
		String result = "";
		if(x > 100 && x < 200) {
			if(y > 100 && y < 200) {
				result = String.format("(%d, %d)는 사각형 안에 있습니다.", x, y);
				System.out.println(result);
			}
		}
	}

	public static void main(String[] args) {
		System.out.print("점 (x, y)의 좌표를 입력하시오>>");
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		Ex07 ex07 = new Ex07();
		ex07.insideSquare(x, y);
		
		scanner.close();
		
	}

}
