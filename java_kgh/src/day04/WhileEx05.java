package day04;

public class WhileEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		1부터 10까지  짝수 합을 구하는 코드를 작성하세요.
		규칙성      합에서 짝수만 빼려면 나머지 연산자 쓰고
		   		이것만 더하려면
		반복횟수= 초기화 증감식 조건식에만 영향 
		반복문 종료후		if (i%2==0) 
*/		
		int sum = 0;
		int i = 2;
		while (i <= 10) {
			sum+=i;
			i+=2;
		
		}
		System.out.println("1부터 10까지 짝수의 합 : "+ sum);
	}

}
