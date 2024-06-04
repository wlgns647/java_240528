package day06;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in); // 스켄
		/*
		 * 
		 * updown 게임에 다음 기능을 추가
		 * 
		 * 메뉴 1. 플레이 2. 기록확인 3. 종료
		 * 
		 * 메뉴 선택: 1 (랜덤이 35라고 가정) 정수입력 : 50 down 정수입력 : 30 up 정수입력: 35 정답입니다 . 기록이 등록됩니다
		 * 
		 * 
		 * 메뉴 기록확인 선책
		 * 
		 * 1. 3회 매뉴선택 : 3 프로그렘 종료합니다
		 */
		int[] score3 = new int[3];
		while (true) {
			System.out.println("홀짝게임 ");
			System.out.println("메뉴");
			System.out.println("1. 플레이");
			System.out.println("2. 기록확인");
			System.out.println("3. 종료");
			int num1 = scan.nextInt();
			if (num1 == 1) {

//		1. 매뉴판 만들기
//		2. 선택하는곳 만들기	
// 		3. 점수 산출
//		4. 점수 저장 - 해결못함 
//		5. 종료 기능 

				int min = 1, max = 100; // 변수 선언
				int random = (int) (Math.random() * (max - min + 1) + min); // 랜덤 만듬
				System.out.println("랜덤한 수를 맞춰보세요"); // 랜덤 출력 + random
				int count = 1;
				System.out.println("숫자를 입력하세요"); // 입력요청
				System.out.println(random);
				int num = scan.nextInt(); // 숫자 받음
				// while 안에 if else 넣을꺼임
//		 판별하고 아니다 출력하고 다시 숫자로 올려야함 
//		 만약 num 이 랜덤보다 작다면 크다면  그것도 아니라면 

				while (num != random) { // 플레이단
				
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
				count += 1;
				System.out.println("정답입니다");
				System.out.println("총" + count + " 번 시도했습니다 ");
				for (int i = 0; i < score3.length; i++) {
                    if (score3[i] == 0 || count < score3[i]) {
                        score3[i] = count;
                        break;
                    }
                }
                
			} else if (num1 == 2) {// 여기까지 게임
				System.out.println("순위권 기록을 확인합니다 ");
				if (score3[0] < score3[1]) {
				}
				// 괄호안에 , 찍고 시작 번지 마지막 번지 적으면 원하는부분만 건들수 있음
				Arrays.sort(score3);

				System.out.println("1등" + score3[0] + " 번 입니다");
				System.out.println("2등" + score3[1] + " 번 입니다");
				System.out.println("3등" + score3[2] + " 번 입니다");

				System.out.println("아무키나 누르면 돌아갑니다 ");
				String num2 = scan.next();
				continue;
			} else if (num1 == 3) {
				System.out.println("시스템을 종료합니다");
				break;
			}
			
		}
	}
}