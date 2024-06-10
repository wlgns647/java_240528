package day08home;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" 배열 크기 입력: ");
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		int[] arr = createArray(size);
		System.out.println(Arrays.toString(arr));

	}

	public static int[] createArray(int size) {
		if (size < 0) {
			return null;
		}
		// int [] arr = new int[size];
		// return arr;
		return new int[size];
	}

}

// 기능 : 배열의 크기가 주어지면 배열 크기의 정수 배열을 생성해서 알려주는 메서드
// 매개변수 : 배열 int [] arr       배열 크기 int size