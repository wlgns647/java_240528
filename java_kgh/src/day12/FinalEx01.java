package day12;

public class FinalEx01 {

	public static void main(String[] args) {
		final int num;  // 파이널 변수는 상수로 값을 최초 한번만
						// 할당 할수 있다 
		num =20;  //처음 할당하기때문에 가능
		num =30;  // 두번쨰 부터는 불가능
	
	}

}



class Parent1{
	public final void print() {
		System.out.println("파이널 메소드 입니다");
	}
	
}

class Child1 extends Parent1{
//	파이널 메소드는 오버라이드 할 수 없어서 에러 발생 
//	@Override
//	public final void print() {
//		System.out.println("파이널 메소드를 수정하려고 합니다");
//}
	
final class Parent2{
	
}

// 파이널 클래스는 부모클래스가 될 수 없다 
class Child2 extends Parent2{
	
}

// 추상 클래스는 추상 메소드가 반드시 들어가는 것이 아니다 
abstract class Test1{
	
}





