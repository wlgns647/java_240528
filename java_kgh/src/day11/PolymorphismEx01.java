package day11;

import javax.security.auth.login.AppConfigurationEntry;

public class PolymorphismEx01 {

	public static void main(String[] args) {
		TV tv = new TV();
		AirConditioner aircon = new AirConditioner();

		turnOn(tv);
		turnOn(aircon);

	}
	// 가전제품 종류가 20개 이면 턴온 메소드가 20개
	// 턴오프 메소드가 추가되면 총 40개임

	/*
	 * public static void turnOn(TV tv) { tv.power = true;
	 * System.out.println(tv.name + "이 켜졌습니다."); }
	 * 
	 * public static void tyrnOn(AirConditioner aircon) { aircon.power = true;
	 * System.out.println(aircon.name + "이 켜졌습니다."); }
	 */
	// 매개변수 다형성을 이용하면 가전제품 종류에 상관없이 하나의 메소드로 처리할 수 있
	public static void turnOn(Appliances app) {
		app.power = true;
		System.out.println(app.name + " 이 켜졌습니다.");
	}
}

class Appliances {
	boolean power;
	String name = "가전제품";
}

class TV extends Appliances {
	public TV() {
		name = "TV";
	}
}

class AirConditioner extends TV {
	public AirConditioner() {
		name = "에어컨";

	}
}