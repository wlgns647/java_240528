package Student;

public class Main {

	public static void main(String[] args) {
			//학생의 성적 관리 프로그램을 만듬 
		
		// 메인으로 옯길 주석입니다 . 
//6/27 22일차 오후 강의 영상:복습 27분



		// 0. 서브젝트 클래스를 만듭니다. 
		// 1. 서브젝트 클래스에  과목명,학년,학기,중간,기말,수행평가 객체를 생성합니다 
		// 2. 과목명,학년,학기를 미리 이퀄스로 오버라이딩 했습니다 
		// 2-1.	 과목명과 학년과 학기가 모두 같은 성적이 있을 수 없기떄문에 처리했습니다
		// 3. Student 클래스를 만듭니다
		// 4. 여기서 학생 반 번호 이름 을 의미하는 객체를 만들없습니다
		// 5. 긱 과목의 점수를  List로 만들었습니다. 
		// 6. 학년 반 번호 를 equals 로 오버라이딩 합니다 
		// 7. 메인에 StudentManager 호출하고 run 기능을 구현합니다.
		// 8. StudentManager 클래스에서  student List 를 만듭니다 
		// 9. StudentManager 클래스는 implements 로 인해 Program 을 구현해야 합니다 
		// 10. Program 을 오버라이드 했습니다
		// 11. 프린트와 Student list를 만들었습니다
		// 12. run 메소드를 작성합니다 
		// 12-1. int menu 를 만듭니다
		//       do while 뮨을 통해 프린트 메뉴에서 입력받으면 에외처리하고 런매뉴를 동작시킵니다 
		// 13. nextInt 메소드를 만듭니다
		// 13-1 예외처리 해주고 오류시 오입력값을 버퍼에서 지우고 int의 가장 작은수를 리턴합니다.
		// 13-2 nextInt 는 스켄을 하는 기능이기때문에 run 메소드의 scan.next 대신 호출해줍니다
		// 14. Printmenu를 구현합니다 
		StudentManager sm = new StudentManager();
		sm.run();
		
	}

}
