package day22;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex02 {

	

	public static void main(String[] args) {

//		콘솔에서 정수로 이루어진 문자열을 입력받아 각 정수들의 합을 구하는 코드를 작성하세요
//		예 
//		1 23 45 3 9 7 5 정해진 갯수 없음 
//		103
		Scanner scan = new Scanner(System.in);
		System.out.println("입력: ");		
		String str = scan.nextLine();
		String[] nums = str.split(" ");
		int sum = 0;
		for(String num : nums) {
			int number = Integer.parseInt(num);
			sum += number;
		}
		
		System.out.println("합: "+ sum);
		
		// 위에서 작성한 코드 중 일부를 메소드로 만든다고 했을 때 필요하다고 생각하는 코드를 메소드로 만들기 
		
		
			
		
	}
	public static int convertAndSum(String str) {
		String[] nums = str.split(" ");
		int sum = 0;
		return sum;
				
	}
}
