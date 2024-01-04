package chapter3;

import java.util.Scanner;


public class Ex14 {

	public static void main(String[] args) {
		
		String[] course = {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int[] score = {95, 88, 76, 62, 55};
		
		boolean retry = true;
		while(retry) {
			System.out.print("과목이름>>");
			Scanner scanner = new Scanner(System.in);
			String s = scanner.next();
			
			int n = 0;
			
			for(int i = 0; i < course.length; i++) {
				if(s.equals(course[i])) {
					n = score[i];
					break;
				}
			}
			if(n != 0) {
				System.out.println(s + "의 점수는 " + n);
			}else {
				System.out.println("없는 과목입니다.");
			}
			
			if(s.equals("그만")) {
				retry = false;
				scanner.close();
			}
			
			
		}
		
		
	}

}
