package program;

public interface Program {

	void printMenu();

	void runMenu(int menu);
	
	void run();
	
	default void save(String fString) {
		System.out.println("저장 기능을 구현할 예정입니다");
	}
	default void load() {
		System.out.println("불러오기 기능을 구현할 예정입니다.");
	}
	
}
