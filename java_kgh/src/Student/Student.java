package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import lombok.Data;

@Data
public class Student {

	 int grade, num,classNum;
	
	private String name;
	
	private List<Subject> subjectList = new ArrayList<Subject>();

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return classNum == other.classNum && Objects.equals(name, other.name) && num == other.num;
	}

	@Override
	public int hashCode() {
		return Objects.hash(classNum, name, num);
	}
	 public Student(int grade, int classNum, int num) {
	        this.grade = grade;
	        this.classNum = classNum;
	        this.num = num;
	    }
	// 같은 학교에 특정 년도에 같은 학년,반, 번호 를 가진 학생은 1명이기때문에 
	// equals 를 오버라이딩 함 
}
