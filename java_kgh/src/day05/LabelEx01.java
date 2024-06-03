package day05;

public class LabelEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i,j;
		
		for(i= 1; i<=5;i++) {
			for( j=1; j<=5;j++)
				System.out.print(i*j+ " ");
		
		System.out.println();
		}
	// 라벨 이름 a 
		
	for(i= 1; i<=5;i++) {
		for( j=1; j<=5;j++)
			System.out.print(i*j+ " ");
			if(j ==3) {
				break;
			}
	} // 라벨 이름 a 를 지정한 후 break a 를 이용하면 라벨 이름이 a 인 반복문을 빠져나갈수 있다 
	
	A:for(i= 1; i<=5;i++) {
		for( j=1; j<=5;j++)
			System.out.print(i*j+ " ");
			if(j ==3) {
				break A;
	
			}
	}
	}
}

		
		
	


