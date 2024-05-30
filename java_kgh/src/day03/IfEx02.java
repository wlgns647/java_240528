package day03;
import java.util.Scanner;

public class IfEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//if else 문을 이용하여 홀짝 판별 예제
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력:");
		int num = scan.nextInt();
		
		if (num%2 != 0) { 
			System.out.println("홀수");
			}else {
			System.out.println("짝수");
			}
		// else는 현위치에서 연결되있
	
		
	}
}
