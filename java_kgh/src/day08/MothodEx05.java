package day08;

import java.util.Arrays;

public class MothodEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] { 1, 3, 5, 7, 9 };
		int num = 2;
		if (contains(arr, num)) {

			System.out.println(num + "는" + Arrays.toString(arr) + "배열에 있습니다");
		} else {
			System.out.println(num + "는" + Arrays.toString(arr) + "배열에 없습니다");
		}

	}

	public static boolean contains(int[] arr, int num) {

		if (arr == null) {
			return false;
		}
		for (int tmp : arr) {
			if (tmp == num) {
				return true;
			}
		}
		 return false;
	}
}





