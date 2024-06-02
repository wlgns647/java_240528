package day04homework;

import java.util.Scanner;

public class upDownGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1~100 사이의 랜덤한 수를 생성하여 해당 숫자를 맞추는 게임을 작성 예 (랜덤한 수가 30) 정수 입력: 50 down! 정수 입력:
		 * 30 정답입니다!
		 * 
		 * 
		 * 스케너 만들고 for 문 안에 스케너 값 랜덤 값 비교
		 * 
		 */
		int count = 0;
		int min = 1, max = 100; // 변수 선언
		int random = (int) (Math.random() * (max - min + 1) + min); // 랜덤 만듬
		System.out.println("랜덤한 수를 맞춰보세요"); // 랜덤 출력 + random

		System.out.println("숫자를 입력하세요"); // 입력요청
		Scanner scan = new Scanner(System.in); // 스켄
		int num = scan.nextInt(); // 숫자 받음
		// while 안에 if else 넣을꺼임
//		 판별하고 아니다 출력하고 다시 숫자로 올려야함 
//		 만약 num 이 랜덤보다 작다면 크다면  그것도 아니라면 

		while (num != random) {

			if (num < random) {
				System.out.println("값이 작습니다");
				num = scan.nextInt();
				count += 1;
				continue;
			} else if (num > random) {
				System.out.println("값이 큽니다");
				num = scan.nextInt();
				count += 1;
				continue;
			} else
				break;

		}
		System.out.println("정답입니다");
		System.out.println("총" + count + " 번 시도했습니다 ");
	}
}
