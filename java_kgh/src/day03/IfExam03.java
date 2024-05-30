package day03;

import java.util.Scanner;

public class IfExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 산술 연산자와 두 정수를 입력받아 산술 연산자에 맞는 연산 결과를
		// 출력하는 코드를 작성하세요

		// 두 정수와 산술연산자를 입력하세요
		// 결과

		// 스케너 이용해 두 정수와 산술연산자를 입력
		// 산술 연산자 문자로 입력
		// 입력할때 냅다 1+3 이렇게 입력하면

		// vktmdlsxm
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
			System.out.println(operator +"는 산술 연산자가 아닙니다." );


	}

}
