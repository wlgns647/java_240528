package day04;

public class WhileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		while 문을 이용하여 1부터 5까지 콘솔에 출력하는 코드를 작성
//		10 부터 1까지 출력코드 작성
//		반복횟수:
//		규칙성
//		반복문 종료후 

		int i = 1;
		while (i <= 5) {
			System.out.println(i);
			++i;
		}
//		10 부터 1까지 출력코드 작성
//		반복횟수: 
//		규칙성
//		반복문 종료후 
		System.out.println("---------------------");
		i = 10;
		while (i >= 1) {
			System.out.println(i);
			--i;
		}

	}
}
