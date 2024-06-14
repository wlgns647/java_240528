package home;

import java.util.Arrays;
import java.util.Scanner;

public class Hi {

	public static void main(String[] args) {
		
				int num1 =10;
				int num2 =20;
				
				int sum =add( num1,num2);    //add 함수 호출  결과값 sum으로 반환 
				System.out.println(num1 + " + " + num2 + " = " + sum + "입니다");
				
				}
				
				public static int add(int n1, int n2) {
					int resurt =n1 + n2 ;
					return resurt; //결과값 반환 
	}

}
