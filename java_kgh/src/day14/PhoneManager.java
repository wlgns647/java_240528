package day14;

import java.util.InputMismatchException;
import java.util.Scanner;

import day13.homework.Contact;
import program.Program;

public class PhoneManager implements Program {
	private Contact[] list;
	private Object fileName;
	private Scanner scan = new Scanner(System.in);
	private final int INSERT=1;
	private final int UPDATE=2;
	private final int DELETE=3;
	private final int SEARCH=4;
	private final int EXIT=5;	
	
	
	@Override
	public void printMenu() {
		System.out.println("* 메뉴 ");
		System.out.println("1. 연락처 추가 ");
		System.out.println("2. 연락처 수정 ");
		System.out.println("3. 연락처 삭제 ");
		System.out.println("4. 연락처 검색 ");
		System.out.println("5. 프로그램 종료 ");
		System.out.print("메뉴 선택: ");
	}

	@Override
	public void runMenu(int menu) {
		switch(menu) {
		case INSERT: insert();
			break;
		case UPDATE:
			break;
		case DELETE:
			break;
		case SEARCH:
			break;
		case EXIT:
			break;
			default: System.out.println("잘못된 메뉴입니다");
		}
	}

	private void insert() {
		// TODO Auto-generated method stub
		update(list,count);
//		 이름입력
		scan.nextLine(); // 공백처리 
		System.out.print("이름 : ");
		String name = scan.nextLine();
//		 연락처 리스트에서 이름과 일치하는 연락처를 번지+1번과 함깨 출력 
		printContact(list,count,name);
//		 번호선택 
		System.out.print("번호선택 : ");
		if(!printContact(list,count,name)) {
			break;
		}
		int index = scan.nextInt() -1;
//		 번호가 올바르지 않으면 잘못선택했습니다 하고 종료
		boolean res = checkContact(list,count,name,index);
		if(!res) {
			System.out.println("잘못 선택했습니다.");
			break;
		}
//		 올바르면 이름, 번호를 입력받음
		scan.nextLine();
		System.out.println("이름 : ");
		String newName = scan.nextLine();
		System.out.println("번호 : ");
		String newNumber = scan.nextLine();
//		 이름, 번호를 이용하여 객체를 생성
		Contact contact = new Contact(newName, newNumber);
//		 생성된 객체가 중복된 번호이면 안내문구 출력하고 아니면 객체를 추가 
		if(indexof(list, count, contact)>= 0 ) {
			System.out.println("이미 등록된 번호입니다. ");
			break;
		}
		list[index]= contact;
		break;
	}

	@Override
	public void run() {
		String fileName = null; //불러오기
		load(fileName);
		int menu =EXIT +1;
		do {
			
			//메뉴출력
			printMenu();
			//메뉴선택
			try {
				menu =scan.nextInt();
			}catch(InputMismatchException e) {
				System.out.println("메뉴를 잘못 입력했습니다. ");
				scan.next(); // 입력버퍼 지움
			}
			//선택한메뉴에 따른 기능실행
			runMenu(menu);
		}while(menu != EXIT);
		// 저장하기 save(fileName);
	}
	
	@Override
	public void load(String fString) {
		if(fileName == null) {
			System.out.println("불러올 파일이 없습니다.");
			list = new Contact[10];
			return;
		}
		//추후 파일 입출력을 배우면 불러오는 기능을 구현 
	}
		
		
	

}
