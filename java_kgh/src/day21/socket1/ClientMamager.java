package day21.socket1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import program.Program;

//명언을 관리하는 프로그램
public class ClientMamager implements Program {

	private Scanner scan = new Scanner(System.in);

	private String fileName = "src/day21/socket1/client.txt";

	private List<String> list = new ArrayList<String>();

	private String ip = "192.168.30.18";

	private int port = 5001;

	@Override
	public void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 속담 추가\n2. 속담 삭제\n3. 종료");
		System.out.print("메뉴 선택 : ");
	}

	@Override
	public void runMenu(int menu) throws Exception {
		switch (menu) {
		case 1:
			insert();
			break;
		case 2:
			delete();
			break;
		case 3:
			print();
			break;
		}
	}

	private void insert() {
		// 속담입력
		System.out.println(" 속담: ");
		scan.nextLine();
		String contents = scan.nextLine();
		// 입력된 속담인지 확인해서 없으면 추가 후 알림
		if (!list.contains(contents.trim())) {
			list.add(contents.trim());
			System.out.println("속담을 추가했습니다.");
		}

	}

	private void print() {
		if(list.size()==0) {
			System.out.println("등록된 속담이 없습니다.");
			return;
		}
		for(int i =0;i<list.size();i++) {
			System.out.println(i+1+"."+list.get(i));
		}
	}

	private void delete() {
		// 솓담출력
		print();
		//속담선택
		System.out.println("삭제할 속담 선택: ");
		int index = scan.nextInt() -1;
		//속담을 삭제
		try {
			list.remove(index);
			System.out.println("속담을 삭제했습니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 속담을 선택했습니다.");
		}
		
	}

	@Override
	public void run() {
		int menu = 1;
		load();
		do {
			printMenu();
			menu = scan.nextInt();
			try {
				runMenu(menu);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (menu != 3);
		list.add("가는 말이 고와야 오는 말이 곱다.");
		list.add("누워서 떡 먹기");
		list.add("윗 물이 맑아야 아랫물이 맑다.");
		save();
	}

	@SuppressWarnings("unchecked")
	public void load() {
		try {
			Socket socket = new Socket(ip, port);
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeUTF("load");
			oos.flush();
			ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
			list = (List<String>) ois.readObject();
			System.out.println(list);
		} catch (Exception e) {
			load(fileName);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void load(String fileName) {
		try (FileInputStream fis = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(fis)) {

			list = (List<String>) ois.readObject();
		} catch (Exception e) {

		}
	}

	@SuppressWarnings("unchecked")
	public void save() {
		try {
			Socket socket = new Socket(ip, port);
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeUTF("save");
			oos.writeObject(list);
			oos.flush();

		} catch (Exception e) {
		} finally {
			save(fileName);
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public void save(String fileName) {
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			oos.writeObject(list);
			oos.flush();
		} catch (Exception e) {

		}
	}

}
