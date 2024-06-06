package day02;

public class AssignmentOperatorEx01 {

	public static void main(String[] args) {
		//복합 대입 연산자 예제
		int num1 = 10, num2 = 20;
		
		num1 = num1 + num2;
		
		System.out.println(num1);
		
		int num3 = 10, num4 = 20;
		
		num3 += num4;//복합대입연산자
		
		System.out.println(num3);
		// 문자열을 비교함

		String str1 = "strong";
		String str2 = "strong";

		System.out.println(str1.equals(str2)); //true
		// str1 과 str2는 주소가 달라도 문자열의 내용이 같기때문에 true 출력


	}

}
