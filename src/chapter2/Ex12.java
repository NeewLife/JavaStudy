package chapter2;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		System.out.print("연산 >> ");
		Scanner scanner = new Scanner(System.in);
		
		double a = scanner.nextDouble();
		String operator = scanner.next();
		double b = scanner.nextDouble();
		double result;
		String printOut = String.format("a%sb의 계산 결과는 ", operator);
		
//		if(operator.equals("+")) {
//			System.out.println(String.format("a%sb의 계산 결과는 %.1f"
//											, operator, a+b));
//		}else if(operator.equals("-")) {
//			System.out.println(String.format("a%sb의 계산 결과는 %.1f"
//											, operator, a-b));
//		}
//		else if(operator.equals("*")) {
//			System.out.println(String.format("a%sb의 계산 결과는 %.1f"
//											, operator, a*b));
//		}
//		else if(operator.equals("/")) {
//			if(b != 0) {
//				System.out.println(String.format("a%sb의 계산 결과는 %.1f"
//						, operator, a/b));
//			}else {
//				System.out.println("0으로 나눌 수 없습니다.");
//			}
//			
//		}
		
		switch(operator) {
			case "+":
				result = a+b;
				printOut += result;
				break;
			case "-":
				result = a-b;
				printOut += result;
				break;
			case "*":
				result = a*b;
				printOut += result;
				break;
			case "/":
				if(b == 0) {
					printOut = "0으로 나눌 수 없습니다.";
					break;
				}
				result = a/b;
				printOut += result;
				break;
		}
		System.out.println(printOut);
		
		scanner.close();
	}

}
