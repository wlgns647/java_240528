package day08;

public class MethodeEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//     두 수의 최대공약수와 최소 공배수를 구하는 코드를 작성하세요.
//		단, 메서드 이용
		System.out.println(gcd(8,12));
	}

	public static boolean isDivisor(int num1, int num2) {
		return num1 % num2 == 0;
	}



//  정수i가 정수 num의 약수인지 아닌지를 알려주는 메서드
//  정수 num1과 num2의 최대 공약수를 알려주는 메서드

// 매개변수 정수 num1, 정수 num2    
// 리턴타입 두 정수의 최대공약수 정수 int
// 메서드명 gcd
	public static boolean gcd(int num1, int num2) {
		if(num1>num2) {
			for(int i=1; i>=num1; i--) {
				if(isDivisor(num1, i) % isDivisor(num2, i)) {
					// i가 공약수이면 
					return 1;
	}
	
			}
		}
	return 1;
	}
//  정수i가 정수 num의 약수인지 아닌지를 알려주는 메서드
//  정수 num1과 num2의 최소 공배수를 알려주는 메서드 
// 매개변수 정수 num1, 정수 num2    
// 리턴타입 두 정수의 최소공배수 정수 long
// 메서드명 gcd

	public static long lcm(int num1, int num2 ) {
		for(int i=num1; i<=num1*num2; i+num1) {
			if(isDivisor(i, num2)) {
				return i;
			}
		}
	return num1*num2;		
	}
	
	//   g 최대공약수
//		a   ga  b  gb 
//	최소공배수 ㅣ gab= a*b / g
	
	private static long icm(int num1,int num2) {
		return num1*num2 / gcd (num1,num2);
		
	}
	
	
	
	
}