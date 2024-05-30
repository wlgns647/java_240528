package day03;
import java.util.Scanner;

public class IfEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("숫자 입력:");
		int num = scan.nextInt();

		if (num == 3 || num == 4 || num == 5) {
			System.out.println("봄");
		} else if (num == 6 || num == 7 || num == 8) {
			System.out.println("여름");
		} else if (num == 9 || num == 10 || num == 11) {
			System.out.println("가을");
		} else if (num == 12 || num == 1 || num == 2) {
			System.out.println("겨울");
		} else

			System.out.println("잘못된 입력");

		if(num >=3 && num <=5) {
			System.out.println("봄");
		} 
		else if (num >=6&& num <=8) {
			System.out.println("여름");
		}
		 else if (num >=9 && num <=11) {
				System.out.println("가을");
			} else if (num >=12 && num <=2) {
				System.out.println("봄");
			}
			else { 
				System.out.println("잘못된 입력");
			}
		
		
		
		
		
		
		
		
		
	}

}
