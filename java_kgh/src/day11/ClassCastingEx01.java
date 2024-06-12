package day11;

public class ClassCastingEx01 {

	public static void main(String[] args) {
		Circle c1 = new Circle(10, 10, 10);
		Rect r1 = new Rect(0, 10, 10, 10);
		Circle c2 = new Circle(10, 10, 5);

		Circle[] crrcleList = new Circle[10];
		Rect[] rectList = new Rect[10];

		Shape[] shapes = new Shape[20];

		shapes[0] = c1; // 업캐스팅에 의해 클래스 형변환이 실행
		shapes[1] = r1;
		shapes[2] = c2;

		for (Shape tpm : shapes) {
			// 원이면 원을 그리고 사각형이면 사각형을 그리는 예제  
			if (tmp == null) {
				continue;
			}
			if(tmp instanceof Circle) {
				Circle circle = (Circle)tmp;// 다운 캐스팅
				
			}
			else if(tmp instanceof Rect) {
				Rect rect= (Rect)tmp;
				rect.drawRect();
				
			}
		}

	}

	class Shape {
		String name = "도형";

		public Shape(String name) {
			this.name = name;
		}

	}

	class Rect extends Shape {
		int x, y;
		int width, height;

		public Rect(int x, int y, int width, int height) {
			super("사각형");
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
		}
	}

	class Circle extends Shape {
		int x, y;
		int radius;

		public Circle(int x, int y, int radius) {
			super("삼각형");
			this.x = x;
			this.y = y;
			this.radius = radius;
		}

		void print() {
			System.out.println(name + " 입니다. ");
		}

		public Circle(int x, int y, int radius) {
			super("원");
			this.x = x;
			this.y = y;
			this.radius = radius;
		}

		@Overrride
		public void print() {
			super.print();
			System.out.println("중심점: " + x + "," + y);
			System.out.println("반지름 : + width");
			System.out.println(" : + height");
			this.radius = radius;
		}

		public void drawCircle() {
			System.out.println("원을 그립니다. ");
		}

	}

}
