package day03;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 학생 3명의 성적을 입력받아 총점과 평균을 구하는 코드 작성 
		// 학생 1,2,3 순 65, 100, 76 합하고 총점 구해서 소수점 보이게
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학생1 점수 입력: ");
		int num1 = scan.nextInt();
		System.out.println("학생2 점수 입력: ");
		int num2 = scan.nextInt();
		System.out.println("학생3 점수 입력: ");
		int num3 = scan.nextInt();
		
		int total = num1 + num2 +num3;
		double num4 = (double)total / 3;
		
		System.out.println(num4);
		
		
		 
		
		
		
		
	}

}
