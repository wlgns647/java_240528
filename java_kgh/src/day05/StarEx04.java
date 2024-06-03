package day05;

public class StarEx04 {
	public static void main(String[] args) {
	
		char star = '*';
		for(int i=1; i<=5;i++) {
			for(int j=1; j<=5-i;j++) {		//4번 띄고 
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {	   // i 랑 같아질떄 까지 하나씩 찍음 첨 1개 담2개
				System.out.print(star);
			}
			for(int j=1; j<=i-1;j++) { // J가 1일때 I-1만큼 별찍음  위애보다 1개 덜찍으니 홀수 유지
										// 3번 예제에서 부족한 오른쪽 부분 채울수 있음	
				System.out.print(star);
			}
			System.out.print("\n");
		}
		
			
		
		
		
		
}
}