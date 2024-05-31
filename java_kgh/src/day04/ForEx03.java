package day04;

import java.util.Scanner;

public class ForEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 문자를 입력받고 입력받은 문자가 y 면 종료하는 코드 for 문 작성
		//
		//for 문은 순차적으로 증가할때 많이 쓰고 
		//순차적이지 않은 경우 while 문 쓰긴하지만 다 대체 가능 
		
		
		Scanner scan= new Scanner(System.in);
		char ch;
		
		for(;;) { 
		
			System.out.print("문자입력:");
			ch = scan.next().charAt(0);
			if (ch =='y') {
				break;
			}
		}
	}

}
