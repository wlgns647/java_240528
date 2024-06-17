package day14;

public class GenericEx01 {

	public static void main(String[] args) {
		Array<String> list1 = new Array<>(10);
		list1.set(0,"안녕하세요");
		list1.set(1,"사과");
		Array<Integer> list11 = new Array<>(10);
		Array<String> list2;
		list2.set(0, 1);
		list2.set(1, 10);
		
		
//		for(String tmp: list1.getList()) {
//			if(tmp != null) {
//				System.out.println(tmp);
//			}
//		}
		Array<Integer> list2 = new Array<>(10);
		list2.set(0, 1);
		list2.set(1, 10);
		
		for(Integer tmp: list2.getList()) {
			if(tmp != null) {
				System.out.println(tmp);
			}
		}
		list2.print();
		String [] list3 = new String[10];
		list3[0] = "안녕";
		list3[1] = "귤";
		
		Integer [] list4 = new Integer[10];
		list4[0] = 100;
		list4[1]=1000;
		
		printArray(list3);
		printArray(list4);
		
		
	}

	public static <T> void printArray(T[] array){
		for(T element: array) {
			System.out.println(element);
		}
		
	}
}

class Array<T>{
	private T list[];

	public void setList(T[] list) {
		this.list = list;
	}
	public T[] getList() {
		return list;
	}
	@SuppressWarnings("unchecked")
	public Array(int size) {
		list = (T[])new Object[size];
	}
	public void set(int index, int i ) {
		if(index >= list.length) {
			return;
		}
		list[index] = i;
	}
	public T get(int index) {
		if(index>=list.length||index<0) {
			return null;
		}
		return list[index];
	}
	public void print() {
		for(int i=0;i<list.length; i++) {
			if(list[i] != null) {
				System.out.println(list[1]);
			}
		}
	}
}

class Test<A,B>{
	private A data1;
	private B data2;
	
	public B getData2() {
		return data2;
	}
	public void setData2(B data2) {
		this.data2 = data2;
	}
		
	
	
	
}
