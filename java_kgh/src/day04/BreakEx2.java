package day04;

public class BreakEx2 {
	public static void main(String[] args) {
	/*
	 * 최대공약수 예제를 break 문을 이용하여 구현 num1에 8, num2에 12가 저장되어있고 num1과 num2 의 최대 공약수를 다음과
	 * 같이 구하세요 반복횟수 i는 num1 부터 1까지 1씩 감소 규칙 i가 num1 과 num2 의 약수이면 i를 출력후 반복문 종료 종료후
	 * 끝
	 * 
	 * 
	 * 
	 * 
	 */
	int num1 = 8, num2 = 12;
	int i = num1;

	while(i>=1) {
		if (num1 % i == 0 && num2 % i == 0) {
			System.out.println(num1 + num2 + i);
			break;
		}

	}

	}
}
