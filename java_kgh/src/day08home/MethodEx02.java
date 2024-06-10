package day08home;

import java.util.Arrays;
import java.util.Scanner;

public class MethodEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//     1~9 사이의 랜덤한 수를 배열에 저장하여 콘솔에 출력하는 코드를 작성하세요.
//	메서드 이용하세요 

//     스케너 자리에 랜덤 넣기 
//		랜덤 최대 최소값 입력하고 
//		랜덤함수 선언 
	
		// 정수 n 입력 받기
		System.out.print("랜덤값을 출력 후 배열에 저장후 출력하겠습니다  : ");
		int min = 1, max = 9;   //최대,최소값 
		int n = 5;    //배열의 크기 
		
		// 배열 생성
		int[] array = createRandomArray (n,min,max);  //메소드에서 createRandomArray 를 호출함 

		// 생성된 랜덤 출력확인용
		System.out.println("생성된 랜덤 :");             
		 System.out.println(Arrays.toString(array));      // 반환받은 array 값인 랜덤 배열의 문자열 형태로  출력함
		
	}

	// 배열 생성 메소드
	public static int[] createRandomArray(int size, int min, int max) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * (max - min + 1)) + min;
        }
        return array;
    }

}

	
		
