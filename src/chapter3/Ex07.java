package chapter3;

public class Ex07 {

	public static void main(String[] args) {
		System.out.print("랜덤한 정수들 : ");
		int[] arr = new int[10];
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
			System.out.print(arr[i] + " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("평균은 " + sum/arr.length);
		
	}

}
