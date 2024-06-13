package day12;

public class InheritanceEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Child c = new Child();
			run(c);
	}
// 		메인메ㅇ소드에서 호출할 런 메소드를 만드는데
//	 	누가 어떻게 구현할지 모름 
		public static void run(Parent Parent ) {
			if(Parent != null) {
				Parent.run();
			}
		}
	
}

//parent 는 개발자들이 자주쓰는 클래스라고 가정 > 다른 패키지라고 가정 
// 이 클래서에는 run이라는 메소드가 있다고 가정
class Parent{
	
	public void run( ) {
		System.out.println("실행합니다.");
		
		
	}
}


class Child extends Parent{
	@Override
	public void run() {
		System.out.println("오버라이드 하여 실행합니다");
	}
	
	
}










