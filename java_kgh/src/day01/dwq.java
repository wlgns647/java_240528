package day01;

public class dwq {

	public static void main(String[] args) {
		 String str = "Hello World";
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	            if (Character.isUpperCase(ch)) {
	                result.append(Character.toLowerCase(ch));
	            } else if (Character.isLowerCase(ch)) {
	                result.append(Character.toUpperCase(ch));
	            } else {
	                result.append(ch); // 기타 문자(공백 등)는 그대로 추가
	            }
	        }

	        System.out.println("Original: " + str);
	        System.out.println("Reversed case: " + result.toString());
	    }
	
	}


