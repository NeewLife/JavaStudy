package chapter3;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		System.out.println("컴퓨터와 가위 바위 보 게임을 합니다.");
		
		String[] str = {"가위", "바위", "보"}; 
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.print("가위 바위 보!>>");
			
			String me = scanner.next();
			String com = str[(int)(Math.random()*3)];
			String result = "";
			if(me.equals("그만")) {
				System.out.println("게임을 종료합니다..");
				scanner.close();
				break;
			}
			switch(me) {
			case "가위":
				if(com.equals("가위")) {
					result = "비겼습니다.";
					break;
				}else if(com.equals("바위")) {
					result = "컴퓨터가 이겼습니다.";
					break;
				}else {
					result = "사용자가 이겼습니다.";
					break;
				}
			case "바위":
				if(com.equals("가위")) {
					result = "사용자가 이겼습니다.";
					break;
				}else if(com.equals("바위")) {
					result = "비겼습니다.";
					break;
				}else {
					result = "컴퓨터가 이겼습니다.";
					break;
				}
			case "보":
				if(com.equals("가위")) {
					result = "컴퓨터가 이겼습니다.";
					break;
				}else if(com.equals("바위")) {
					result = "사용자가 이겼습니다.";
					break;
				}else {
					result = "비겼습니다.";
					break;
				}
			}
			System.out.println("사용자 = " + me + " , 컴퓨터 = " + com + ", " + result);
		}
	}

}
