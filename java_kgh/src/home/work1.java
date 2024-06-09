package home;

import java.util.Arrays;

public class work1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 85;

		boolean isB;

		isB = score >= 80 && score < 90;

		System.out.println(score + "점은 B 학점인가요?" + isB);

		/*
		 * score 가 80점 이상이고, score 가 90점 미만이다
		 * 
		 * score가 80점 이상이고, score가 90점 미만이다
		 * 
		 * score가 80보다 크거나 같고 score가 90보다 작다
		 * 
		 * score가 80보다 크거나 같다 && score가 90보다 작다
		 * 
		 * score >= 80 && score < 90;
		 * 
		 */
		int[] arr = { 1, 26, 17, 25, 99, 44, 303 };

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
