package day05;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1~10 사이의 랜덤한 수 3개를 저장하고 출력하는 코드 작성
		 * 
		 */

		int arr[] = new int[3];
		int min = 1, max = 10;

		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * (max - min + 1) + min);
			arr[i] = random;
			System.out.println("랜덤 수: " + arr[i]);
		}

	}

}
