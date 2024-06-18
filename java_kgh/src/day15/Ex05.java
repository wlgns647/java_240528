package day15;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
//		 숫자 야구게임을 구현하세요
//		중복되지 않은 1~9 사이의 3개 숫자를 생성

//		반복문 
//		사용자가 숫자 3개를 중복되지 않게 1~9 사이값을 입력
//		입력한 값과 랜덤 값을 이용하여 결과를 출력

//		S 숫자가 있고 위치가 같은경우
//		B 숫자가 있고 위치가 다른경우
//		O 일치하는 숫자가 없는경우 
		
		int min = 1, max = 9, count = 3 ;
		List<Integer> com = createRandom(min,max,count);
		System.out.println(com);
		 // 반복문
		int strike, ball;
		Scanner scan = new Scanner(System.in);
		List<Integer> user;
		do {
			strike = ball = 0;
			System.out.println("입력 : ");
			List<Integer> imputuser = null;
			user = imputuser;
		}while(strike != 3);
		

			
  
	}

	private static List<Integer> createRandom(int min, int max, int count) {
		// 1,3 이 와야하는데 3,1이 온경우 1,3으로 변경 
		if(min>max) {
			int tmp = min;
			min = max;
			max =tmp;
		}
		if(max-min +1 < count) {
			String format = "{0}~{1} 사이에서 중복되지 않은 {2} 개의 수를 만들수 없습니다";
			throw new RuntimeException(MessageFormat.format(format, min,max,count));
		}
		// 중복 제거를 위해 Set을 활용했음
		HashSet<Integer> set = new HashSet<Integer>();
		while (set.size()<count) {
			int r =(int)(Math.random()*(max =min+1)+min);
			
		}
		// 숫자 야구 게임에서 순서가 중요하기 때문에 Set에 있는 숫자들을 
		//List 에 저장 후 섞어줌
		List<Integer>list = new ArrayList<Integer>();
		Collections.shuffle(list);
		return list;
		
	}
}
