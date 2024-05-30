package day03;

public class NestedIfEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	6의 배수를 중첩 if 문을 이용하여 작성하는 예제
//	
		int num = 6;
		if (num % 6 == 0) {
			System.out.println("6의 배수입니다 ");
		} else {
			System.out.println("6의 배수가 아닙니다");
		}

		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("6의 배수입니다 ");
		} else {
			System.out.println("6의 배수가 아닙니다");
		}
		// 중첩 if문

		if (num % 2 == 0) {
			if (num % 3 == 0) {
				System.out.println("6의 배수입니다");
			} else
				System.out.println("6의 배수가 아닙니다");
		}

	}

}
