package day08home;

import java.util.Arrays;

public class MethodEx03 {
	// TODO Auto-generated method stub
	// 배열에 랜덤으로 1~9 사이의 중복되지 않은 배열을 생성하고
//			콘솔에 출력하는 코드를 작성하세요
//			메서드를 사용하세요

	public static void main(String[] args) {
		int size = 3,min=1, max=4;
		System.out.println(Arrays.toString(arr));
	
	}

	return(int)(Math.random()*(max-min+1))+min;

}

	public static boolean contains(int[]arr, int count, int num) {
	
		//배열이 null인경우
		if(arr ==null) {
			return false;
		}
			//count가 배열의 크기보다 큰 경우
		if (count > arr.length) {
			count = arr.length;
		}
		
		for(int i=0;i<arr.countl; i++) {
			if(arr[i] ==num) {
				return true;
			}
			return false;
		}
	}

	public static int [] createRandomArray(int size, int min, int max) {
		if (size <0 ) {
		
			return null;
		}
			if (min>max) {
				int tmp = min;
				min = max;
				max = tmp;
			}
			if(size>max-min+1)
			{
	// 랜덤 숫자의 범위가 배열의 크기보다 작은경우
	// 랜덤범위가 1~9 크기가 20
				return null;
			}
	
	int count = 0; //저장된 개수 
	int[]arr = new int [size];
	while (count<size) {
		int random = random(min,max);
		if(!contains(arr,count,random)){
			arr[count] = random;
				count++;
		
		}
		}
	return arr;
	}
}
