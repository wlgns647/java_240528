package day03;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//2개 과목 성적을 입력받아 평균 60점이 넘고 40미만과락 없음 합격
		//아니면 불합격하는 코드 작성
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫 과목 성적 입력:");
		int num1 = scan.nextInt();
		System.out.println("두 번쨰 과목 성적 입력:");
		int num2 = scan.nextInt();		
		
		int total = num1+num2;
		double num3 =(double)total/2;
		
		boolean isFail = num1<40 || num2<40;
		//		String result = (조건식) ? "합 ":"불" ;
		String result = (num3 >= 60 && !isFail)? "합격" : "불합격";
				System.out.println( result);
				
		
		
		
		
	}

}
