package day15;

import java.util.ArrayList;
import java.util.Collection;

public class ListEx03 {

	public static void main(String[] args) {
//			연락처 클래스를 이용한 List 예제 
//		indexOf, remove, contains 를 확인하는 예제 

		ArrayList<Contact> list = new ArrayList<Contact>();

		Contact c1 = new Contact("홍길동", "010-1234-1233");
		Contact c2 = new Contact("홍길동", "010-1234-1233");

		list.add(c1);
		System.out.println(list);
		list.remove(c2);
		System.out.println(list);

	}

	@Override
	public String toString() {
		return name + " : " + number;
	}

}

class Contact {

	public Contact(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public String name;
	public String number;
	@Override
	public String toString() {
		return "Contact [name=" + name + ", number=" + number + "]";
	}

}