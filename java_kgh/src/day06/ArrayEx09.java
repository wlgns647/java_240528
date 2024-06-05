package day06;
import java.util.Scanner;

public class ArrayEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

// 문자열을 입력받아 입력받은 문자열이 있는지 없는지 알려주는 코드를 작성

		/*
		 * 1. 입력받은 문자열과 비교할 초기 문자열을 선언한다
		 *  2. 스케너를 이용해 문자열을 입력받는다 반복 
		 *  3. 입력받은 문자열을 초기 문자열들과
		 * 비교한다 문자열이 겹치면 빠져나오고 "문자열이 있습니다 " 
		 * 겹치지 않으면 한바뀌 돌면 빠져나온다
		 * 
		 * 
		 * 반복 종료 후 없음
		 * 
		 * 수정1. 같은 문자열 치면 빠져나옴 
		 * 다른 문자열을 쳐도 있다고 나오고 빠져나옴
		 * 
		 */

		String[] list = { "dog", "cat", "java", "cup", "computer" };

		System.out.println("문자열을 입력하세요 ");
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
// 넥스트랑 넥스트 라인 차이 있음 
		
		boolean result = false;
		for (String tmp : list) {
			if (input.equals(tmp)) {
				// 문자열과 다르면 다음단계로 넘어감? 
				 result = true;
				break;
				}
			} if (result){
				System.out.println(" 같습니다 ");
			}else {
				System.out.println(" 다릅니다 ");

		}

	}
}
