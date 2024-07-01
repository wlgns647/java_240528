package Student;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import day11.Student;
import program.Program;

public class StudentManager implements Program {
	

	private List<Student> list = new ArrayList<Student>();
	private Scanner scan = new Scanner(System.in);
	
	
	
	@Override
	public void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 성적관리");
		System.out.println("2. 메뉴관리");
		System.out.println("3. 종료");
		System.out.print("메뉴 선택: ");
		
	}


	@Override
	public void run() {
		int menu = 0;
		
		do {
			printMenu();
			menu = nextInt(); 
			try {
				runMenu(menu);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}while(menu != 1);
		
	}

	public int nextInt() { 
		try {
			return scan.nextInt();
		}catch (InputMismatchException e) {
			scan.nextLine();
			return Integer.MIN_VALUE; 
		}
		
	}
	
	
	
	
	@Override
	public void runMenu(int menu) throws Exception {
		
	}
	
}





















