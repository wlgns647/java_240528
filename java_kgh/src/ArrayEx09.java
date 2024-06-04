import java.util.Scanner;

public class ArrayEx09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] list = {"dog","cat","java","cup","computer"};
		// 문자열을 입력받아 입력받은 문자열이 있는지 없는지 알려주는 코드를 작성
		Scanner scan = new Scanner(System.in); 
		System.out.println("문자열을 입력하세요 "); 
		String input =  scan.nextLine();
		
		for( String star: list) {
			if (star.length() != input.length()) {
				continue;
			}
		} 
			
		
	} 
}
