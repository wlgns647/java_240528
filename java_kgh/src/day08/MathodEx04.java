package day08;

public class MathodEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  재귀 메서드로 인해 스택 오버 플로우가 발생하는 예제 
//	재귀 메서드는 메서드에서 자기 자신을 다시 호출하는 메서드 
		System.out.println(factorial(5));
	}

//	재귀 메서드를 이용하여 팩토리얼을 구하는 예제 
//	5! > 1*2*3*4*5 > 120
//	5! . 5*4! 
	
//	정수 NUM 가 주어지면 주어진 정수의 팩토리얼을 알려주는 메서드 
	
//   매개변수  정수 num > int num
// 	리턴타입 num의 팩토리얼값 큰 정수 long
//	메서드명 factorial
	public static long factorial(int num) {
		if(num <0 ) {
			return 0;
		}
		if(num==0 || num ==1) {
			return 1;
		}
		return num * factorial (num -1);
	}
	public static long factorial2(int num) {
		return num* factorial(num -1);
	}
	
}














