package day04;

public class WhileEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* a부터 z 까지 출력하는 코드 작성 
		 * 반복 a 부터 z 까지  1씩 증가
		 * 규칙  문자 char 변수 선언해서 1씩 증가하면서 출력 
		 * a값부터 z 값까지 도달후 끝
		 * char ch= 97; 이게 a 값
		 *  26 알파벳 
		 */
		
		// 이거 int i 없에면 깔끔 
		
		int i =0;
		char ch = 96;
		while( i<=24) {
			i+=1;
			ch+=1;
			System.out.println(ch);
		}
		System.out.println("다른방식" );
//혹은 
		while (i<25) {
			System.out.println((char)('a'+i));
		}
		

		
		
	
		
	}

}
