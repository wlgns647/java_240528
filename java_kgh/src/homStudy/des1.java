package homStudy;

import java.util.Scanner;

public class des1 {

	public static void main(String[] args) {
		// 학생 3명의 성적을 저장하는 배열을 생성하고 성적을 콘솔을 통해 입력받고 출력하는 코드를 작성하세요
		int score[] = new int[3];
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			System.out.print("학생" + (i + 1) + " 의 성적 입력 :");
			score[i] = scan.nextInt();
			sum += score[i];
		}
		sum = sum/3;
		System.out.println("점수 평균: "+sum);
		
	}

}
