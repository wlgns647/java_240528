import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1~10 사이의 랜덤한 수 3개를 저장하고 출력하는 예제 
//		숫자를 입력해서 입력한 숫자가 랜덤한 수에 있는지 확인하는 예제
//		방법 1  
//		반복횟수 i는 0번지부터 배열의 크기보다 작을 때까지 1씩 증가
//		규칙성 배열 i번지에 있는 값과 입력받은 값이 같으면  반복문을 종료
//		반복문 종료 후 i가 배열의 크기보다 작으면 ~은 있습니다 출력 
//		같으면 ~은 없습니다 라고 출력 

//		 방법2
//		반복횟수 향상된 for 문을 이용하여 전체 탐색
//		규칙성 배열의 값과 입력받은 값이 같으면 booleam resilt를 true로 변경
//		하고 반복문을 종료
//		반복문 종료후 result가 true 이면 ~은 있습니다. 라고 출력하고 아니면 없습니다 출력

		
		int arr[] = new int[3]; // 배열 만듬 int 3개
		int min = 1, max = 10; // 최대치 최소치 선언
		for (int i = 0; i < arr.length; i++) { // 만약 int i값이 배열보다 작으면 1추가
			arr[i] =(int)(Math.random() * (max - min + 1) + min);
			Scanner scan;
			int num = scan.nextInt(); 
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 ( "+min+"~"+max+"):");
			
//		방법1 
//		정수 3개 있는데 내가 찾으려는 정수의 위치가 어딘지 확인
//		중간에 찾았으면 1~3 사이에 위치할 테고 없으면 3보다 크다
//		중간에 찾았으면 0~2번지 사이에 있고 없으면 3번지
// 		반복횟수
		int i
		for( i =0;1<arr.length; i++) {
			if(arr[i] == num ) {
				break;
			}
		}
			if( i <arr.length )	{
	System.out.println(num+"는 있습니다");
}
			

	

	}

}
