package day15;

import java.util.ArrayList;
import java.util.HashSet;

public class SetEx01 {

	public static void main(String[] args) {
		// Set 기본예제 
		HashSet<Integer> set = new HashSet<Integer>();

//		add(객체): 객체를 set에 추가 중복이면 false 를 리턴
		System.out.println(set.add(1));
		System.out.println(set.add(1));
		System.out.println(set.add(100));
		System.out.println(set.add(1000));
		
//		remove(객체): 객체를 set 에서 제거 , 없으면 false 를 리턴
		System.out.println(set.remove(20));
		System.out.println(set.remove(100));

		
//		contains(객체) set 에 객체가 있으면 true 없으면 false 를 리턴 
		System.out.println(set.remove(11));
		System.out.println(set.remove(1));
//		size() 저장된 개수 
		System.out.println(set.size());
		System.out.println(set);
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
//		addAll(컬렉션) 컬렉션에 있는 원소들을 추가. list와 set 에 다 있음
		list.addAll(set);
		list.add(8);
		list.add(9);
		list.add(10);
		
//		Cillections.shuffle(리스트) 리스트를 섞어줌 
		System.out.println(list);
		
	}

}
