package day15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class Ex04 {

	public static void main(String[] args) {
//			1에서 10 사이의 랜덤한 수 6개를 중복되지 않게 생성해서
//			저장하고 출력하는 코드를 작성 
	
		/*
//		set을 사용해  랜덤 함수 안쓰고 ver.  리스트에 1부터 10 넣어놓고  
//		 셔플로 섞어주기 위해 List 만들고 set 값을 List에 입력해줌
//		 반복문으로 묶어서 중복체크하고 출력  6번 
		HashSet<Integer> set = new HashSet<Integer>();
		for(int i=0; i<10; i++) {
			set.add(i);
		}  // 1 부터 10까지의 수를 Set 에 저장함 
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.addAll(set);
//		System.out.println(list);  //확인용  
		
		for(int i=0; i<6; i++) {
			if ( ){
				System.out.println(1);
			}else System.out.println(2);
		}
		*/
		
		// list 를 이용하는 경우
		ArrayList<Integer> list = new ArrayList<Integer>();
		int min = 1, max = 10;
//		랜덤값 6개를 일단 뽑고 
//		 중복체크하고  저장
//		출력 
		for(int i=0; i<6; i++ ) {
			int random = (int) (Math.random() * (max - min + 1)) + min;
			
			if (list.contains(random)) {
				i--;
				continue; 
			}else list.add(random);
			
	}
		System.out.println(list);
		
		//set을 이용하는 경우 
		HashSet<Integer> set = new HashSet<Integer>();
//		int min =1,max=10; 다른방법 시도하면서 선언했음 
		
		while(set.size()<6) {
			int r =(int)(Math.random()*(max-min+1)+min);
//		혹은 Random random = new Random();
//			int r = random.nextInt(min,max+1);
			
			set.add(r);
		}
}
	
	
	
}
