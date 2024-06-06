package day07.homework;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballGame {

	public static void main(String[] args) {
		/* 숫자 야구 게임을 구현하세요.
		 * 규칙
		 * - 중복되지 않은 1~9사이의 랜덤한 수를 생성
		 * - 스트라이트 : 해당 숫자가 있고, 위치도 같은 경우
		 * - 볼 : 숫자가 있지만 위치가 다른 경우
		 * - 아웃 : 일치하는 숫자가 하나도 없는 경우
		 * 예시
		 * (3 9 7)
		 * 입력 : 1 2 3
		 * 1B
		 * 입력 : 5 6 7
		 * 1S
		 * 입력 : 4 5 6
		 * O
		 * 입력 : 3 7 9
		 * 1S2B
		 * 입력 3 9 7
		 * 3S
		 * 정답입니다.
		 * 
		 *  1.최대값 최소값 랜덤 선언 후 베열에 저장함
		 *  
		 *  
		 * 
		 * 
		 * */
		Scanner scan = new Scanner(System.in);
		int min = 1, max = 9;
		int random = (int) (Math.random() * (max - min + 1)) + min;
		
		int [] list  = new int [3];
		for (int i=0; i<list.length; i++) {
			list [i]  = random;
		//	System.out.println(Arrays.toString(list));
			
				while (list[1]==list[0]) {    //2번째 배열 
				random = (int) (Math.random() * (max - min + 1)) + min;
				list [1]  = random;
				
				while (list[2]==list[0]||list[2]==list[1]) { // 3번쨰 배열 
				random = (int) (Math.random() * (max - min + 1)) + min;
				list [2]  = random;
				
//				 중복되지 않은 1~9사이의 랜덤한 수를 생성 완료
				} 		
				}
			}

//		 스트라이트 : 해당 숫자가 있고, 위치도 같은 경우
//			볼 : 숫자가 있지만 위치가 다른 경우
//			아웃 : 일치하는 숫자가 하나도 없는 경우
		// 지금 위에 랜덤값이 중복됨 해결해야함
		
		System.out.println(Arrays.toString(list));
		
		
		
}
}
