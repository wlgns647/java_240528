package day06;

public class ArrayEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		2단의 결과값은 2,4,6,8....18 을 배열에 저장하고 
//		배열에 있는 값을 이용하여 구구단 2단을 출력하는 예제 
		
//		배열에 2부터 18 넣고 저장
//		배열에 있는  값을 이용해 출력
		
		
		int [] arr1 =new int[9];	
							
		for (int i = 0; i < arr1.length; i++) {
	
			arr1[i] = 2* (i+1);
		}
		for(int i= 0; i<arr1.length; i++) {
			System.out.println(2+"x"+(i+1)+"="+arr1[i]);
		}
//		 10개 짜리 배열을 만들어서 -번지를 사용하지 않고 1번지부터 사용
//		arr1[i] = 2* (i+1); 에서 +1 을 사용하지 않아도 됨
		
		int arr2[] = new int[10];
		
		for (int i = 1; i < arr2.length; i++) {
			arr2[i] = 2* i;
			System.out.println(2+"x"+i+"="+arr2[i]);
			
		}
		
		
	}

}
