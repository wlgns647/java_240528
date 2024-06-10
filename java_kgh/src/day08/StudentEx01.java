package day08;

import java.util.Arrays;
import java.util.Scanner;

public class StudentEx01 {
//	 학생 성적을 관리하기 위한 프로그렘 국어 영어 수학 
	public static void main(String[] args) {
//	다음 매뉴가 출력되도록 코드를 작성하세요
//		메뉴
//		1. 학생 등록
//		2. 성적 수정
//		3. 성적 확인
//		4. 종료
//		매뉴 선택 : 
//			2. 메뉴를 출력하고 메뉴를 콘솔창에서 입력받는 코드를 작성하세요/
//			단, 입력받은 메뉴가 4가 아니면 반복해야함 
//		3. 	입력한 메뉴가 1 이면 학생 등록입니다 2이면성적수정입니다  3이면 성적확인입니다
//			4 이면 프로그렘 종료합니다
//		4.프로그렘 관리를 위한 Student 클래스를 추가하세요
//		학년 반 번호 이름 국어 영어 수학
//		맴버변수는 private으로 하고 getter / setter 를 추가
//		기본 생성자와 학년 반 번호 이름을 이용한 생성자를 추가
//		국어 영어 수학 성적 변경하는 기능을 추가 
//		5. 학생 등록 기능을 구현하세요 
//		학년 반 번호 이름을 입력받아 학생을 추가하세요 
//		일단 배열 먼저 만들고 

		Scanner scan = new Scanner(System.in);
		int menu;
		Student[] list = new Student[10];
		int studentCount = 0;// 저장된 학생 수
		do {
			printMenu();
			menu = scan.nextInt();
			// runMenu(menu);
			switch (menu) {
			case 1:
				if (studentCount == list.length) {
					System.out.println("다 찼습니다.");
				}
				System.out.println("학년: ");
				int grade = scan.nextInt();
				System.out.println("반: ");
				int classNum = scan.nextInt();
				System.out.println("번호: ");
				int num = scan.nextInt();
				System.out.println("이름: ");
				String name = scan.next();
				// 학년 반 번호 이름을 입력받고 입력받은 정보를 이용하여 학생 객체를 생성하고
//				배열이 꽉 차지 않으면 생성한 학생객체를 배열에 저장하고 
//				생성한 학생객체를 배열에 저징히거 저장된 학생수를 1증가 
//				다른데 반복문 만들고 여기서 호출 ? 

				list[studentCount] = new Student(grade, classNum, num, name);
				studentCount++;
				for (Student tmp : list) {
					if (tmp != null) {
						System.out.println(tmp.getName());
					}
				}

				break;
			case 2:
				System.out.println("성적수정입니다");
//				학년 반 번호를 입력받음 
				
//				입력받은 학년 반 번호를 이용하여 일치하는 학생이 있는지 확인 
//				없다면 일치하는 학생이 없다고 출력하고 종료
//				있다면 국영수 성적을 입력받아 학생 성적을 수정 

				break;
			case 3:
				System.out.println("성적확인입니다");
				// 학년 반 번호를 입력하고
				// 없다면 일치하는 학생이 없다고 출력
				// 있다면 해당하는 학생의 성적을 출력
				break;
			case 4:
				System.out.println("프로그렘을 종료합니다");
				break;
			default:
				System.out.println("잘못된 메뉴입니다");
				break;
			}

		} while (menu != 4);

		// 학생등록

	}

//		기능 : 메뉴를 출력하는 메소드
	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 학생 등록");
		System.out.println("2. 성적 수정");
		System.out.println("3. 성적 확인");
		System.out.println("4. 종료 ");
		System.out.print("매뉴 선택:");

	}

	public static void runMenu(int menu) {

	}

}

class Student {
	private int grade, classNum, num;
	private String name;
	private int kor, eng, math;

	// gettert , setters
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassNum() {
		return classNum;
	}

	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public Student(int grade, int classNum, int num, String name) {

		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
	}

	public Student() {
//		 기능: 국어,영어,수학 성적이 주어지면 변경하는 메소드 
//		@param kor 국어성적 	 
//		@param eng 영어성적 

	public void updateScore(int kor, int eng, int math) {

		this.kor = kor;
		this.eng = eng;
		this.meth = math;
	}
	
	
	// 학년 반 번호를 입력받음
//	입력받은 학년 반 번호를 이용하여 일치하는 학생이 있는지 확인  하는 메소드 이걸로 2,3번 선택시 불러올 예정임 
//   메인에 선언되어 있는 배열명 	Student[] list //class Student 에 있는 
	public void StudentInfo(int grade, int classNum, int num, String name) {
	Scanner scan = new Scanner(System.in);
	// 학년 반 번호 이름 하나씩 받아서 하나씩 비교하고 없으면 다시 
	
		System.out.println("학년을 입력하세요: ");
		int num01;
	
		( num01 = scan.nextInt())
		
		int grade = scan.nextInt();
		System.out.println("반: ");
		int classNum = scan.nextInt();
		System.out.println("번호: ");
		int num = scan.nextInt();
		System.out.println("이름: ");
		String name = scan.next();
	
	
}
}