package day02;

public class ComparisonOperatorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//비교 연산자 예제 
		
		int num1= 10, num2= 20;
		
		System.out.println(""+ num1 +'<'+ num2 +":"+(num1<num2));
		System.out.println(""+ num1 +'>'+ num2 +":"+(num1>num2));
		System.out.println(""+ num1 +"<="+ num2 +":"+(num1<=num2));
		System.out.println(""+ num1 +">="+ num2 +":"+(num1>=num2));
		System.out.println(""+ num1 +"=="+ num2 +":"+(num1==num2));
		System.out.println(""+ num1 +"!="+ num2 +":"+(num1!=num2));

		
		
		String str1 = "abc", str2 = "abc", str3 = new String("abc");
// 문자열을 ==,!=을 이용하면 같은 주소인지를 비교하기 때문에 문자열이 같아도 다르다고 판별할수 있다
		System.out.println("str1 ==str2: " + (str1==(str2)));
		System.out.println("str1 ==str3: " + (str1==(str3)));
		System.out.println("str3 ==str2: " + (str3==(str2)));
// 문자열은 equals를 이용하여 비교해야 함.
		System.out.println("str1 ==str2: " + (str1.equals(str2)));
		System.out.println("str1 ==str3: " + (str1.equals(str3)));
		System.out.println("str3 ==str2: " + (str3.equals(str2)));
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
