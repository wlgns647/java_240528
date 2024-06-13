package day12;

import java.util.regex.Pattern;

public class RegexEx01 {

	public static void main(String[] args) {

//		영문자와 숫자 5~8자
//		=> ^\w{5,8}$
//		영문자와 숫자, 특수문자(!@#) 5~8wk 
//		=>
		
//		http:// 또는 https://
//		=>		^(http://|https://)
//		=> 		(http://|https://)
//		=>
//		=>
		
		String regex1 = "^\\w{5,8}$";
		String str1 = "abc123";
		System.out.println(str1+ "은 정규 표현식"+ regex1+"에 맞습니까?"+ Pattern.matches(regex1,str1));
		
		String str2 = "abc123!";
		System.out.println(str1+ "은 정규 표현식"+ regex1+"에 맞습니까?"+ Pattern.matches(regex1,str2));
		
		String str2 = "[ ]";
		System.out.println(str1+ "은 정규 표현식"+ regex1+"에 맞습니까?"+ Pattern.matches(regex1,str2));
		
		String str1 = "abc123";
		System.out.println(str1+ "은 정규 표현식"+ regex1+"에 맞습니까?"+ Pattern.matches(regex1,str1));
		
		
	}

}
