package day05;

public class EnhancedForEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	배열에 1,2,3,4,5 를 저장한 후 향상된 for 문을 이용하여 조회하는 예제 

		int[] arr = new int[] { 1, 2, 3, 4, 5 };

		for (int tmp : arr) {
			System.out.println(tmp);
		}
		
		
		
		for (int i = 0; i < arr.length; i++) {
			int tmp = arr[i];
			System.out.println(tmp);
		}
//		같은 의미이지만 향상된 for 문 이용하면 훨신 간단해짐
		

	}

}
