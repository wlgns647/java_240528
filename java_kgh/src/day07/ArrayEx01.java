package day07;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 3명의 학생의 국어,영어,수학 성적을 입력받고
		// 각 학생의 평균을 구하는 코드를 작성하세요
		// 0. 스켄 장착
		// 1. 크기 3짜리 배열을 3개만듬
		// 1-0 학생 1명당 국,영,수 3개의 크기를 가진 배열 생성 = 배열3
		// 2. 각 학생들의 국 ,영 ,수 점수를 더해서 임의 변수에 저장함
		// 2-1 특정 과목의 학생3명 점수통계
		// 학생 3명의 특정과목 1 개 하면

		Scanner scan = new Scanner(System.in); // 스켄 장착
		int studnetCount = 3;// 변수 학생카운트는 3
		int[] kor, eng, math; // 크기 3짜리 배열을 3개만듬
		// 과목 3개만들었고 크기는 학생 수
		kor = new int[studnetCount];
		eng = new int[studnetCount];
		math = new int[studnetCount];
		// 과목은 학생 카운트의 값을 가짐 //3
		// 반복문을 이용하여 학생 성적을 입력받음 배열에 저장해야 함
		// 국어,영어,수학점수 입력 => 배열 저장
		for (int i = 0; i < studnetCount; i++) {
			System.out.print("학생" + (i + 1) + " 의 성적을 입력하세요 (국어,영어,수학 순입니다)");
			kor[i] = scan.nextInt();
			eng[i] = scan.nextInt();
			math[i] = scan.nextInt();
		} // 첫 사이클이 첫번째 학생에 대한 3과목 //두번째 학생으로 넘어감

		// i=0부터 2까지 i<3;
		System.out.println(Arrays.toString(kor));
		System.out.println(Arrays.toString(eng));
		System.out.println(Arrays.toString(math));

		int sum;
		double avg;

		/*
		 * int sum= kor[0] + eng[0] + math[0]; double avg =sum/3.0;
		 * System.out.println("학생 (0+1)의 평균: "+avg); // 학생 ㅎ int sum= kor[1] + eng[1] +
		 * math[1]; double avg =sum/3.0; System.out.println("학생 (1+1)의 평균: "+avg);
		 * 
		 * int sum= kor[2] + eng[2] + math[2]; double avg =sum/3.0;
		 * System.out.println("학생 (2+1)의 평균: "+avg);
		 */
		for (int i = 0; i < studnetCount; i++) {
			sum = kor[i] + eng[i] + math[i];
			avg = sum / 3.0;
			System.out.println("학생 " + (i + 1) + "의 평균:" + avg);
		}
		/*
		 * 각 과목의 평균을 구하는 코드를 작성하세요/ 국어평균 93.66666 영어평균 90 수학평균86.666666666
		 */
		// sum= kor[0]+kor[1]+kor[2];
		// sum=0;
		sum = 0; // sum 값은

		for (int i = 0; i < kor.length; i++) {
			sum = sum + kor[i];
		}
		avg = sum / (double) kor.length;
		System.out.println("국어평균:" + avg);

		for (int i = 0; i < eng.length; i++) {
			sum = sum + eng[i];
		}
		avg = sum / (double) eng.length;
		System.out.println("영어 평균:" + avg);

		for (int i = 0; i < math.length; i++) {
			sum = sum + math[i];
		}
		avg = sum / (double) math.length;
		System.out.println("수학 평균:" + avg);

	}

}
