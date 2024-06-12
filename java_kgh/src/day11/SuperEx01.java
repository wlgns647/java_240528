package day11;

public class SuperEx01 {

	public static void main(String[] args) {
		Child1 c = new Child1(10,20);
		c.printChild();
	}

}

class parent1{
	int num1= 1;
	
	public void print() {
		System.out.println("num1 : "+ num1);
	}
	public parent1(int num) {
		this.num1 = num;
	}
	
	}


class Child1 extends parent1{
	int num2 =2;
	// 부모 클래스에 있는 print를 호출
	public void printChild() {
		// 부모 클래스에 있는 print를 호출
		super.print();
		System.out.println("num2 : "+ num2);
		
		
	}
	public Child1 (int num1, int num2) {
		// 부모 클래스의 기본 생성자가 없어서 있는 생성자를 호출 
		super(num1);
		this.num2 = num2;
	}
	
}