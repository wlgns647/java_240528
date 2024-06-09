package home;

public class Student {   //  student 클레스 
	int studentID;
	String studentName; 
	int grade;
	String address;
	
	public String getStudentName( ) {
		return studentName;
		}
	

	public static void main(String[] args) {  //메인 함수 선언 
		Student studentKgh =new Student(); //student클래스 생성 
		studentKgh.studentName = "강지훈";
		
		System.out.println(studentKgh.studentName);
		System.out.println(studentKgh.getStudentName());
	}



		
		
		
		
		
		
		
		
	}
}
