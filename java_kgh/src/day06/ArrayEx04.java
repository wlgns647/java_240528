package day06;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 	4자리 정수를 입력받아 
//		입력받은 정수를 역순으로 배열에 저장
//		출력하는 코드를 작성하세요

		// 1234 => 0번지에 4,1번지에 3,2번지에2,3반지에1을 저장하고
//		4321순으로 출력

//		 4자리 점수입력 
//		4자리 점수입력이 아니면  잘못입력 출력하고 
//		4자리 정수이면 역순으로 배열에 저장
//		 배열에 값을 순차적으로 출력 

		Scanner scan = new Scanner(System.in);
		int[] arr1 = new int[4];
		System.out.println("숫자를 입력하세요");
		int num1 = scan.nextInt();

		if (num1 < 1000 || num1 > 9999) {
			System.out.println("4자리 정수가 아닙니다");
		} else {
			int tmp = num1;
			int i = 0;
			while (tmp != 0) {
				arr1[i++] = tmp % 10;
				tmp = tmp / 10;
			}
			for (int tmp2 : arr1) {

				System.out.print(tmp2);
			}

		}

	}

}
