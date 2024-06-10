package day09access;

public class AccessModifierEx01 {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.grade = 10;  // 접근제어자가 public 이어서 다른 클래스에서 사용 가능
		std1.classNum =1; //접근제어자가 protected 이어서 같은 패키지에 있는 다른 클래스에서 사용가능 
		std1.num =1; // 접근제어가 default 이여서 같은 패키지에 있는 다른 클래스에서 사용가능 
	//	std1.name = "강지훈"; //접근제어자가 private 이여서 다른 클래스에서 시용이 불가능
	}

}

