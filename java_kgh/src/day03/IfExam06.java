package day03;

import java.util.Scanner;

public class IfExam06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		성적을 입력받아 학점을 출력
//		100점부터 10점당 a,b,c,d,60미만 f, 나머지 잘못된 성적

		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int num = scan.nextInt();

		if (num >= 90 && num <= 100) {
			System.out.println("A 입니다 ");
		} else if (num >= 80 && num < 90) {
			System.out.println("B 입니다 ");
		} else if (num >= 70 && num < 80) {
			System.out.println("C 입니다 ");
		} else if (num >= 60 && num < 70) {
			System.out.println("D 입니다 ");
		} else if (num >= 0 && num < 60) {
			System.out.println("F 입니다 ");
		} else if (num < 0 || num > 100) {
			System.out.println(num + " 입력값을 확인하세요");

		}
	}
}
