package day03;

import java.util.Scanner;

public class SwitchExam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 월 입력받아 계절 출력 swtch 문 사용 

		Scanner scan = new Scanner(System.in);
		System.out.println(" 월 을 입력하세요 ");

		int num = scan.nextInt();

		switch (num) {
		case 3, 4, 5:			//case3: case4: case5:
			System.out.println("봄");
			break;
		case 6, 7, 8:
			System.out.println("여름");
			break;

		case 12, 1, 2:
			System.out.println("겨울");
			break;
		case 9, 10, 11:
			System.out.println("가을");
			break;

		}

	}

}
