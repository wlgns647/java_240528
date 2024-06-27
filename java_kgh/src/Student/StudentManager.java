package Student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import program.Program;

public class StudentManager implements Program {
	// 학생성적 관리를 위한 리스트
	private List<Student> list = new ArrayList<Student>();
	Scanner scan = new Scanner(System.in);
	// 과목관리를 위한 리스트
	private List<Subject> subjects = new ArrayList<Subject>();

	@Override
	public void printMenu() {
		System.out.println("1. 학생 관리");
		System.out.println("2. 과목 관리");
		System.out.println("3. 종료");
		System.out.print("메뉴 선택: ");
	}

	@Override
	public void run() {

		int menu;

		do {
			printMenu();

			menu = nextInt();

			try {
				runMenu(menu);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (menu != 3);
	}

//	 콘솔에서 정수를 입력받아 반환하는 메소드로 잘못입력하면(문자열) 정수의 가장 작은수를 반환
//	 @return 입력한 정수 또는 정수의 가장 작은수 
	public int nextInt() {
		try {
			return scan.nextInt();
		} catch (InputMismatchException e) {
			scan.nextLine(); // 잘못 입력한 값을 입력버퍼에 비워줌
			return Integer.MIN_VALUE; // int 의 가장 작은수를 리턴
		}
	}

	@Override
	public void runMenu(int menu) throws Exception {

		switch (menu) {
		case 1:
			student();
			break;
		case 2:
			subject();
			break;
		case 3:
			exit();
			break;
		default:
		}

	}

	private void student() {
		int menu;
		do {
			printStudentMenu();
			menu = nextInt();
			runStudentMenu(menu);
		} while (menu != 5);
	}

	private void printStudentMenu() {
		System.out.println("학생관리매뉴");
		System.out.println("1. 학생추가");
		System.out.println("2. 학생수정");
		System.out.println("3. 학생삭제");
		System.out.println("4. 학생조회");
		System.out.println("5. 이전으로");
		System.out.print("매뉴선택: ");

	}

	private void runStudentMenu(int menu) {
		switch (menu) {
		case 1:
			studentInsert();
			break;
		case 2:
			studentUpdate();
			break;
		case 3:
			studentDelete();
			break;
		case 4:
			studentSearch();
			break;
		case 5:
			prev();
			break;
		default:
		}
	}

	private void studentInsert() {
		// 학생을 추가하는 기능을 구현하세요

		System.out.println("추가할 학생 정보 입력");
		
		if (list.contains(inputStudent())) {
			System.out.println("이미 등록된 학생입니다.");
		} else {
			// 리스트에 추가
			list.add(inputStudent());
			System.out.println("학생이 추가되었습니다.");
		}

	}

	public Student inputStudent() {
//		학년 반 번호를 입력받아 학생 객체를 만들어서 반환하는 메소드
//		@return 만들어진 학생객체
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("반 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 : ");
		int num = scan.nextInt();
		return new Student(grade, classNum, num);

	}

//	학년 반 번호 이름을 입력받아 학생객체를 만들어서 반환하는 메소드
//	@return 학년 반 번호 이름이 있는 만들어진학생객체
	public Student inputStudent1() {
		Student student = inputStudent();
		System.out.print("이름 : ");
		String name = scan.next();
		return student;

	}

	private void studentUpdate() {

	}

	private void studentDelete() {
		System.out.println("삭제할 학생의 정보를 입력하세요.");
		Student studentToDelete = inputStudent(); // 학생 정보 입력받기

		boolean removed = list.removeIf(s -> s.getGrade() == studentToDelete.getGrade()
				&& s.getClassNum() == studentToDelete.getClassNum() && s.getNum() == studentToDelete.getNum());

		if (removed) {
			System.out.println("학생이 삭제되었습니다.");
		} else {
			System.out.println("해당 조건을 만족하는 학생을 찾을 수 없습니다.");
		}

	}

	private void studentSearch() {
			// 학년 반 번호를 입력 후 객체를 생성
	    	// 생성된 객체와 일치하는 객체를 가져옴
			
			//	번지가 0보다 작으면 객체에 null을 저장 
			// 가져온 객체가 NULL이 아니면 학생정보를 출력
			
			// null 이면 안내문구 출력 후 종료 
		   System.out.println("찾는 학생의 정보를 입력하세요.");

		    // 학생 정보 입력받기
		    Student studentToSearch = inputStudent();
		    
		    // 입력받은 학생 정보로 리스트에서 검색
		    boolean found = false;
		    for (Student student : list) {
		        if (student.getGrade() == studentToSearch.getGrade()
		                && student.getClassNum() == studentToSearch.getClassNum()
		                && student.getNum() == studentToSearch.getNum()) {
		            // 학생 정보 출력
		            System.out.println("찾는 학생 정보:");
		            System.out.println("이름: " + student.getName());
		            System.out.println("학년: " + student.getGrade());
		            System.out.println("반: " + student.getClassNum());
		            System.out.println("번호: " + student.getNum());
		            found = true;
		            break;
		        }
		    }

		    // 리스트를 모두 검색했는데도 해당 학생을 찾지 못한 경우
		    if (!found) {
		        System.out.println("해당 조건을 만족하는 학생을 찾을 수 없습니다.");
		    }
	}

	public void print() {
	
		System.out.println("찾는 학생 정보:");
		System.out.println("이름: " + getName());
		System.out.println("학년: " + getGrade());
		System.out.println("반: " + getClassNum);
		System.out.println("번호: " + student.getNum());
		
		
	}
	
	
	
	
	private String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	private void prev() {
		// TODO Auto-generated method stub

	}

	private void subject() {

	}

	private void exit() {

	}
}
