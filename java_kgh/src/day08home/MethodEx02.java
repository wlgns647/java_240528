package day08home;

import java.util.Scanner;

public class MethodEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//     1~9 사이의 랜덤한 수를 배열에 저장하여 콘솔에 출력하는 코드를 작성하세요.
//	메서드 이용하세요 

//     스케너 자리에 랜덤 넣기 
//		랜덤 최대 최소값 입력하고 
//		랜덤함수 선언 
		int min = 1, max = 9;
		int random = (int) (Math.random() * (max - min + 1)) + min;

		// 정수 n 입력 받기
		System.out.print("배열의 크기를 생하겠습니다 : ");
		int n = random;

		// 배열 생성
		int[] array = createRandom(n);

		// 생성된 랜덤 출력확인용
		System.out.println("생성된 랜덤 :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	// 배열 생성 메소드
	public static int[] createRandom(int size) {
		return new int[size];
	}

}

