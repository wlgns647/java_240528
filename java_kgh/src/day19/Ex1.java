package day19;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// List 배열을 만들고 입력한A 가 포함된 배열을 출력하는 코드
		
		Scanner scan = new Scanner(System.in);
		//List 배열을 만듬 
		List<String> list = new ArrayList<String>();
		//for 문으로 배열에 값을 저장 
		for(int i=1;i<=5;i++) {
			String tmp = scan.next();
			list.add(tmp);
		}
		System.out.println(list);
		//문자열 A를 입력받아 변수에 저장
		
		//반복문을 이용하여 전체탐색
		
		//출력 
		
		
	}

}
