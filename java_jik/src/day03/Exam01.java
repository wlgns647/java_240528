package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* day03 패키지를 생성하세요.
		 * day03 패키지에 Exam01 클래스를 생성하세요.
		 * 성적을 입력받아 입력받은 성적이 60점이상이면 Pass, 아니면 Fail이 출력되도록 코드를 작성하세요.
		 * 예시1
		 * 성적 입력 : 65
		 * 65점은 Pass
		 * 예시2
		 * 성적 입력 : 45
		 * 45점은 Fail
		 * */
		
		
//		1 반복문  정수를 입력받은 후 값이  60점 이상인지 아닌지 비교 
//		2. 실행  비교한 값이 60점 이하면 fail 이상이면 pass 출력 
		
/*
 * 		 1. 스케너 달고  
 *		2.	60이랑 비교할 예정이여서 변수선언 할 필요 없음 
 *		3.정수 입력받아야 함 
 *		4. 정수 입력받고  비교해야함 
 */
		
		
	
		Scanner scan = new Scanner(System.in);
		System.out.println(" 정수를 입력해 주세요: ");
		int input = scan.nextInt();
		if (input >= 60) { 
			System.out.println("pass");
		} else
		{ System.out.println("fail");
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
		
		
		
		/*
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성적 입력 : ");
		int score = scan.nextInt();
		//성적이 60점 이상이면 Pass, 아니면 Fail을 문자열 변수 str에 저장
		String str = (score >= 60) ? "Pass" : "Fail";
		System.out.println( score + "점은 " + str);
		
		*/
	}

}
