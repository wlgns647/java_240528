package day04;

import java.util.Scanner;

public class WhileEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 반복문을 이용하여 문자를 입력받고 입력받은 문자가 y 이면 반복문 종료
		 * 
		 * 반복 y 나올때까지 계속 규칙 문자 입력받고 y 인식하면 반복문 빠져나옴
		 * 
		 */
		char ch = 'n';
		Scanner scan = new Scanner(System.in);

		while (ch != 'y') {
			System.out.println("문자를 입력하세요");
			ch = scan.next().charAt(0);

		}

	}

}
