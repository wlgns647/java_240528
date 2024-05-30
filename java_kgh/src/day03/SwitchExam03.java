package day03;

import java.util.Scanner;

public class SwitchExam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   산술연산자와 두 정수를 입력받아 결과를 출력하는 스위치 문 으로 작성 
//		하나씩 3번 받고 결과
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" 두 정수와 산술 연산자를 입력하세요 (예: 1+2)");
		int num1 = scan.nextInt();
		char operator = scan.next().charAt(0);
		int num2 = scan.nextInt();
		
		switch(operator) {
		
		case '+': 
		System.out.println(num1+ " + " +num2 +" = " + (num1+num2));
		break;
		
		case '-': 
			System.out.println(num1+ " - " +num2 +" = " + (num1-num2));
			break;
		case '*': 
			System.out.println(num1+ " * " +num2 +" = " + (num1*num2));
			break;
		case '/': 
			System.out.println(num1+ " / " +num2 +" = " + (num1/(double)num2));
			break;
			default: System.out.println("다시 입력하세요");
	}
	}
}
