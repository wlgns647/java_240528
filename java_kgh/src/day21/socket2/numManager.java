package day21.socket2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import program.Program;

public class numManager implements Program {

	private static final String name = null;
	private static final String num = null;
	private static final Contact contact = null;
	private Scanner scan = new Scanner(System.in);
	private List<Contact> list = new ArrayList<Contact>();

	@Override
	public void run() {
		int menu = 1;

		do {
			printMenu();
			menu = scan.nextInt();
			try {
				runMenu(menu);
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println(list);
		} while (menu != 5);
		System.out.println("프로그렘을 종료합니다");
	}

	@Override
	public void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 번호등록");
		System.out.println("2. 번호수정");
		System.out.println("3. 번호삭제");
		System.out.println("4. 번호확인");
		System.out.println("5. 종료");
		System.out.print("메뉴선택: ");

	}

	@Override
	public void runMenu(int menu) throws Exception {
		switch (menu) {
		case 1:
			insert();

			break;
		case 2:
			update();

			break;
		case 3:
			delete();

			break;
		case 4:
			print();

			break;
		case 5:
			exit();
			break;
		default:
			System.out.println("잘못된 메뉴선택입니다.");
		}

	}

	private void insert() {
		System.out.println(" 이름입력: ");
		String name = scan.next();
		System.out.println("번호입력: ");
		String num = scan.next();
		Contact contact = new Contact(name, num);

		if (list.contains(contact)) {
			System.out.println("이미 등록된 번호입니다.");
			return;
		}
		System.out.println("번호를 추가했습니다.");
	}

	private void update() {
		// 검색
		// 이름 입력
		System.out.println("수정할 번호를 입력하세요 ");
		String search = scan.next();
		// 입력한 이름이 포함된 연락처들을 번호와 함께 출력
		
		int i=0, count = 0;;
		for (Contact contact : list) {
			if (contact.getName().contains(search)) {
				System.out.println(i+". : " + contact);	
				i++;
			}
		}
		// 연락처 선택하고
		// 번호를 입력
			System.out.println("번호 입력: ");
			int index = scan.nextInt();
			// 입력된 번호 -1 한 번지에 있는 객체를 가져옴
			Contact contact = list.get(index);
			System.out.println("새로운 이름입력: ");
			String name = scan.next();
			System.out.println("새로운 번호입력: ");
			String num = scan.next();
		
	// 새로운연락처 객체를 생성
			Contact newContact = new Contact(name, num);
	// 새로운 연락처 정보를 입력하고
			for(Contact tmp : list) {
				if(tmp == contact) {
					continue;
				}
				if(tmp.equals(newContact)) {
					System.out.println("이미 등록된 번호입니다");
					return;
				}
			}
				contact.update(newContact);
				System.out.println("연락처를 수정했습니다.");

}


	// 수정 > 새로운 연락처가 리스트에 있으면 안내문구 출력후 종료
	// (단,현재 선택한 연락처가 아닌 연락쳐 중에서)
	// -1 전채탐색중 내가 선택한것이 아닌 것만 확인할 수 있고
	// -2 삭제후 추가하는 방법이 있음

	// 전체탐색

	// 리스트에서 가져온 객체와 위에서 가져온 객체가 같으면 건너뜀

	// 리스트에서 가져온 객체와 새로운 연락처 객체가 같으면 안내문구 출력 후 종료

	// 위에서 가져온 객체(90)을 새로운 객체로 수정(Contact 클래스에 update 메소드를 추가)

	private void delete() {
//			이름을 입력하고 
		System.out.println("삭제할 번호를 입력하세요 ");
		String search = scan.next();
//		입력한 이름이 포함된 연락처들을 번호와함께 출력하고
		int i=0, count = 0;;
		for (Contact contact : list) {
			if (contact.getName().contains(search)) {
				System.out.println(i+". : " + contact);	
				i++;
			}
		}
//		번호를 선택하고
		System.out.println("번호 입력: ");
		int index = scan.nextInt();
		// 입력된 번호 -1 한 번지에 있는 객체를 가져옴
		Contact contact = list.get(index);
//		선택한 번호의 연락처를 삭제
		if(list.remove(index) != null){
		System.out.println("연락처를 삭제했습니다");	
		return;
		}
		System.out.println("연락처를 삭제하지 못했습니다");
	}

	private void search() {
		// 이름입력후 이름이 포함된 연락처들을 출력 
		System.out.println("검색할 번호를 입력하세요 ");
		String search = scan.next();
		int count = 0;;
		if(count==0) {
			System.out.println(" 검색 결과가 없습니다. ");
		}
		// 일치하는 연락처들이 없으면 안내문구 출력
	}
	public void load() {
		
	}
	
	public void save() {
//		저장하기위해
//		1. 소켓생성 
		
//		2.	소캣을 이용하여 오브젝트아웃풋스트림 객체생성
		
//		3. save 문자열 전송
		
//		4. 연락처 리스트를 전송
		
	}
	
	
	
	
	
	private void exit() {

	}

	
	
	
	
	
}
