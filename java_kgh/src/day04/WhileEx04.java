package day04;

public class WhileEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*		1부터 10까지 합을 구하는 코드를 작성하세요.
		반복횟수:  10번
		규칙성	
		
		
		
				i = 1 sum = 0+1
				i = 2 sum = 0+1+2
				i = 3 sum = 0+1+2+3
		
		
						sum0=0
				i = 1 sum1 = sum0+1
				i = 2 sum2 = sum1+2
				i = 3 sum3 = sum2+3
				.
				.
				.
				i = 10 sum= sum +10
				i = 10 sum = sum + i
				sum = sum + i 
					
		
		
		반복문 종료후
*/		
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum+=i;
			++i;			
		}
		System.out.println("1부터 10까지 합 : "+ sum);
	}

}
