package day06;

import java.util.Scanner;

public class ArrayEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			/*문자열을 최대 5개 저장할 수 있는 배열을 선언 하고 
			 * 문자열을 5개 입력하여 저장 한 후 저장한 문자열을 출력하는 
			 * 예재를 작성하세요
			 */
		Scanner scan = new Scanner(System.in); 
		String[] list  = new String[5];
		for (int i=0; i<list.length; i++) {
			list[i] = scan.next();
		}
		for( String tmp : list) {
			System.out.println(tmp);
		}
	
			
	
	
	}
	
	

}
