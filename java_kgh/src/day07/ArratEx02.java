package day07;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArratEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*
	 

 *  1에서 9사이의 랜덤한 수 3개를 배열에  중복되지 않게 저장
 *  반복횟수	저장된 숫자가 3개가 아닐때 반복
 *  		 저장된 숫자가 3개보다 작을때 
 *  
 *  규칙성 	랜덤한 수를 생성해서 중복되지 않으면 저장
 *  
 *  반복문 종료 후   배열에 저장된 숫자 출력 
 *  
 */
		//1. 랜덤한 수를 변수에 저장 
			//2.배열에 랜덤한 수가 있는지 확인
			//	i는 0부터 저장된 개수보다 작을 떄까지 1씩 증가
			//  i 번지에 있는 값과 랜덤한 수가 같으면 반복문을 종료 
			//3 없으면 배열에 추가한 후 저장된 개수를 1증가시킴 
//				i 와 count 가 같다면 배열에 랜덤한 수를 저장한 후 저장한개수 1증가
		
		
		
		
		int min = 1, max = 9;
		//랜덤값의 최소,최대치 선언
		
		// int random은 저장된 숫자가 3개가 아니면 반복선언 
		int [] list = new int[3];
		// 3의 크기를 갖는 배열 num을 선언
		int count =0;
		//저장된 숫자의 갯수
		while (count<3) {
			int random = (int) (Math.random() *(max - min + 1) + min);
			
			for(int i = 0; i < count; i++) {
				if(list[i]==random) {
					break;// 브레이크 만나면 i는 count 보다 작을수밖에 없음 
					
		}
		}
			if(i ==count) {
				list[count]=random;
				count++;
			}
		System.out.println(random);
	}		
		System.out.println(Array.toString(list));
	
		
		
		
	}

}
