package day15;

import java.util.ArrayList;

public class LIstEx01 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		//add (객체) 이용해 객체를 추가 . 컬랙션 인터페이스에서 구현 
		//add(번지,객체_: 번지에 객체를 추가 리스트인터페이스에서 구현
		list.add("안녕하세요");
		list.add(0,"Hi");
		System.out.println(list);
		
//		remove (객체): 리스트에서 주어진 객체와 일치하는 객체를 제거,
//		컬랙션 인터페이스에서 구현
//		remove (번지): 리스트에서 번지 위치에 있는 객체를 삭제하고 삭제된
//		객체를 반환 리스트 인터페이스 
			System.out.println(list.remove("H"));
			// H와 일치하는 객체가 없어서 삭제 실패
			System.out.println(list.remove("Hi"));
			// 일치하는 객체가 있어서 삭제성공
			list.add("홍길동");
			//get(번지) 번지 위치에 있는 객체를 가져옴 . 리스트 인터페이스
			System.out.println(list.get(0));
			System.out.println(list);
//			clear() 라수투룰 바윰 콜랙숀 인터페이스
//			list.clear();
			System.out.println(list);
			
//			contains(객체) 리스트에 객체가 있는지 없는지를 알려줌. 컬랙션
			
			System.out.println("리스트에 Hi가 있습니까 ?" + list.contains("Hi"));
			System.out.println("리스트에 홍길동이 있습니까 ?" + list.contains("홍길동"));
			System.out.println("리스트에 홍길동이 몇번지에 있습니까?"+ list.indexOf("홍길동"));
			
			
			
			
			
	}

}
