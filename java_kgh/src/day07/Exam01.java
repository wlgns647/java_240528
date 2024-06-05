package day07;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 	다음 메뉴를 출력하고 메뉴를 선택하면 안내문구를 출력하는 코드를 작성하세요

//		메뉴
//		1.추가
//		2.검색
//		3.종료
//		메뉴선택:1
//		추가했습니다
//		메뉴선택:3
//		검색했습니다
//		메뉴선택:3
//		종료합니다

		//
		Scanner scan = new Scanner(System.in);
		
		
		while (true) {
			System.out.println("메뉴");
			System.out.println("1.추가");
			System.out.println("2.검색");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 : ");
			int menu = scan.nextInt();
			// 메뉴판 있고 메뉴 선택했을때
			
			
			
			if (menu == 1) {
				System.out.println("추가했습니다");
				continue;
			} else if (menu == 2) {
				System.out.println("검색했습니다");
				continue;
			} else if (menu == 3) {
				System.out.println("종료합니다");
				break;
			}
		
		}
	}
}
