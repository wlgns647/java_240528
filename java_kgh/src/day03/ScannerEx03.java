package day03;

import java.util.Scanner;

public class ScannerEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		한번에 여러 값을 받는 Scanner 예제
// 학생 3명의 성적을 한 번에 입력받는 예제 
		
		
		int score1, score2, score3;
		Scanner scan =new Scanner(System.in);
		
		System.out.print(" 세 학생의 성적을 입력하세요: ");
		score1 =scan.nextInt();
		score2 =scan.nextInt();
		score3 =scan.nextInt();
		
		System.out.println("세 학생의 성적:" +score1+","+score2+score3);
		
		
		
		
	}

}
