package day04;

import java.util.Scanner;

public class BreakEx01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	// y를 입력하면 중지하는 코드 작성
//	   아까는 초기화 했지만 지금은 탈출
	
	char ch;
	Scanner scan = new Scanner(System.in);ch = scan.next().charAt(0);

	
			while (true) {
		System.out.println("문자입력: ");
		 ch = scan.next().charAt(0);
		 if (ch=='y') {
			 break;
		 }
	
	
			
	
	}
	
	}
}
