package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
//			다음 기능을 가진 프로그램을 작성하세요
//		메뉴
//		
//		1. 번호추가
//		2. 번호삭제 
//		3.번호조회 sysout list
//		4. 종료
		ArrayList<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);

		int menu1;
		do {
			System.out.println("메뉴");
			System.out.println("1. 번호추가");
			System.out.println("2. 번호삭제");
			System.out.println("3. 번호조회");
			System.out.println("4. 종료");
			menu1 = scan.nextInt();
			switch (menu1) {
			case 1:
				System.out.println("추가할 번호 입력: ");
				String number1 = scan.next();
				if (list.contains(number1)) {
					System.out.println("이미 등록된 번호입니다.");
				} else {
					System.out.println("번호를 등록했습니다");
					list.add(number1);
				}
				break;
			case 2:
				System.out.println("삭제할 번호 입력: ");
				String number2 = scan.next();
				if (list.remove(number2)) {
					System.out.println("삭제되었습니다  ");
				} else
					System.out.println("일치하는 번호가 없습니다");
				break;
			case 3:
				System.out.println(list);
				break;
			}

		} while (menu1 != 4);

	}

}
