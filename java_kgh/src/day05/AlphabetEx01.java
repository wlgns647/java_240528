package day05;

public class AlphabetEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * a ab abc abcd
		 * 
		 * i=0 a부터 a까지 'a'+0까지 i=1 b까지 'a'+1까지 i=2 c까지 'a'+2까지 i=3 d까지 i=25 z까지 'a'+25까지
		 * 'a' + i 까지
		 * 
		 * 반복횟수 i 는 0부터 26보다 작을 때까지 1씩 증가 규칙성 a 부터 'a'+ i 까지 알파벳 출력
		 * 
		 * 
		 * 반복횟수 j 는 0부터 i 까지 1씩 증가 규칙성 a 부터 'a'+j 를 출력 반복문 종료 후
		 */

		int i, j;

		for (i = 0; i < 26; i++) {
			for (j = 0; j <= i; j++) {
				System.out.print((char) ('a' + j));
			}
			System.out.println();
		}

		/*
		 * 다른 방법으로
		 * 
		 * 반복횟수 ch1은 a부터 z까지 1씩 증가 규칙성 ch2는 a부터 ch1까지 출력
		 * 
		 * => 반복횟수 ch2는 a 부터 ch1 까지 1씩 증가 규칙성 ch2 를 출력 반복문 종료후 엔터 출력
		 */

		char ch1, ch2;
		for (ch1 = 'a'; ch1 <= 'z'; ch1++) {
			for (ch2 = 'a'; ch2 <= ch1; ch2++) {
				System.out.print(ch2);
			}
			System.out.println();

		}

		
	}

}
