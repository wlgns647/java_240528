package day03;

import java.util.Scanner;

public class NextedIfEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println(" 두 정수와 산술 연산자를 입력하세요 (예: 1+2)");
		int num1 = scan.nextInt();
		char operator = scan.next().charAt(0);
		int num2 = scan.nextInt();
		double result;

		if (operator == '+') {
			result = num1 + num2;
			System.out.println(" " + num1 + operator + num2 + "=" + result);
		} else if (operator == '-') {
			result = num1 - num2;
			System.out.println(" " + num1 + operator + num2 + "=" + result);

		} else if (operator == '/') {
			
			result = num1 / num2;
			System.out.println(" " + num1 + operator + num2 + "=" + result);

		} else if (operator == '%') {
			
			result = num1 % num2;
			System.out.println(" " + num1 + operator + num2 + "=" + result);

		} else
			System.out.println(operator + "는 산술 연산자가 아닙니다.");

	}

}
