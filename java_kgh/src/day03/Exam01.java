package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//성적을 입력받아 60점 이상이면 pass 아니면 Fail 출력
		// 성적 입력 65  ,45 
		
		Scanner scan= new Scanner (System.in);
		
		System.out.println("점수를 입력: ");
		int num = scan.nextInt();
		String result = (num > 59)? "pass":"fail";
	
		System.out.println(result);
		
		
			
		
		
		
		
	}

}
