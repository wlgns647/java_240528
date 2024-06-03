package day05;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 학생 3명의 성적을 저장하는 배열을 생성하고 
// 학생 3명의 성적을 콘솔을 통해 입력받고 출력하는 코드를 작성하시오
// 입력받은 성적의 평균을 구하는 코드 작성
		
		int scores1[] = new int[3];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < scores1.length; i++) {
			System.out.print("학생"+(i+1)+" 의 성적: ");
			scores1[i] = scan.nextInt();
		}
		for (int i = 0; i < scores1.length; i++) {
			System.out.println("학생"+(i+1)+" 의 성적: "+scores1[i]);
		}		
	//  1. 스코어 1[i] 전부 다 더해야함 	
//		2. 3으로 나눠줌 
//		3. 출력
		int sum = 0;
//		sum = sum+ score[0];
//		sum = sum+ score[1];
//		sum = sum+ score[2];
		//sum 총점 
		for (int i=0;i<scores1.length;i++) {
			scores1[i]= scan.nextInt();
			sum += scores1[i];// sum=snm+scores1[i]
		}
			double avg = sum/ (double)3;
			System.out.println("학생 3명의 평균: "+ avg);
	}
}
