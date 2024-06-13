package day12;

public class InterfaceEx01 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.bark();
		dog.sleep();
		AnimalAction aa= new Dog1();
		aa.bark();
		System.out.println(AnimalAction.num); // AnimalAction 에 있는 10과 20을 출력해보기
		System.out.println(AnimalAction.num); // AnimalAction 에 있는 10과 20을 출력해보기
		AnimalAction.print();
	}

}

interface AnimalAction {
	public static int num = 10;
	public abstract void bark();
	// 디폴트메소드는 오버라이딩을 하지 않아도 됨 

	void eat(String food);
	//스테틱 메소드 호출할때 클래스나 인터페이스 이름으로 호출
	public static void print() {
		System.out.println("동물의 동작입니다. ");
	}
	
	
	
	
	default void sleep() {
		System.out.println("잠을 잡니다 ");
		
	}
}

abstract class Animal2 implements AnimalAction {
	String name;

}

class Dog1 extends Animal2 {

	@Override
	public void bark() {
		System.out.println("멍멍");
	}


	@Override
	public void eat(String food) {
		System.out.println(food + " 를 먹습니다.");
	}

}