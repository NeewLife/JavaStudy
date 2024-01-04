package chapter3;

public class Ex13 {

	public static void main(String[] args) {
		for(int i = 1; i < 100; i++) {
			int ten = i / 10;
			int one = i % 10;
			if(ten % 3 == 0 && i >= 10) {
				if(one / 3 != 0 && one % 3 == 0) {
					System.out.println(i + " 박수 짝짝");
				} else {
					System.out.println(i + " 박수 짝");
				}
			}else {
				if(one / 3 != 0 && one % 3 == 0) {
					System.out.println(i + " 박수 짝");
				}
			}
		}
	}

}
