package ATM;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import program.Program;

public class AtmManager implements Program {

	// 이용자 정보 관리 리스트
	
	private List<Atm> atmList = new ArrayList<Atm>();
	private Scanner scan = new Scanner(System.in);
	final int EXIT = 6; // 중간에 종료하는 기능

	private void deposit() {
		System.out.println("입금할 계좌번호를 입력하세요");
		int num = nextInt();
		System.out.println("비밀번호를 입력하세요");
		int pw = nextInt();
	}

	private void withdraw() {
		// TODO Auto-generated method stub

	}

	private void bankAccount() {
		// TODO Auto-generated method stub

	}

	private void remittance() {
		// TODO Auto-generated method stub

	}

	private void opening() {
		System.out.print("본인 이름을 입력하세요: ");
		
		String AccountName = scan.nextLine();
		scan.nextLine();
		System.out.print("계좌 비밀번호를 입력하세요: ");
		int AccountPM = nextInt();
		scan.nextLine();
		//if();
		System.out.print("발급된 계좌번호입니다: ");
		int AccountNum1 = randomNum1();
		int AccountNum2 = randomNum2();
		int AccountNum3 = randomNum3();
		System.out.println(AccountNum1 + " - "+AccountNum2+" - "+AccountNum3);
		System.out.println("계좌개설이 완료되었습니다.");
		Atm Account = new Atm(AccountName,AccountPM,AccountNum1,AccountNum2,AccountNum3);
		atmList.add(Account);
	}

	@Override
	public void printMenu() {
		bar();
		System.out.println("1. 입금");
		System.out.println("2. 출금");
		System.out.println("3. 통장정리");
		System.out.println("4. 계좌개설");
		System.out.print("메뉴 선택: ");
		
		
	}

	@Override
	public void runMenu(int menu) throws Exception {

		switch (menu) {
		case 1:
			deposit(); // 입금
			break;
		case 2:
			withdraw(); // 출금
			break;
		case 3:
			bankAccount(); // 통장정리
			break;
			
		case 4:
			opening();// 계좌 개설
			break;
		case 5:
			break;
		}

	}

	@Override
	public void run() {
		int menu = 0;

		do {
			printMenu();

			menu = nextInt();
			bar();

			try {
				runMenu(menu);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (menu != EXIT);

	}

	// @return
	public int nextInt() {

		try {
			return scan.nextInt();
		} catch (InputMismatchException e) {
			scan.nextLine();
			return Integer.MIN_VALUE;
		}
	}

	public String next() {

		scan.next();
		return scan.next();
	}

	public int account() {
		return 0;
	}

	public static int randomNum1() {
		int min = 1000, max = 9999;
		int random = (int) (Math.random() * (max - min + 1)) + min;
		return random;
	}

	public static int randomNum2() {
		int min = 00, max = 99;
		int random = (int) (Math.random() * (max - min + 1)) + min;
		return random;
	}

	public static int randomNum3() {
		int min = 1000, max = 9999;
		int random = (int) (Math.random() * (max - min + 1)) + min;
		return random;

	}
	
	
	
	public static void bar() {
		System.out.println("===============================");
	}
	
	

}
