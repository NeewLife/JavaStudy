package chapter2;


import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		System.out.println("달을 입력하세요(1~12) >> ");
		Scanner scanner = new Scanner(System.in);
		
		int month = scanner.nextInt();
		
//		if(month >= 3 && month <= 5) {
//			System.out.println("봄");
//		}else if(month >= 6 && month <= 8) {
//			System.out.println("여름");
//		}else if(month >= 9 && month <= 11) {
//			System.out.println("가을");
//		}else if(month >= 1 && month <= 2 || month == 12) {
//			System.out.println("겨울");
//		}else System.out.println("잘못입력");
		
		switch (month) {
			case 12:
			case 1:
			case 2:
				System.out.println("겨울");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println("봄");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("여름");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("가을");
				break;
			default:
				System.out.println("잘못입력");
		}
		scanner.close();
	}

}
