package day15;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<5;i++) {
			System.out.println("번호: ");
			list.add(scan.next());
		}
		System.out.println(list);
		// 삭제할 전화번호를 입력받아 삭제하는 코드를 작성하세요
		System.out.println("삭제할 번호 입력: ");
		System.out.println(list.remove(scan.next()));
		System.out.println("삭제되었습니다  ");
		System.out.println(list);
		
		
		

	}
}
