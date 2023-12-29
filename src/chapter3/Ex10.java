package chapter3;

public class Ex10 {

	public static void main(String[] args) {
		int[][] arr = new int[4][4];

		for(int k = 0; k < 10; k++) {
			int randomInt = (int)(Math.random() * 16);
			int row = randomInt / 4;
			int col = randomInt % 4;
			if(arr[row][col] == 0) {
				arr[row][col] = (int)(Math.random() * 10) + 1;
			}else {
				k--;
				continue;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println();
		}
		
		
	}

}
