package day09;

public class StaticEx01 {

	public static void main(String[] args) {
		Student4 std1 = new Student4(1, 1, 2, "홍길동");
		Student4 std2 = new Student4(1, 1, 2, "임꺽정");
//		 학생 1과 학생의 정보를 출력하는 코드 작성
		std1.print();
		std2.print();
//		 학생 1과 학생 2의 고등학교를 출력하는 코드를 작성 
		Student4.printSchoolName();
		std1.printSchoolName();	
		std2.printSchoolName();	
		
		
		
		
	}

	
}

class Student4 {

	public int grade, classNum, num;
	public String name;

	public static String schoolName = "kh고등학교";

	public void print() {
		System.out.println(grade + "학년" + classNum + "반" + num + "번" + name);
	}

	public static void printSchoolName() {
		System.out.println(schoolName);
	}

	public Student4(int grade, int classNum, int num, String name) {
		super();
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
	}
	public static void test1() { // 클래스 메소드 
		// 클레스 메소드에서 클래스 변수를 호출할 수 있다 
		// printSchoolName
		System.out.println("학교명: "+ schoolName);
		//클래스 메소드에서 객체 변수를 호출할수 없다 
		//System.out.println("학년: "+ grade); // 겍체를 생성한 후 호출 해야한다
		Student4 std = new Student4(1, 1, 1, "둘리");
		System.out.println("학년: "+ std.grade);
		//클래스 메소드에서 클래스 매소드를 호출할 수 있다 
		printSchoolName();
		//클래스 메소드에서 객체 메소드를 호출할수 없다
		//print():  객체 생성후 호출해야함
		std.print();
	}
	public static void test2() { //객체 메소드 
		// printSchoolName
		//객체 메소드에서 클래스 변수를 호출할수 없다 
		System.out.println("학교명: "+ schoolName);
		// 객체 메소드에서 클래스 변수를 호출할 수 있다 
		System.out.println("학년: "+ grade);
		// 객체 메소드에서 클래스 메소드를 호출할 수 있다 
		printSchoolName();
		// 객체 메소드에서 객체 메소드를 호출할 수 있다 
		print();
		
		
	}
	
	
	
}