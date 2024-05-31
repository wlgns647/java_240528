package day04;

public class WhileEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 두 정수 8과 12의 최대 공약수를 구하는 코드 작성 공유하는 제일 큰 약수 (4임)
		 * 
		 * 반복    i는 1부터 8까지 1씩 증가 
		 * 규칙     i가 8과 12의 약수이면 i 를 gcd에 저장
		 * 		8을 i로 나눴을때 나머지가 0과 같고 12를 i로 나눴을때
		 * 		나머지가 0이면 i를 gcd에 저장 
		 * 반복문 종료 후  gcd 출력
		 */
		
		int gcd =1;
		int i =1;
		int num1 =8,num2 =12;
		
		while(i<=num1) {
			if (i% num1==0 && i%num2==0 ) { 
			gcd = i;
		}
			i +=1;
		
		}		
			System.out.println(num1+"과"+num2+ "의 최대 공약수:" + gcd);
}
}
