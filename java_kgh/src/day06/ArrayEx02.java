package day06;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	 배열은 생성 시 초기화가 되는지 보여주는 예제 
		
		int num1;
		
//		System.out.println(num1);  //지역 변수는 자동으로 초기화가 안됨
		num1=10;
		System.out.println(num1);  
		
		int [] arr= new int[3];
		
				for(int tmp : arr) {
					System.out.println(tmp);// 배열은 배열 생성시 각 자료형에 맞는 초기값으로 초기화됨
				}
				
				arr[2] =20;
		
	}

}
