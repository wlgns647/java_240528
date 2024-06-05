package day07;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			입력한 문자열이 배열에 있는지 없는지 확인하는 코드를 작성하세요
//		단어입력 ( 종료:-1) : apple
//		
		Scanner scan = new Scanner(System.in);
		String[] list = new String[] { "cat", "dog", "banana" };
		System.out.println("단어를 입력하세요");
		boolean result;
		String input = scan.next();
		
		for (String input : list) {
			if (scan.equals("-1")) {
				System.out.println("종료합니다");
				break;
			}
			result = false;
			if (list.equals(input)) {

				System.out.println("있습니다");
				continue;
			} else {
				System.out.println("없습니다");
				continue;

			}
		}
	}
}
