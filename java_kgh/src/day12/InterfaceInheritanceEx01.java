package day12;

public class InterfaceInheritanceEx01 {

	public static void main(String[] args) {
		
		InterfaceInheritanceEx01 a = new InterfaceInheritanceEx01();
	
	}

}


interface InterfacePA{
	void print();
	void test1();
}
interface InterfacePB{
	void print();
	void test1();
}
// print() 메소드가 겹치는데 상속을 받으면 어차피 구현부가 없어서 
// 하나로 합치면 되기 때문에 (인터페이스는)다중상속이 가능
interface InterfaceC extends InterfacePA, InterfacePB{
	
}

class ClassA{
	
}
class ClassB{
	
}
class ClassC extends ClassA, ClassB {}