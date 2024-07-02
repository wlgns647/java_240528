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
	int money =0;
	String AccountName;
	
	private void deposit() {
	    System.out.println("계좌번호와 비밀번호를 입력하세요 (계좌번호는 xxx-yy-zzz 형식):");
	    //scan.nextLine();
	    String inputAccount = scan.next(); // 사용자로부터 계좌번호를 하나의 문자열로 입력받음
	    int pw = scan.nextInt(); // 비밀번호를 입력받음
	    //scan.nextLine();
	    // 입력받은 계좌번호를 하이픈(-)을 기준으로 분리하여 각 부분을 정수로 변환
	    String[] parts = inputAccount.split("-");
	    int num1 = Integer.parseInt(parts[0]);
	    int num2 = Integer.parseInt(parts[1]);
	    int num3 = Integer.parseInt(parts[2]);
	    System.out.println(atmList);
	    System.out.println(num1);
	    System.out.println(num2);
	    System.out.println(num3);
	    // 리스트에서 해당 계좌번호와 비밀번호가 일치하는 객체를 찾기
	    boolean found = false;
	    for (Atm account : atmList) {
	        if (account.getAccountNum1() == num1 && 
	            account.getAccountNum2() == num2 && 
	            account.getAccountNum3() == num3 &&
	            account.getAccountPM() == pw) {
	            found = true;
	            break;
	        }
	    }

	    if (found) {
	        
			System.out.println( AccountName +"님의 계좌에 입금하실 금액을 입력하세요:");
	        int amount = scan.nextInt();
	        money += amount;
	        System.out.println("입금이 완료되었습니다.");
	        System.out.println("잔액: " + money);
	    } else {
	        System.out.println("잘못된 계좌번호 또는 비밀번호입니다.");
	    }
	}


	private void withdraw() { //  출금 
		 System.out.println("계좌번호와 비밀번호를 입력하세요 (계좌번호는 xxx-yy-zzz 형식):");
		   scan.nextLine();  
		 String inputAccount = scan.next(); // 사용자로부터 계좌번호를 하나의 문자열로 입력받음
		    int pw = scan.nextInt(); // 비밀번호를 입력받음
		    scan.nextLine();
		    // 입력받은 계좌번호를 하이픈(-)을 기준으로 분리하여 각 부분을 정수로 변환
		    String[] parts = inputAccount.split("-");
		    int num1 = Integer.parseInt(parts[0]);
		    int num2 = Integer.parseInt(parts[1]);
		    int num3 = Integer.parseInt(parts[2]);


		    // 리스트에서 해당 계좌번호와 비밀번호가 일치하는 객체를 찾기
		    boolean found = false;
		    for (Atm account : atmList) {
		        if (account.getAccountNum1() == num1 && 
		            account.getAccountNum2() == num2 && 
		            account.getAccountNum3() == num3 &&
		            account.getAccountPM() == pw) {
		            found = true;
		            break;
		        }
		    }
		    if (found) {
		        System.out.println(AccountName+" 님 계좌에서 출금하실 금액을 입력하세요:");
		        int amount = scan.nextInt();
		        if((money -= amount) <= 0) {
		        	System.out.println("계좌잔액이 부족합니다 : "+money+" 원 ");
		        } else {
		        	money -= amount;
		        	System.out.println("출금이 완료되었습니다.");
		        	System.out.println("잔액: " + money);
		        }
		    } else {
		        System.out.println("잘못된 계좌번호 또는 비밀번호입니다.");
		    }
		}
		

	private void bankAccount() { // 동장정리  어제 안들은 강의에 파일에 저장 출력 예제 공부하고 적용해보자 

	}

	private void remittance() { // 송금기능 구현 가능하면 구현해보자  

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
		System.out.println(AccountNum1 + "-"+AccountNum2+"-"+AccountNum3);
		System.out.println("계좌개설이 완료되었습니다.");
		
		Atm Account = new Atm(AccountName,AccountNum1,AccountNum2,AccountNum3,AccountPM);
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
		int min = 10, max = 99;
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
