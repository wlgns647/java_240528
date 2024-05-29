package day02;

public class IncrementOperatorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1= 10, num2= 20;
		
		++num1;
		num2++;
		
		System.out.println("num1:"+num1);
		System.out.println("num2:"+num2);
		
		System.out.println("증가 전 num1: " + num1);
		System.out.println("증가 전 num2: " + num2);
		
		System.out.println("증가 하는중 num1: " + ++num1);//전위형
		System.out.println("증가 하는중 num2: " + num2++);//후위형 
	
		System.out.println("증가 후 num1: " + num1);
		System.out.println("증가 후 num2: " + num2);
	
	
	
	
}
}