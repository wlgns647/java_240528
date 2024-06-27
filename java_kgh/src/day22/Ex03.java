package day22;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Ex03 {

	public static void main(String[] args) {
//		리스트에 숫자들을 저장하고, 저장된 숫자들을 정렬하는 코드를 작성하세요
		List<Integer> list = new ArrayList<Integer>();
		
		
		int min = 1, max = 50;
		int random = (int) (Math.random() * (max - min + 1)) + min;
		list.add(random);
		list.add(random);
		list.add(random);
		list.add(random);
		System.out.println(list); 
		Collection.sort(list);
		System.out.println(list); 
		Collection.reverse(list);
		System.out.println(list); 
		
	}

	

}
