package day04;

public class ContinueEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0;
		while (i <= 10) {
			i += 1;
			if (i % 2 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
