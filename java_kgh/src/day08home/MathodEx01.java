package day08home;

import java.util.Scanner;

public class MathodEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	정수 n을 입력받아 입력받은 n 크기를 가지는 배열을 생성하는 코드를 작성하세요
//	1. 메인클레스 
//		배열을 
//		만들고 
//		프린트  배열 ?  이고 ? 값은 메서드에서 받아옴 
//		
//	2.새로운 클레스 
		
		        Scanner scanner = new Scanner(System.in); 
		        
		        // 정수 n 입력 받기
		        System.out.print("배열의 크기를 입력하세요: ");
		        int n = scanner.nextInt();
		        
		        // 배열 생성
		        int[] array = createArray(n);
		        
		        // 생성된 배열 출력했음  확인용 
		        System.out.println("생성된 배열:");
		        for (int i = 0; i < array.length; i++) {
		            System.out.print(array[i] + " ");
		        }
		    }
		    
		    // 배열 생성 메소드 
		    public static int[] createArray(int size) {
		        return new int[size];
		    }
		}
//스캔 달고 "배열입력" 출력하고 배열== 만든배열n 만듬
//   여기서 n은 위에 언되어 있는 int 형 스케너이고 이 n값이 맡에 메소드로 이동 int size는 
//   n값을 가짐 n값 리턴 후 메소드 종료 메인으로 돌아감 
//  메인은 압력받은 배열을 출력함 
	

