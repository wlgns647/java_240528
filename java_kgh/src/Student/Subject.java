package Student;

import java.util.Objects;

public class Subject {

		private String name;  	//과목
		private int grade; 		// 학년
		private int semester; 	//학기
		private int	midterm;  	//중간고사
		private int finals; 	//기말고사
		private int perfomace; 	//수행평가
		
		
		@Override
		public int hashCode() {
			return Objects.hash(grade, name, semester);
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Subject other = (Subject) obj;
			return grade == other.grade && Objects.equals(name, other.name) && semester == other.semester;
		}
	
		
		
}
