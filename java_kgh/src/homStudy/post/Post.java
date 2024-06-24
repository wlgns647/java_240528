package homStudy.post;

import java.util.Objects;

import lombok.Data;

// 필요할것같은 기능들이나 클래스 객체 등을 미리 만들어 놓고 시작하겠습니다.
@Data
public class Post {
	// 제목,내용,작성자,비번,조회수
	private String title;
	private String contents;
	private String id;
	private String pw;
	private int view;
	// 게시글 번호
	private int num;

	// public 이 붙지 않았기 때문에 인스턴스 필드입니다.

	// 스테틱이 붙은 클래스 필드를 만들겠습니다.

	// 게시글 번호를 생성할 때 증가시키면서 활용
	private static int count = 0;

	// using fiels 를 이용해서 생성자를 만들었습니다.
	public Post(String title, String contents, String id, String pw) {
		this.title = title;
		this.contents = contents;
		this.id = id;
		this.pw = pw;
		// 이 생성자를 이용할 때만 게시글 번호를 1 증가하도록 하기위해 작성했습니다.
		this.num = ++count;
	}

	// 번호만 있는 생성자 만들겠습니다. 수정,삭제할때 번호를 선택하면 리스트에 있는 게시글을 쉽게 찾기 위해서
	// using fiels 를 이용해서 생성자를 만들었습니다.
	public Post(int num) {
		this.num = num;
	}

	// 번호가 같아야 같은 객체로 판별 할것이기 때문에 num 에 대한hashCode and equals 생성기를 통해 만들어줍니다.
	// 이를통해 같은 객체인지 확인할 수 있습니다.
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		return num == other.num;
	}

	@Override
	public int hashCode() {
		return Objects.hash(num);
	}


	// 조회수와 검색결과를 출력할때 쓰기 위해 toString 생성기를 사용했습니다.
	@Override
	public String toString() {
		return num + ". " + title + " / " + id + "/"+view; // 모양 수정
	}

	// 제목과 내용을 수정하는 메소드를 만들겠습니다.
	public void update(String title, String contents) {
		this.title = title;
		this.contents = contents;
	}
	// 게시글 상세조회 전에 조회수 1 증가하고 상세조회하는 메소드
	public void print() {
		System.out.println("제목: "+ title);
		System.out.println("작성자: "+ id);
		System.out.println("내용: "+ contents);
		System.out.println("조회수: "+ ++view);
		
	}
	
	
}
