package chapter3;

import java.util.Scanner;

public class OpenChallenge {

	public static void main(String[] args) {
		
		
		boolean reMatch = true;
		Scanner scanner = new Scanner(System.in);
		
		while(reMatch) {
			int top = 99;
			int bottom = 0;
			int count = 0;
			System.out.println("수를 결정하였습니다. 맞추어 보세요");
			int ranCard = (int)(Math.random()*100);
			boolean correct = false;
			while(!correct) {
				System.out.println(bottom + " ~ " + top);
				count++;
				System.out.print(count + "번째>>");
				int choose = scanner.nextInt();
				if(ranCard > choose) {
					bottom = choose;
					System.out.println("더 높게");
				}else if(ranCard < choose) {
					top = choose;
					System.out.println("더 낮게");
				}else {
					correct = true;
					System.out.println("맞았습니다.");
					System.out.println("다시하시겠습니까?(y/n)>>");
					String s = scanner.next();
					if(s.equals("n")) {
						reMatch = false;
					}else break;
				}
			}
			
		}scanner.close();
		
	}

}
