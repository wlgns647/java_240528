package day03;
import java.util.Scanner;

public class IfEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//else if 예제
		
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력:");
		int num = scan.nextInt();
		
		//num 가 0이 아닌 양수면 양수 출력 0.양수가 아니면 음수 출력
		
		if (num == 0 ) {
			System.out.println(0);
		} else if(num>0){
			System.out.println("양수");
		} else{
			System.out.println("음수");
		}
		
		
		
	}

}
