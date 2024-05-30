package day03;
import java.util.Scanner;

public class IfExam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//나이를 입력받아 19세 이상이면 성인 출력 미만이면 미성년자 출력
		//
		Scanner scan = new Scanner(System.in);
		System.out.println("나이를 입력하세요:");
		int num = scan.nextInt();
		
		if (num>=19) {
			System.out.println("성인 입니다");
		}else {
			System.out.println("미성년자 입니다 ");
		}
		
		
	}

}
