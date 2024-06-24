package day19.post;

public class Main {
	/* 회원가입 없이 게시글을 등록/수정/삭제/조회하는 프로그램을 작성하세요.
	 * 1. 기능을 파악
	 *   => 실행 예시
	 * 2. 정보를 관리하기 위한 클래스를 추가(필요하다면)
	 * 2.1 멤버변수를 결정
	 * 2.2 Object클래스에서 상속 받은 오버라이딩할 메소드가 있는지 생각
	 *     => 보통은 @Data을 이용해서 처리하는데, 특별한 작업을 하는 경우 직접 오버라이딩을 해야 함
	 * 2.3 기능 구현상 필요한 인터페이스가 있는지 생각
	 *     예시
	 *     => Collections.sort를 이용하려면 Comparable 인터페이스를 구현
	 *     => ObjectInput/OutputStream을 이용하려면 Serializable 인터페이스를 구현
	 * 2.4 필요한 생성자를 추가
	 * 2.5 있으면 좋을 법한 기능들을 메소드로 추가
	 * 3. 기본 프로그램 구조를 생각하며 틀을 잡음
	 *    => Program 인터페이스를 구현한 구현 클래스를 생성
	 * 4. 구현
	 * 4.1 Program 인터페이스의 추상 메소드를 오버라이딩
	 * 4.2 필요한 작업들을 주석으로 설명을 작성
	 * 4.3 작성한 주석을 토대로 코드를 작성
	 * 5. 테스트
	 * 
	 * 예시
	 * ---------------------
	 * 메뉴
	 * 1. 게시글 등록
	 * 2. 게시글 수정
	 * 3. 게시글 삭제
	 * 4. 게시글 검색
	 * 5. 프로그램 종료
	 * ---------------------
	 * 메뉴 선택 : 1
	 * ---------------------
	 * 제목 : 제목입니다. 공백도 포함합니다.
	 * 내용 : 내용입니다. 공백도 포함합니다.
	 * 작성자 : admin
	 * 비번 : 1234
	 * ---------------------
	 * 1번 게시글이 추가되었습니다.
	 * ---------------------
	 * 메뉴
	 * 1. 게시글 등록
	 * 2. 게시글 수정
	 * 3. 게시글 삭제
	 * 4. 게시글 검색
	 * 5. 프로그램 종료
	 * ---------------------
	 * 메뉴 선택 : 2
	 * ---------------------
	 * 수정할 게시글 번호 : 1
	 * ---------------------
	 * 아이디 : admin
	 * 비번 : 1234
	 * ---------------------
	 * 제목 : 제목입니다(수정)
	 * 내용 : 내용입니다(수정)
	 * ---------------------
	 * 1번 게시글이 수정되었습니다.
	 * ---------------------
	 * 메뉴
	 * 1. 게시글 등록
	 * 2. 게시글 수정
	 * 3. 게시글 삭제
	 * 4. 게시글 검색
	 * 5. 프로그램 종료
	 * ---------------------
	 * 메뉴 선택 : 4
	 * ---------------------
	 * 검색어(전체는 엔터) : 
	 * ---------------------
	 * 검색 결과
	 * 1. 제목입니다(수정)  / admin / 0
	 * ---------------------
	 * 게시글 확인하시겠습니까?(y/n) y
	 * ---------------------
	 * 검색 결과 중 확인할 게시글 번호 선택 : 1
	 * ---------------------
	 * 제목 : 제목입니다(수정)
	 * 작성자 : admin
	 * 내용 : 내용입니다(수정)
	 * 조회수 : 1
	 * ---------------------
	 * 메뉴로 돌아가려면 엔터를 치세요.
	 * ---------------------
	 * 메뉴
	 * 1. 게시글 등록
	 * 2. 게시글 수정
	 * 3. 게시글 삭제
	 * 4. 게시글 검색
	 * 5. 프로그램 종료
	 * ---------------------
	 * 메뉴 선택 : 3
	 * ---------------------
	 * 삭제할 게시글 번호 : 1
	 * ---------------------
	 * 아이디 : admin
	 * 비번 : 1234
	 * ---------------------
	 * 1번 게시글이 삭제되었습니다.
	 * ---------------------
	 * */
	public static void main(String[] args) { //인스턴스
		
		PostManager pm = new PostManager();
		pm.run();

	}
}