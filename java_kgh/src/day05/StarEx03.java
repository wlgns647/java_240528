package day05;

public class StarEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char star ='*';				//
		for(int i=1; i<=5;i++) {		//i가 증가하면서 5번 반복 5줄 
			for(int j=1; j<=5-i;j++) { // 한 줄당 내용임 
				System.out.print(" ");	// 띄 어쓰기 하고
			}
			for( int j=1; j<=i;j++) {	// j가 1이고 i가 클때 하나씩 커짐
				System.out.print(star);
			}
			System.out.print("\n");
			
		}
		// 첫사이클 띄어쓰기 4번 함  
		// 첫사이클 j 1임 별 한번찍음 
		// 첫사이클 줄바꿈
		// 2사이클 띄어쓰기 3번함 
	
		
	}

}
