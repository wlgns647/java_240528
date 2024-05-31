package day04;

public class WhileEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4가 소수인지 아닌지 판별하는 코드를 작성 소수는 약수가 1과 자기자신인 수
		 * 
		 * 반복횟수 1~4까지 규칙성 입력받은 값 ( 4) 을 작은 수부터 나눠서 본인 값으로 나눴을때 참이 되는 if 문으로
		 * 
		 *
		 * 와일에서 b가 a 까지 갔음 if 에서 소수면 소수라고 나오는데 아니였을 경우 와일문 빠져나와서 아닙니다 출력
		 * 
		 * 임의의 수 b 가 a가 될때까지 1식 늘어날때마다 b를 a 로 나누면 나머지가 2인경우 소수밖에 없음
		 * 
		 *
		 *
		 */ int b = 0;
		int a = 4; // 스케너 넣으면 입력받은값
		while (b < a) {
			
			b += 1;
			if (a % b == 2) {

				System.out.println(b + "  는 소수입니다 ");
			}

			/*
			 * 강사님 코드 int num = 4; int i=1; int count = 0; while ( i <= num) { count ++; }
			 * i++; } if (count ==2) { system.out.println(num+ "는 소수"
			 * system.out.println(num+ "는 소수가 아님"
			 */

		}
		System.out.println(b + "  는 소수가 아닙니다 ");

	}
}
