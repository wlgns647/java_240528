package day02;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 두 정수와 연산자를 입력받고 입력받은 결과를 콘솔에 출력하세요
		// 정수 1을 입력하세요
		//정수 2를 입력하세요
		// 연산자를 입력하세요 +
		// 결과 : 1+2
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 1을 입력하세요 :");
		int num1 = scan.nextInt();
		System.out.println("정수 2을 입력하세요 :");
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력하세요 :");
		char operator = scan.next().charAt(0);
		System.out.println(""+num1+operator+num2);
	}

}
