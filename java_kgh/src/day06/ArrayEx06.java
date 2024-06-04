package day06;

import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 4 과목의 성적을 입력받아 배열에 저장하고 과락40점 이하 없고 평균이 60점이 넘으면 Pass 아니면 Fail 이라고 출력하세요
		 * 
		 * 과목성적 4개를 입력받고 저장 저장된 값 전부 더함
		 * 
		 * 4개짜리 배열 생성
		 * 
		 * 성적 4개 입력받음 입력받은 성적의 총합 계산 총합으로 평균 계산
		 *
		 * 과락여부 확인하여 변수에 저장
		 * 
		 */

//	 입력받는곳 for 문에 넣어서 4번  받음 
//		새로운 변수 sum 에 점수 합침 
//	 다른 변수 2개 만들어서	과락 pass  점수 저장
//		만약 sum이 f 보다 작다면 

//		반복횟수 향상된 for 문을 이용하여 전체 탐색
//		실행문  배열에서 가져온 값을 sum 에 누적 
//		반복문 종료 후 : 없음 

		int score[] = new int[4];
		Scanner scan = new Scanner(System.in);
		System.out.println("점수 입력");

		for (int i = 0; i < score.length; i++) {
			score[i] = scan.nextInt();
		}
		int sum = 0;
		for (int tem : score) {
			sum += tem;
		}
		System.out.println(sum);
//		과락 여부를 확인하여 변수에 저장
//		반복횟수	향상된 for 문을 이용하여 전체 탐색
//		실행문  배열에서 가져온 값이 40보다 작으면 과락변수 frue로 변경
//		반복 종료 후 없음 

		double avg = sum / (double) score.length;

		boolean isfail = false;
		for (int tmp : score) {
			if (tmp < 40) {
				isfail = true;
				break;
			}
		}
		if (!isfail && avg >= 60) {

			System.out.println("pass");
		} else {
			System.out.println("fail");

		}

	}

	/*
	 * int f = 40, p=60;// 넘거나 낮아야함 if(sum<=f) { System.out.println("과락입니다"); }else
	 * if (sum<p) { System.out.println("Pass 입니다"); }
	 */
}
