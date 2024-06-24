package day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
//	 	문자열 A 를 입력받아 리스트애 A를 포함하는 문자열들을 출력하는 예제 
		
		
//		문자열을  5개 입력받아 저장하는  
//		1.스캐너 
//		2.리스트 생성
//		3.반복문으로 리스트에 저장
//		4. 저장된 문자열 출력 
//		문자열 A 를 입력받아 리스트애 A를 포함하는 문자열들을 출력
		
		
		

		
//		1.스캐너 
		Scanner scan = new Scanner(System.in); 
//		2.리스트 생성
		List<String> list = new ArrayList<String>(); 
//		3.반복문으로 리스트에 저장
		for (int i = 1; i <= 5; i++) {
			System.out.print(" 문자열 입력: ");
			String tmp = scan.next();
			list.add(tmp);
		} 
//		4. 저장된 문자열 출력
		System.out.println(list); 

		// 문자열 A를 입력받아 리스트애 A를 포함하는 문자열들을 출력하는 예제 
		
		// 문자열 A를 입력받아 변수에 저장
		System.out.println("검색 문자열 입력: ");
		String search = scan.next();

		//2 반복문을 이용하여 전체탐색:향상된 for문
		for(String tmp : list) {
			//2-1 리스트에서 꺼낸 문자열에 문자열 A가 포함되어 있으면 문자열을 출력
			if (tmp.contains(search)) {
				System.out.println(tmp);
			}
		}
		
		
		
		
	}

}
