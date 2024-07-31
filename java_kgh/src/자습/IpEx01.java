package 자습;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class IpEx01 {
	public static void main(String[] args) {
	try {
		InetAddress address = InetAddress.getByName("localhost");
		// InetAddress.getByName(String host) 메서드는 호스트 이름을 반환함
		System.out.println(address); 
		// 반환한  ip 주소를 출력 
		 address = InetAddress.getByName("www.naver.com");
		// InetAddress.getByName(String host) 메서드는 네이버 주소를 반환함 
		System.out.println(address); 
		// 반환한  ip 주소를 출력 
		
		InetAddress [] list = InetAddress.getAllByName("www.naver.com");
		// 주어진 호스트이름에 대한 모든 ip 주소를 반환함
		System.out.println(Arrays.toString(list)); 
		// Arrays 배열의 매서드 제공 toString 배열 내용을 문자열로 반환 
		
	} catch (UnknownHostException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
// InetAddress 는 ip 주소를 표현하는 클래스

// 예외가 발생할 수 있기 때문에 마우스 호버 후 try catch 를 만들어 줌 