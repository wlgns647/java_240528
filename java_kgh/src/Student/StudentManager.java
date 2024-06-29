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





















