package day11;

public class InstanceMemberInitEx01 {

	public static void main(String[] args) {
		System.out.println(B.max);
		//객체를 생성할 때 생성자에서 max도 초기화 함 
		
		B b = new B(); // 이때 num와 max 의 값은?
		System.out.println(b.num);
		System.out.println(B.max);
	}

}


class B{
	
	public int num = 10;
	public static int max = 10;
	{
		num = 20;
	}
	static {
		max =20;
	}
	public B() {
		num=30;
		max=30;
	}
}
