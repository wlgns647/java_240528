package day12;

import java.util.Arrays;

public class ObjectEx01 {

	public static void main(String[] args) { 
		// toString 확인예제
		Test3 t1 = new Test3();
		System.out.println(t1);
		Test3 [] list = new Test3[3];
		list[0] = new Test3(); 
		list[1] = new Test3(); 
		list[2] = new Test3(); 
		System.out.println(Arrays.toString(list));
	}
	

//헤쉬코드와 이퀄스 확인예제 
		Student std1 = new Student(1, 1, 1, "강지훈");
		Student std2 = new Student(1, 1, 1, "강지훈");
		Student std3 = new Student(1, 1, 1, "강지훈");
		Student std4 = new Student(1, 1, 1, "강지훈");
	
		// ==를 이용하여비교 
		System.out.print("std1 == std2 : " (std1==std2));
		System.out.print("std1 == std2 : " (std1==std3));
		System.out.print("std1 == std2 : " (std1==std4));
		
		
		// equals 를 이용하여 비교 
		System.out.print("std1 == std2 : " (std1.equals(std2));
		System.out.print("std1 == std2 : " (std1.equals(std3));
		System.out.print("std1 == std2 : " (std1.equals(std4));
	
}
	
	class Student implements {
		int grade, classNum,num;
		public Student(int grade, int classNum, int num, String name) {
			super();
			this.grade = grade;
			this.classNum = classNum;
			this.num = num;
			this.name = name;
		}
		String name;
		
	}
	
	


class Test3{
	int num1, num2;
	
	@Override
	public String toString() {
		return "Test3 [num1=" + num1 + ", num2=" + num2 + "]";
	}
}







public boolean equals(object obj) {
	//주소가 같은경우 같은 객체를 공유
	if (this ==obj)
		return true;
	
	
	
	
}