package day09;

public class ClassEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student1 std1 = new Student1(); // 학생 객체를 생성
		Student1 std2 = new Student1(1, 1, 1, "홍길동"); // 학생 객체를 생성
		std2.print();
		std1.name="임꺽정 ";
		std1.print();
//		멤버변수와 메서드는 객체명. 맴버변수 또는 객체명 . 메소드명(매개변수들)을 이용하여 호출할 수 잌ㅆ음 
//		단, 접근제어자에 따라 제한될 수 있다 
	}

}

// 고등학생 성적을 관리하기 위해 학생 클래스를 추상화 하려고 함
// 	학생 성적은 국어 영어 수학 성적만 관리 
//	학생 클래스 이름은 Student1 이고, 이때 필요한 맴버 변수를 선언해보세요.
//  
class Student1 {
	// 메서드
	// 맴버변수(필드)

	int meth, kor, eng;
	int grade, classNum, num;
	String name;

	// 기본 생성자
	public Student1() {
	}
	// 생성자 오버로딩 : 학년 반 번호 이름을 이용한 생성자

	public Student1(int g, int c, int n, String name1) {

		grade = g;
		classNum = c;
		num = n;
		name = name1;

	}

	public void Studuent1() {
	}

	public void print() {
		System.out.println(grade + "학년" + classNum + "반" + num + "번" + name);
	}
}
