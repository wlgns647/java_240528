package day04;

public class WhileEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
/*		 12의 약수를 출력하는 코드를 작성
		약수는 나눠서 나머지가 0이 되게 하는 수 %
		12의 약수 : 1,2,3,4,6,12
		
		반복횟수		
		규칙성	  i는 12까지 1식 증가
				> 12를 i 로 나눴을때 나머지가 0이면 i 출력 
		반복문 종료후 없음
		

		
		
	*/	
		int i =1;
		int num=12;
		System.out.println(num + "의 약수");
		while (i <= 12)  {	
			if(12%i==0) {
			System.out.println(i+ (i != num? ",":"\n"));	
			}
			i+=1;
			 
		}
	
		
	}

}
