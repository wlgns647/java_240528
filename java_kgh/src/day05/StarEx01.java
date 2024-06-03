package day05;

public class StarEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * *을 하나씩 출력해서 다음과 같이 출력되도록 중첩 반복문을 이용하여 작성하세요 ***** ***** ***** ***** ***** 하나씩
		 * 25번 출력해야함
		 * 
		 * 반복횟수 i 는 1부터 5까지 1씩 증가
		 * 
		 * 규착성 종료 후
		 * 
		 * * 만들고 5번 출력되면 /n으로 줄바꾸고 5번 반복되면 탈출
		 * 
		 * 
		 */

		char a = '*';
		int i = 0; // 줄
		int j = 0; // 줄

		for (i = 0; i < 5; i++) {
			System.out.print(a);
		}
		for (j = 0; j < 5; j++) {
			System.out.println();
			for (i = 0; i < 5; i++) {
				
				System.out.print(a);
			}
		}
		System.out.println();

	}

}
