package chapter3;

public class CheckTime01 {

	public static void main(String[] args) {
		System.out.println("for문 별찍기");
		for(int i = 5; i > 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		System.out.println("=============");
		System.out.println("while문 별찍기");
		int i = 5;
		while(i > 0) {
			int j = i;
			
			while(j > 0) {
				System.out.print("*");
				j--;
			}
			System.out.println("");
			i--;
		}
		
		System.out.println("=============");
		System.out.println("do-while문 별찍기");
		int k = 5;
		do {
			int l = k;
			do {
				System.out.print("*");
				l--;
			}while(l > 0);
			System.out.println("");
			k--;
		} while(k > 0);
		
		
	}

}
