package chapter3;


public class Ex3_18 {

	public static void main(String[] args) {
		String[] stringNumber = {"23", "12", "3.141592", "998"};
		
		int i = 0;
		try {
			for(i = 0; i < stringNumber.length; i++) {
				int j = Integer.parseInt(stringNumber[i]);
				System.out.println("정수로 반환된 값은 " + j);
			}
		}catch(NumberFormatException e) {
			System.out.println(stringNumber[i] + "는 정수가 아닙니다.");
		}
		
	}

}
