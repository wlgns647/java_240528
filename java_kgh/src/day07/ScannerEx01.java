package day07;
import java.util.Scanner;

public class ScannerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 스케너를 이용하여 넥스트와 넥스트 라인의 차이를 살펴보는 예제
		
		Scanner scan = new Scanner(System.in); 

		System.out.println("문자열 입력 next");
		String num1 = scan.next();
		
		System.out.println("문자열 입력 next");
		String num2 = scan.nextLine();
		
		System.out.println("문자열 입력 next");
		String num3 = scan.nextLine();
		
	}

}
