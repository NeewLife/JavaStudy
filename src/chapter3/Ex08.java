package chapter3;
import java.util.Scanner;
public class Ex08 {

	public static void main(String[] args) {
		System.out.print("정수 몇개?");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[][] arr = new int[10][10];
		
		for (int i = 0; i <= num/10; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(i*10+j == num) {
					break;
				}
				int randomInt = (int)(Math.random() * 100) + 1;
				for(int k = 0; k <= i; k++) {
					for(int l = 0; l < arr[i].length; l++) {
						if(arr[k][l] == randomInt) {
							randomInt = (int)(Math.random() * 100) + 1;
							k = 0;
							l = 0;
						}
					}
				}
				arr[i][j] = randomInt;
				System.out.print(arr[i][j] + " ");
			}System.out.println();
		}
		scanner.close();
	}

}
