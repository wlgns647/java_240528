package day13.homework;

import java.awt.CheckboxGroup;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PhoneEx01 {

	/* 연락처 관리를 위한 프로그램을 만드세요.
	 * 메뉴
	 * 1. 연락처 추가
	 * 2. 연락처 수정
	 * 3. 연락처 삭제
	 * 4. 연락처 검색
	 * 5. 프로그램 종료
	 * 메뉴 선택 : 1
	 * ----------
	 * 이름 : 홍길동
	 * 번호 : 010-1231-2333
	 * ----------
	 * 등록이 완료됐습니다.
	 * ----------
	 * 메뉴
	 * 1. 연락처 추가
	 * 2. 연락처 수정
	 * 3. 연락처 삭제
	 * 4. 연락처 검색
	 * 5. 프로그램 종료
	 * 메뉴 선택 : 1
	 * ----------
	 * 이름 : 홍길동
	 * 번호 : 010-1234-2333
	 * ----------
	 * 등록이 완료됐습니다.
	 * ----------
	 * 메뉴
	 * 1. 연락처 추가
	 * 2. 연락처 수정
	 * 3. 연락처 삭제
	 * 4. 연락처 검색
	 * 5. 프로그램 종료
	 * 메뉴 선택 : 1
	 * ----------
	 * 이름 : 고길동
	 * 번호 : 010-1234-2333
	 * ----------
	 * 이미 등록된 번호입니다.
	 * ----------
	 * 메뉴
	 * 1. 연락처 추가
	 * 2. 연락처 수정
	 * 3. 연락처 삭제
	 * 4. 연락처 검색
	 * 5. 프로그램 종료
	 * 메뉴 선택 : 2
	 * ----------
	 * 이름 : 홍
	 * 1. 홍길동 : 010-1231-2333
	 * 2. 홍길동 : 010-1234-2333
	 * 번호 선택 : 1
	 * 이름 : 홍길동
	 * 번호 : 010-7894-5678
	 * -----------
	 * 수정이 완료됐습니다.
	 * -----------
	 * 메뉴
	 * 1. 연락처 추가
	 * 2. 연락처 수정
	 * 3. 연락처 삭제
	 * 4. 연락처 검색
	 * 5. 프로그램 종료
	 * 메뉴 선택 : 2
	 * ----------
	 * 이름 : 홍
	 * 1. 홍길동 : 010-7894-5678
	 * 2. 홍길동 : 010-1234-2333
	 * 번호 선택 : 1
	 * 이름 : 홍길동
	 * 번호 : 010-1234-2333
	 * -----------
	 * 이미 등록된 번호입니다.
	 * -----------
	 * 메뉴
	 * 1. 연락처 추가
	 * 2. 연락처 수정
	 * 3. 연락처 삭제
	 * 4. 연락처 검색
	 * 5. 프로그램 종료
	 * 메뉴 선택 : 4
	 * ----------
	 * 검색할 이름을 작성하세요(전체 검색 : 엔터) : 
	 * 1. 홍길동 : 010-7894-5678
	 * 2. 홍길동 : 010-1234-2333
	 * ----------
	 * 메뉴
	 * 1. 연락처 추가
	 * 2. 연락처 수정
	 * 3. 연락처 삭제
	 * 4. 연락처 검색
	 * 5. 프로그램 종료
	 * 메뉴 선택 : 3
	 * ----------
	 * 이름 : 홍
	 * 1. 홍길동 : 010-7894-5678
	 * 2. 홍길동 : 010-1234-2333
	 * 삭제할 번호 선택 : 1
	 * ----------
	 * 번호를 삭제했습니다.
	 * */
	
//	클래스(정적) 맴버변수로 스케너를 만들면 어디에서든 매개변수로 넘기지 않고 사용가능
public static Scanner scan = new Scanner(System.in);
public static void main(String[] args ) {
// 반복문 안에 들어가면 조건식에서 사용하지 못하기 떄문에 여기서 선언
		final int EXIT = 5;
		int menu = EXIT+1  ;
		Contact [] list = new Contact[10];
		int count = 0;
		do {
			 printMenu();  //메뉴 출력
			try {
				menu = scan.nextInt(); // 메뉴선택 
				System.out.println("-----------------------");
//				선택한 매뉴에 따른 기능실행
				count = runMenu(menu,list,count);
				System.out.println("-----------------------");
				}catch(InputMismatchException e) {
				System.out.println("메뉴를 잘못 입력 했습니다");
				scan.next(); 
//				메뉴를 잘못 선택했을때 입력버퍼에 남은값을 제거
				}catch(Exception e) {
					System.out.println(e.getMessage());
				}
		}while( menu != EXIT);
		
	}
	public static void printMenu() {
		System.out.println("* 메뉴 ");
		System.out.println("1. 연락처 추가 ");
		System.out.println("2. 연락처 수정 ");
		System.out.println("3. 연락처 삭제 ");
		System.out.println("4. 연락처 검색 ");
		System.out.println("5. 프로그램 종료 ");
		System.out.print("메뉴 선택: ");
	}
//	기능 : (연락처리스트,저장된개수) 이용하여 주어진 메뉴에 맞는 기능을 실행하고 연락처 개수를 반환하는 메소드
//	@param menu 주어진메뉴
//	@param list 연락처 리스트
//	@param count 저장된 개수
//	@return 저장된 개수( 추가시 +1, 삭제시 -1)
	
	
	/**
	 *  
	 * @param menu
	 * @param list
	 * @param count
	 * @return
	 * @throws Exception
	 */
	public static int runMenu(int menu, Contact []list, int count) throws Exception {
		switch(menu){
		case 1:
			count = insert( list,count);
			break;
		case 2:
			update(list,count);
//			 이름입력
			scan.nextLine(); // 공백처리 
			System.out.print("이름 : ");
			String name = scan.nextLine();
//			 연락처 리스트에서 이름과 일치하는 연락처를 번지+1번과 함깨 출력 
			printContact(list,count,name);
//			 번호선택 
			System.out.print("번호선택 : ");
			if(!printContact(list,count,name)) {
				break;
			}
			int index = scan.nextInt() -1;
//			 번호가 올바르지 않으면 잘못선택했습니다 하고 종료
			boolean res = checkContact(list,count,name,index);
			if(!res) {
				System.out.println("잘못 선택했습니다.");
				break;
			}
//			 올바르면 이름, 번호를 입력받음
			scan.nextLine();
			System.out.println("이름 : ");
			String newName = scan.nextLine();
			System.out.println("번호 : ");
			String newNumber = scan.nextLine();
//			 이름, 번호를 이용하여 객체를 생성
			Contact contact = new Contact(newName, newNumber);
//			 생성된 객체가 중복된 번호이면 안내문구 출력하고 아니면 객체를 추가 
			if(indexof(list, count, contact)>= 0 ) {
				System.out.println("이미 등록된 번호입니다. ");
				break;
			}
			list[index]= contact;
			break;
		case 3:
			count =delete(list,count);
			break;
		case 4: 
			search(list,count);
			break;
		case 5:
			break;
		default: System.out.println("잘못된 메뉴입니다.");
	}
		return count;
	}
	
	
	
	
	public static void search(Contact[] list, int count) {
		String name = scan.next("검색할 이름을 작성하세요(전체 검색 : 엔터) :  ");
		scan.nextLine();
		String name1 = scan.nextLine();
		printContact(list,count,name1);
		
		
}
		
	public static int delete(Contact[] list, int count) {
//		이름입력
		
		System.out.println("이름 : ");
		scan.nextLine();
		String name =scan.nextLine();
		if(!printContact(list,count,name)) {
			return count;
		}
		int index = scan.nextInt()-1;
		if(!checkContact(list,count,name,index)) {
			System.out.println("잘못 선택했습니다.");
			return count;
		}
//		이름과 일치하는 연락처들을 출력
//		번호를 선택
//		번호가 유효한지 확인해서 유효하지 않으면 안내문구 출력 후 종료
//		번호 삭제
//		해당 번지에서 앞으로 한칸씩 당겨줘야함
		
		if(index ==count) {
			list[index]= null;
			return count ;
			
		}
		//중간삭제
		Contact [] tmp = new Contact[list.length];
		
		System.arraycopy(tmp, index+1,list, index, count-index);
		
//		연락처 개수를 1감소 		
		list[count] = null;
		System.out.println("삭제했습니다. ");
		return count;
}
	private static boolean checkContact() {
		// TODO Auto-generated method stub
		return false;
	}
	/**
	 * 기능 : 연락처리스트에서 번지와 이름이 주어지면 유효한지를 알려주는 메소드
	 * @param list 연락처 리스트
	 * @param count 저장된 연락처 개수 
	 * @param name 확인하려는 이름
	 * @param index 번지
	 * @return 선택한 번지에 이름이 주어진 이름과 같은지 다른지를 반환
	 */
	public static boolean checkContact(Contact[] list, int count, String name, int index) {
		if(list == null|| count == 0) {
			return false;
		}
		if(index<0 || index>=count) {
			return false;
		}
		return list[index].getName().equals(name);
}
	public static void update(Contact[] list, int count) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
	
	/**
	 *  기능: 연락처에서 이름에 맞는 연락처를 출력하는 메소드
	 * @param list 연락처 리스트
	 * @param count 저장된 연락처 개수 
	 * @param 일치하는 연락처가 없으면 false 있으면 true 
	 */
	private static boolean printContact(Contact[] list, int count, String name) {
		if(list == null || count ==0) {
			System.out.println("등록된 연락처가 없습니다. ");
			return false;
		}
		int sameCount = 0; //이름과 일치하는 연락처 개수 
		for( int i= 0; i<count;i++) {
			if(list[i].getName().contains(name)) {
				System.out.println(i+1+"."+list[i].toString());
				sameCount++;
			}
		}
		if(sameCount ==0) {
			System.out.println("일치하는 연락처가 없습니다.");
			return false;
		}
		return true;
}
	public static int indexof(Contact[]list,int count,Contact contact) {
		if(list ==null || count == 0 ) {
			return -1;
		}
			for(int i = 0;i<count;i++) {
				if(list[i].equals(contact)) {
					return 1;
				}
			}
			return -1;
	}
	
	/**
	 * 연락처 리스트에 새 연락처를 입력받아 저장하는 메소드 
	 * @param list 연락처 리스트
	 * @param count 저장된 개수
	 * @return 저장된 개수 추가에 성공하면 count+1  아니면 count
	 * @throws Exception 전화번호를 잘못 입력한 경우
	 */
	
	public static int insert( Contact[] list, int count) throws Exception {
		scan.nextLine();
		System.out.println("이름: ");
		String name = scan.nextLine();
		System.out.println("번호: ");
		String number = scan.nextLine();
		Contact contact = new Contact(name, number);
		int index = indexof(list,count,contact);
		if (index>=0) {
			System.out.println("이미 등록된 번호입니다.");
			return count;
		}
		list[count]= contact;
		count++;
		System.out.println("등록이 완료되었습니다. ");
		
		return count; 
	}
}





class Contact{
	private String name;
	private String number;
	
	public Contact(String name, String number)throws Exception {
		this.name = name;
		setNumber(number);
	
	}	
	@Override    // 전화번호가 같으면 등록이 안되고 수정할 때도 있는 번호는 등록하면 안되기 떄문에
	public int hashCode() {
		return Objects.hash(number);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact other = (Contact) obj;
		return Objects.equals(number, other.number);
	}
	@Override    // 이름 번호 형태의 문자열이 필요할 떄 사용하기가 좋다 
	public String toString() {
		// 홍길동 : 010 1234 2333
		return name + " : " + number;
	}
	// getter & setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number)throws Exception {
		// 주어진 번호가 전화번호 형태가 아니면 예외를 발생 시키고 맞으면 번호에 저장 
		// 010 -1234-5678 또는 02-123-4567 또는 031=123=1234 형태의 문자열을 처리하기 위한 정규표현식
		
		String regex = "^\\d{2,3}-\\d{3,4}-\\d{4}$";
		if(!Pattern.matches(regex,number)) {
			throw new Exception("주어진 번호는 번호형태가 아닙니다");
		}
		this.number = number;
	}


	
 }

