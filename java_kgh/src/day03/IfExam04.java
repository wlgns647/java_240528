package day03;

import java.util.Scanner;

public class IfExam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정수를 입력받아 3의 배수인지 아닌지 판별하는 코드를 작성하세요
		// 예 1: 정수입력: 6 3의 배수입니다
		// 정수입력: 2 3의 배수가 아닙니다.

		Scanner scan = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int num = scan.nextInt();

		System.out.println("정수를 입력하세요: ");

		if (num % 3 == 0) {
			System.out.println(num + "는 3의 배수입니다");
		} else {
			System.out.println(num + "는 3의 배수가 아닙니다");
		}

	}

}
