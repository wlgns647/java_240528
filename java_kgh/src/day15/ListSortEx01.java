package day15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class ListSortEx01 {

	public static void main(String[] args) {
//		리스트를 이용하여 정렬하는 방법
		List<String> list = new ArrayList<String>();
		
		list.add("강지훈");
		list.add("강지숙");
		list.add("강지운");
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
//		Collections.sort( 컬랙션,Comparator객체)		
//		-Cimparator 객체 : Comparator 인터페이스를 구현한 구현 클래스의 객체가 필요
//		그런데 아래 코드에서 String 클래스는 라이브러리에서 제공하는 클래스이기 때문에 우리가 수정할수없음
//		그래서 익명클래스(이름이 없는 1회용 클래스)를 만들어서 해당 클래스의 객체를 이용
//		Comarator 인터페이스의 compare 추상 메소드를 오버라이딩 해야하고 오버라이딩 한 코드에 따라 정렬방식이 바뀜
		
		Collections.sort(list,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
			
				return -o1.compareTo(o2);
			}
		});
		System.out.println(list);
		
		List<Student> stds = new  ArrayList<Student>();
		stds.add(new Student("2024160002","강지원"));
		stds.add(new Student("2024160001","강지훈"));
		stds.add(new Student("2024164002","강지숙"));
		
		System.out.println(stds);
		
		Collections.sort(stds,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.number.compareTo(o2.number);
			}
		});
			System.out.println(stds);
	}
}

class Student{
	public String number; // 학번
	public String name; // 이름  
	public Student(String number, String name) {
		this.number = number;
		this.name = name;
	}
	@Override
	public String toString() {
		return "학번: " + number + "- 이름 : " +name ;
	}
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(number, other.number);
	}
	
	
}






