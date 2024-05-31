package day04;

public class NestedForEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// num 소수인지 아닌지 판별코드 사용해 100 이하 소수 출력코드 작성
//		num 은 2부터 100까지 1씩 증가
//		num 소수인지 판별해 소수면 num출력 

		int i, count = 0;
		for (int num = 3; num < 100; num++) {

			for (i = 1,count = 0; i <= num; i++) {
				if (num % i == 0) {
					count++;

				}
			}
			if (count == 2) {
				System.out.println(num + " 는 소수 ");
			} 
		}
	}
}
