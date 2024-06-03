package day05;

public class LCMEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		두 정수의 최소공배수를 구하는 코드를 작성하세요
//		a의 배수 b b를 a 로 나누었을 때 나머지가 0 인 b를 a 의 배수라고함
//		6의배수 6 12 18 24 ....
//		8의 배수 8 16 24 32...
//	    6과 8의 공배수는 24 48 72...
//		최소 공배수는 두 수의 공베수중 가장 작은 수
		 
		
//		i는 1부터 무한대까지 1씩 증가 
//		i가 num1 의 배수이고 i가 num2의 배수이면 i를 출력한 후 반복문을 종료
//		반복문 종료후 없음 
//		i를 num1로 나눴을떄 나머지가 0 num2로 나눴을 때 0이면 반복종료 
		
//		반복횟수   6을 1번씩 곱하면서 8의 배수들과 한번씩 비교해봐야하나?
//		규칙성  	만약 a랑 b를 비교해서 a 의 배수들 전부 b의 배수들과 비교해서
//		같은 값을 가지는 경우를 찾아야 하기 때문에 
//		반복종료후
	
		
		
			int i;
			int num1=6;
			int num2=8;
			
			for(i=1; ; i++) {
				if (i%num1==0&& i%num2==0) {
					System.out.println(num1+"과"+ num2 + "최소공배수: "+ i);
					break;
				}
				
			}
				
				
			
//			 2번쨰 방법
//		 	num1이 num2 보다 작으면 num1과 num2를 바꾸는 코드 
//			두 수를 바꾸는 코드로 자주 사용 
			int tmp;
			if (num1<num2) {
				tmp = num1;
				num1=num2;
				num2=tmp;
			}
			
			
//			반복횟수 i는 num1 부터 무한대까지 num1 씩 증가 i는  num1의 배수만 사용 
//			i는 num2 의 배수이면 i 출력후 반복문 종료 
//			반복문 종룔 후 없음 
		for( i= num1; ; i += num1) { 
			System.out.println(num1+"과"+ num2 + "최소공배수: "+ i);
			break;
		}
			
							
		
		
		
	}

}
