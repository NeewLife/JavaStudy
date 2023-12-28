package chapter2;


import java.util.Scanner;
public class Ex08 {
	
	public static boolean inRect(int x, int y, 
								 int rectx1, int recty1,
								 int rectx2, int recty2) {
		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else return false;
	}


	public static void main(String[] args) {
		System.out.println("(x1, y1) , (x2, y2) 를 차례대로 입력하시오");
		Scanner scanner = new Scanner(System.in);
		
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();
		
		if(x1 < x2) {
			x1 = x2;
		}
		if(y1 < y2) {
			y1 = y2;
		}
		
		if(inRect(x1, y1, 100, 100, 200, 200)) {
			System.out.println("사각형이랑 충돌합니다.");
		};
		scanner.close();
	}

}
