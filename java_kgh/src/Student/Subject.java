package Student;

import java.util.Objects;

import lombok.Data;
@Data
public class Subject {

// 과목명, 학년 , 학기, 중간, 기말, 수행평가
	private String name;
	private int grade;
	private int semester;
	private int midterm;
	private int finals;
	private int perfomace;
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject other = (Subject) obj;
		return grade == other.grade && midterm == other.midterm;
	}
	@Override
	public int hashCode() {
		return Objects.hash(grade, midterm);
	}
	
	// 한 학생에게 같은 과목명,학년 , 학기성적이 여러개 있을수 없기 때문에
	//	equals 를 과목명, 학년 , 학기를 이용하여 오버라이딩 
		
	
	
	}


