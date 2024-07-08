package day25;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>=1 && num <= 10) { 
			for(int i=1; i<=num; i++) {
			System.out.println(i+" = 1과 10사이의 숫자 ");
			}
		}else {System.out.println("1과 10사이의 숫자가 아님"); }
	}

}
