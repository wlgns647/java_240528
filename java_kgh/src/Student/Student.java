package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.Data;

@Data
public class student {
	
	// 학년 반 번호 이름 객체를 만들겠습니다
	private int grade, cassNum, num;
	private String name; 
	
	// 각 과목의 점수는 List로 만들겠습니다
	// List<Subject> 는 Subject 의 객체들을 관리하는 List 입니다 
	// 각 과목의 점수를 가지고 있는 List 를 만듭니다 
	// 같은 학교에 특정 년도에 같은 학년,반, 번호 를 가진 학생은 1명이기 때문에 equals 오버라이딩 합니다.
		
	private List<Subject> subjectList = new ArrayList<Subject>();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		student other = (student) obj;
		return cassNum == other.cassNum && grade == other.grade && num == other.num;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cassNum, grade, num);
	}

	
}
