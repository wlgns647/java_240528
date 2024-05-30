package day03;

import java.util.Scanner;

public class IfEx01 {

	public static void main(String[] args) {

	//if 문을 이용한 홀짝 판별 예재
		Scanner scan = new Scanner(System.in);
		System.out.println("입력:");
		int num = scan.nextInt();
	if (num%2 != 0) { 
	System.out.println("홀수");
	}
	if (num%2 == 0) { 
	System.out.println("짝수");
	}

	
	}
}