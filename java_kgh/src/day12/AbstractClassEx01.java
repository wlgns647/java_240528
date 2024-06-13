package day12;

public class AbstractClassEx01 {

	public static void main(String[] args) {
		//추상 클래스를 이용하여 객체를 생성할수 없다. 
	//	Animal animal =new Animal(); 
		
		Cat cat =new Cat();
		cat.bark();
		Dog dog =new Dog();
		dog.bark();
		Tiger tiger = new Tiger();
		tiger.bark();
		
		Animal [] animals = new Animal[3];
		animals[0] = cat; 
		animals[1] = dog;	//업캐스팅
		animals[2] = tiger;
		for (Animal tmp : animals) {
			tmp.bark();
		}
	}

}

abstract class Animal {
	public String name;
	public String species; // 종

	public void sleep() {
		System.out.println("잠을 잡니다.");
	}

	public void eat(String food) {
		System.out.println(food + "를 먹습니ㄴ다.");
	}

	public abstract void bark();

} // bark() 메소드는 Animal 클래스를 상속받는 모든 클래스들이 bark를 오버라이딩
//해야하기 때문에 굳이 구현하지 않아도 됨. 그래서  추상메소드로 만듬> Animal 클래스는
//추상메소드가 있기떄문에 추상클래스로 바꾸어야함

class Cat extends Animal {
	public Cat() {
		name = "고양이";
		species = "고양이과";
	}

	@Override
	public void bark() {
		System.out.println("냐아옹");
	}
}

class Dog extends Animal {
	public Dog() {
		name = "개";
		species = "개과";
	}

	@Override
	public void bark() {
		System.out.println("멍멍");
	}
}

class Tiger extends Animal {
	public Tiger() {
		name = "호랑이";
		species = "고양이과";
	}

	@Override
	public void bark() {
		System.out.println("어흥");
	}
}
