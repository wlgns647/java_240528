package day04;

public class WhileEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		구구단 2단을 출력하는 코드작성
//		2 x 1 = 2 ... 2 x 9 = 18
		// 앞 뒤 자리 선언하고 뒤자리가 9가 될때까지 ++
		int a = 2;
		int b = 1;
		while (b <= 9) {
			System.out.println(a + " * " + b + " = " + a * b);
			++b;
		}
//      곱하고 출력문 가도 됨

	}

}
