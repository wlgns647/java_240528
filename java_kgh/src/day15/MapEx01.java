package day15;

import java.util.HashMap;

public class MapEx01 {
				// 기본예제 
	public static void main(String[] args) {
			HashMap<String, String> map = new HashMap<String, String>();
//			put (key, value)  key와 value 를 추가하고 이미 key가 등록되어있으면 새 value을 저장하고 기존 value 을 반환 
			map.put("admin", "admin123");
			System.out.println(map.put("admin","admin12345" ));
			System.out.println(map);
			
			
//			주어진 key와 일치하는 키가 있으면 삭제하고 value를 반환 
			map.remove("admin");
			System.out.println(map);

			map.put("abc123","def123");
			map.put("abcda123","def123");
			System.out.println(map);
//			containsKey(key) 주어진 키와 일치하는 키가 있는지 없는지 반환
			System.out.println(map.containsKey("abc123"));			
			System.out.println(map.containsKey("abcda123"));			
	}

}
