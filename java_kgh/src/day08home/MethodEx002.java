package day08home;

public class MethodEx002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(random(1, 15));

	}

	public static int random(int min, int max) {
		int random = (int) ((Math.random() * (max - min + 1)) + min);
		return random;
		// return (int)(Math.random()*(max -min+1)+min);
	}

}
