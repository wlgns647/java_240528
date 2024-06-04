package day06;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortEx02 {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 5, 7, 9, 2, 4, 6, 8, 10 };
// dual-pivot quict sort 알고리즘 이용하여 정렬
	
//	 Integer 는 내림차순 재공함 	
//	Arrays 는 	int[] 에 대해 내림차순을 재공하지 않음
		Arrays.sort(arr);
		
//		for(int tmp : arr) {
//			System.out.println(tmp+" ");
	
	System.out.println(Arrays.toString(arr));
	Integer [] arr2 = {1,3,5,7,9,2,4,6,8,10};
		
	Arrays.sort(arr2,Collections.reverseOrder());
	}

}
