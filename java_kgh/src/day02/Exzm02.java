package day02;

public class Exzm02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=1,num2=2;
		char ch='+';
		//num1,num2, ch를 이용하여 1+2가 콘솔에 출력되도록 코드 작성
		
	String str1= ""+num1+ch+num2;
// ch를 그냥 쓰면 정수43 처리됨 
	System.out.println(str1);
		
	/*자료 형변환
	*-상수,변수,리터럴의 자료형을 일시적으로 변환시키는것
	**/
	
		double num6 = 3; //자동 자료형변환이 동작,정수를 실수로 변환하여 저장
		long num7= 3; // 정수 리터럴은 int 임
		int nu8 = 3; //  형변환 x 
		long num9 =3 ; // 자동 자료 형변환 
		
		int num5 = (int)3.14; //명시적 자료 형변환을 통해 실수를 정수로 변환
		System.out.println(num5);
		byte num11 = (byte)num5; //명시적 자료형변환을 했지만 짤리는 값이 없는 경우 원래 값과 결과가 같음
		System.out.println(num11);
		byte num12 = (byte)123123; // 명시적 자료형변환을 해서 잘리는 값이 있는 경우 원래 값과 결과가 다름
		System.out.println(num12);
		
		// 자동 자료형 변환이 일어나지만 명시적 자료형 변환이 필요한경우
		
		double res = 1/2;  // 1/2의 결과인 0이 자료형 변환을 통해 0.0으로 변환 
		System.out.println(res);
		
		res = 1/(double)2; // 2를 명시적 자료 형변환으로 전환하여 1/2.0을 계산해서 0.5를 저장
		System.out.println(res);
		
		
	}

}
