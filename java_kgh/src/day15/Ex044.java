package day15;

import java.net.MulticastSocket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Ex044 {

	private static HashSet<Integer> set;

	public static void main(String[] args) {
//		1~ 45 사이의 중복되지 않는 6개의 번호와 1개의 보너스 번호를 랜덤으로 생성하고 
//		사용자가 번호를 6개 입력해서 몇등인지 맞추는 로또 예제 
//		1등: 번호 6개가 일치
//		2등: 번호 5개와 보너스 번호 일치 
//		3등: 번호 5개가 일치
//		4등: 번호 4개가 일치
//		5등: 번호 3개가 일치
//		꽝 : 

//		 로또 번호와 보너스 번호를 생성
//		배열이 2개?  
//		사용자가 6개의 번호를 입력
//		입력한 번호를 이용하여 당첨 등수를 출력
		int min = 1, max = 45;
		HashSet<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();

//		메인번호 출력 
		for (int i = 0; i < 6; i++) {
			int random = (int) (Math.random() * (max - min + 1)) + min;

			if (set1.contains(random)) {
				i--;
				continue;
			} else
				set1.add(random);
		}

//	 보너스 번호 출력 
		for (int j = 0; j < 1; j++) {
			int random1 = (int) (Math.random() * (max - min + 1)) + min;

			if (set1.contains(random1)) {
				j--;
				continue;
			} else
				set2.add(random1);

		}
		System.out.println(set1);
		System.out.println(set2);
		
		// 입력받고 비교하면 됨 
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> list1 = new ArrayList<Integer>();		
		System.out.println("추첨번호 6 자리를  입력해주세요");
//		메인번호 입력 
		for(int k=0; k<6; k++) {
			list1.add(scan.nextInt());
		}
 
//		당첨 번호 비교시
//		1등: 번호 6개가 일치 > 메인번호 비교
//		2등: 번호 5개와 보너스 번호 일치 메인번호 비교, 보너스 번호 비교
//		3등: 번호 5개가 일치   메인번호 비교
//		4등: 번호 4개가 일치	메인번호 비교
//		5등: 번호 3개가 일치 	메인번호 비교
		int count = 0;
		for(Integer tmp :list1 ) {
			if (set1.contains(list1));
			count ++;
		}
			
		switch(count) {
		case 6: System.out.println("1등입니다");
			break;
		case 5:
			if (list1.contains(set2)) {
				System.out.println("2등입니다");
			}
			break;
		case 4:System.out.println("3등입니다");
			break;
		case 3:System.out.println("4등입니다");
			break;
		default: System.out.println("당첨되지 않았습니다");
		
		
		}
		
		
	
		
		
		
}
	
}

