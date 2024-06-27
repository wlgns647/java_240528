package day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Ex01 {

	public static void main(String[] args) {
// 콘솔에서 한 문장(영어)을 입력하고 한 문장에 몇 개의 단어로 구성되어 있는지 확인하는 코드를 작성하세요
//		Hi My name is Hong
		
		
		Scanner scan = new Scanner(" Hi My name is Hong\n ");
		System.out.print("영어 문장 입력: ");		
		String str = scan.nextLine();
		System.out.println(str);		
		
		String[] strnum = str.split(" ");
		System.out.println("단어의 개수: "+ strnum.length);
		
		StringTokenizer st = new StringTokenizer(str," "); 
		int count = 0;
		while(st.hasMoreTokens()) {
			 st.nextToken();
			 count++;
		}
		System.out.println("단어개수: "+ count);
		
		
		
		
		
		
	}

}
