package day04;

import java.util.Scanner;

public class DoWhileEx01 {

	public static void main(String[] args) {
		/*
		 * TODO Auto-generated method stub y를 입력하면 종료하는 코드를 작성
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		char ch;
		do {
			System.out.println("문자 입력: ");
			ch = scan.next().charAt(0);
		} while (ch != 'Y');

	}

}
