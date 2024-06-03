package day05;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/* 		3개의 정수를 입력받아 배열에 저장하고, 
 *		 역순으로 출력하는 코드를 작성하세요.
 * 
 * 
 */
		Scanner scan= new Scanner(System.in);
		int arr[] = new int[3];
		for (int i=0; i<arr.length;i++) {
			System.out.print("정수입력: ");
			arr[i] = scan.nextInt();
		}
		// 역순으로 출력
		for(int i= 0; i<arr.length;i++) {
//			 i가 0일떄 2번지 선택,
//			i 가 1일때 1번지 
//			i가2일때 0번지
//			 2-i 번지 
			System.out.print(arr[arr.length -i-1]+ " ");
		}
		//역순으로 출력 
		for(int i= arr.length-1; i>=0;i--) {
//			 i가 0일떄 2번지 선택,
//			i 가 1일때 1번지 
//			i가2일때 0번지
//			 2-i 번지 
			System.out.print(arr[i]+ " ");
		}
	}

}
