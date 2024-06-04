package day06;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ArrayEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1~10 사이의 랜덤한 수 3개를 저장하고 출력하고 
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

		int arr[] = new int[3];   //배열로 int 형 변수 3개 선언해줌 
		int min = 1, max = 10;		
		int random = (int) (Math.random() * (max - min + 1) + min);
		Scanner scan= new Scanner(System.in);
		
		for (int i=0; i<arr.length;i++) {
		System.out.print("정수입력: ");
		int num = scan.nextInt();
		
		//3개의 정수를 입력받아 배열에 저장함 
//		이대로 출력하면 저장후 출력 내가할건 저장후 비교 후 출력임 

		 
		}
	}
}

		
		
		
		
		

