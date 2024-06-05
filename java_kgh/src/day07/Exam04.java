package day07;

import java.util.Scanner;

public class Exam04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Exam 01~03 기능을 전부 합쳐서 다음 기능을 구현 하세요 
		/*
		 * 
		 * 
		 * 
		 * 메뉴 
		 * 1.추가
		 * 2.검색
		 * 3.종료
		 * 
		 * 매뉴선택: 1
		 * ----------------------------------------
		 * 단어 입력 (종료: -1) : abc
		 * 단어를 추가했습니다. / 단어를 추가하지 못했습니다
		 * 단어 입력( 종료:-1) :-1
		 * 메뉴로 돌아갑니다.
		 * 
		 * 매뉴선택: 2 
		 * 단어 입력 (종료: -1) : 
		 *있는 단어입니다/ 없는 단어입니다 
		 *단어 입력( 종료:-1) :-1
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		//  입력값 인풋 저장할 배열 
		String [] input = new String [2];
		// 배열 꽉 찾는지 카운트 하는 변수 
		int count=0; 
		// 검색할 때 있는지 없는지 확인할 변수
		boolean result;
		
		while (true) {
			System.out.println("메뉴");
			System.out.println("1.추가");
			System.out.println("2.검색");
			System.out.println("3.종료");
			System.out.print("메뉴 선택 : ");
			int menu = scan.nextInt();
			// 메뉴  화면 
			
			//1번 화면 
			if (menu == 1) {
				System.out.print("단어입력(종료: -1)  : ");
				String i = scan.next();
				// 여기서 스켄뜬 i 값을 input i 에 저장해야함 
//				 저장하면서 1 카운트 하고  카운트 한 값이 저장된 i.length 랑 같으면? 
				// 배열이 꽉 찬거니까 단어를 추가하지 못했습니다. 출력
				
					System.out.println("단어를 추가했습니다.");
					count ++;
					System.out.println();
					System.out.println("단어를 추가하지 못했습니다.");
				System.out.print("단어입력(종료: -1)  : ");
				
				continue;
			} 
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
