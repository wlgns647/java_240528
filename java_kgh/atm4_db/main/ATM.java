package atm4_db.main;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ATM {
	private Scanner scan = new Scanner(System.in);
	private String ip = "192.168.30.4";
	private int port = 5001;
	private void printMenu() {
		System.out.print(
				"================ATM================\n"
				+ "1. 계좌개설   2. 계좌해지   3. 비밀번호 변경\n"
				+ "4. 입금      5. 출금     6. 송금\n"
				+ "7. 통장조회   8. 업무종료   선택 : ");
	}
	private void runMenu(int menu) {
		System.out.println("------------------------------");
		A:switch(menu) {
		case 1:
			try {
				Socket socket = new Socket(ip, port);
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				oos.writeUTF("insert");
				oos.flush();
				
				String ac_name = "";
				do {
					System.out.print("예금주명 : ");
					ac_name = scan.next();
					String regex = "^[가-힣]{2,4}$";
					if(!Pattern.matches(regex, ac_name)) {
						System.out.println("잘못된 이름입니다. 다시 입력하세요.");
						continue;
					}
					break;
				}while(true);
				oos.writeUTF(ac_name);
				oos.flush();
				String ac_pw = "";
				do {
					System.out.print("비밀번호(4자리) : ");
					ac_pw = scan.next();
					String regex = "^\\d{4}$";
					if(!Pattern.matches(regex, ac_pw)) {
						System.out.println("잘못된 비밀번호 형식입니다. 다시 입력하세요.");
						continue;
					}
					break;
				}while(true);
				oos.writeUTF(ac_pw);
				oos.flush();
				String ac_num = ois.readUTF();
				System.out.println("계좌를 개설중입니다...");
				Thread.sleep(1000);
				System.out.println("계좌를 개설했습니다.");
				System.out.println("KH은행 "+ac_num+"(예금주:"+ac_name+") 잔고 : 0원");
				System.out.println("------------------------------");
				break;
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		case 2:
			try {
				Socket socket = new Socket(ip, port);
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				oos.writeUTF("remove");
				oos.flush();
				
				String ac_num = "";
				do {
					System.out.print("계좌번호 : ");
					ac_num = scan.next();
					String regex = "^1010-\\d{4}$";
					if(!Pattern.matches(regex, ac_num)) {
						System.out.println("잘못된 계좌번호입니다. 다시 입력하세요.");
						continue;
					}
					break;
				}while(true);
				oos.writeUTF(ac_num);
				oos.flush();
				String result = ois.readUTF();
				if(result.equals("없는 계좌입니다.")) {
					System.out.println(result);
					break;
				}
				String ac_pw = "";
				do {
					System.out.print("비밀번호(메뉴로 돌아가기 : 0) : ");
					ac_pw = scan.next();
					oos.writeUTF(ac_pw);
					oos.flush();
					result = ois.readUTF();
					if(result.equals("메뉴로 돌아갑니다.")) {
						System.out.println(result);
						System.out.println("------------------------------");
						break A;
					}
					if(result.equals("잘못된 비밀번호입니다. 다시 입력하세요.")) {
						System.out.println(result);
						continue;
					}
					break;
				}while(true);
				System.out.println("------------------------------");
				System.out.println("계좌를 해지중입니다...");
				Thread.sleep(1000);
				System.out.println("계좌를 해지했습니다.");
				System.out.println("------------------------------");
				break;
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		case 3:
			try {
				Socket socket = new Socket(ip, port);
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				oos.writeUTF("update");
				oos.flush();
				
				String ac_num = "";
				do {
					System.out.print("계좌번호 : ");
					ac_num = scan.next();
					String regex = "^1010-\\d{4}$";
					if(!Pattern.matches(regex, ac_num)) {
						System.out.println("잘못된 계좌번호입니다. 다시 입력하세요.");
						continue;
					}
					break;
				}while(true);
				oos.writeUTF(ac_num);
				oos.flush();
				String result = ois.readUTF();
				if(result.equals("없는 계좌입니다.")) {
					System.out.println(result);
					break;
				}
				String ac_pw = "";
				do {
					System.out.print("비밀번호(메뉴로 돌아가기 : 0) : ");
					ac_pw = scan.next();
					oos.writeUTF(ac_pw);
					oos.flush();
					result = ois.readUTF();
					if(result.equals("메뉴로 돌아갑니다.")) {
						System.out.println(result);
						System.out.println("------------------------------");
						break A;
					}
					if(result.equals("잘못된 비밀번호입니다. 다시 입력하세요.")) {
						System.out.println(result);
						continue;
					}
					break;
				}while(true);
				System.out.println("------------------------------");
				ac_pw = "";
				do {
					System.out.print("변경할 비밀번호(4자리) : ");
					ac_pw = scan.next();
					String regex = "^\\d{4}$";
					if(!Pattern.matches(regex, ac_pw)) {
						System.out.println("잘못된 비밀번호 형식입니다. 다시 입력하세요.");
						continue;
					}
					break;
				}while(true);
				oos.writeUTF(ac_pw);
				oos.flush();
				result = ois.readUTF();
				if(result.equals("동일한 비밀번호입니다.")) {
					System.out.println(result);
					break;
				}
				System.out.println("비밀번호를 변경중입니다...");
				Thread.sleep(1000);
				System.out.println("비밀번호를 변경했습니다.");
				System.out.println("------------------------------");
				break;
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		case 4:
			try {
				Socket socket = new Socket(ip, port);
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				oos.writeUTF("deposit");
				oos.flush();
				
				String str = "";
				do {
					System.out.print("입금할 금액 : ");
					str = scan.next();
					String regex = "^\\d{0,9}$";
					if(!Pattern.matches(regex, str)) {
						System.out.println("올바른 금액을 입력하세요.");
						continue;
					}
					break;
				}while(true);
				int deposit = Integer.parseInt(str);
				oos.writeInt(deposit);
				oos.flush();
				String result = ois.readUTF();
				if(result.equals(deposit+"원은 입금할 수 없습니다.")) {
					System.out.println(result);
					break;
				}
				String ac_num = "";
				do {
					System.out.print("계좌번호 : ");
					ac_num = scan.next();
					String regex = "^1010-\\d{4}$";
					if(!Pattern.matches(regex, ac_num)) {
						System.out.println("잘못된 계좌번호입니다. 다시 입력하세요.");
						continue;
					}
					break;
				}while(true);
				oos.writeUTF(ac_num);
				oos.flush();
				result = ois.readUTF();
				if(result.equals("없는 계좌입니다.")) {
					System.out.println(result);
					break;
				}
				System.out.println("------------------------------");
				System.out.println("입금중입니다...");
				Thread.sleep(1000);
				System.out.println(deposit+"원을 입금하였습니다.");
				result = ois.readUTF();
				System.out.println(result);
				System.out.println("------------------------------");
				System.out.print("돌아가려면 엔터를 입력하세요.");
				scan.nextLine();
				String enter = scan.nextLine();
				if(enter.equals("\n")) {
					break;
				}
				break;
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		case 5:
			try {
				Socket socket = new Socket(ip, port);
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				oos.writeUTF("withdraw");
				oos.flush();
				
				String ac_num = "";
				do {
					System.out.print("계좌번호 : ");
					ac_num = scan.next();
					String regex = "^1010-\\d{4}$";
					if(!Pattern.matches(regex, ac_num)) {
						System.out.println("잘못된 계좌번호입니다. 다시 입력하세요.");
						continue;
					}
					break;
				}while(true);
				oos.writeUTF(ac_num);
				oos.flush();
				String result = ois.readUTF();
				if(result.equals("없는 계좌입니다.")) {
					System.out.println(result);
					break;
				}
				String ac_pw = "";
				do {
					System.out.print("비밀번호(메뉴로 돌아가기 : 0) : ");
					ac_pw = scan.next();
					oos.writeUTF(ac_pw);
					oos.flush();
					result = ois.readUTF();
					if(result.equals("메뉴로 돌아갑니다.")) {
						System.out.println(result);
						System.out.println("------------------------------");
						break A;
					}
					if(result.equals("잘못된 비밀번호입니다. 다시 입력하세요.")) {
						System.out.println(result);
						continue;
					}
					break;
				}while(true);
				result = ois.readUTF();
				if(result.equals("잔액이 0원이므로 출금할 수 없습니다.")) {
					System.out.println(result);
					break;
				}
				System.out.println("------------------------------");
				int withdraw = 0;
				result = ois.readUTF();
				String str = "";
				do {
					System.out.print(result);
					str = scan.next();
					String regex = "^\\d{0,9}$";
					if(!Pattern.matches(regex, str)) {
						System.out.println("올바른 금액을 입력하세요.");
						continue;
					}
					break;
				}while(true);
				withdraw = Integer.parseInt(str);
				oos.writeInt(withdraw);
				oos.flush();
				result = ois.readUTF();
				if(result.equals(withdraw+"원은 출금할 수 없습니다.")){
					System.out.println(result);
					break;
				}
				System.out.println("출금중입니다...");
				Thread.sleep(1000);
				System.out.println(withdraw+"원을 출금하였습니다.");
				result = ois.readUTF();
				System.out.println(result);
				System.out.println("------------------------------");
				System.out.print("돌아가려면 엔터를 입력하세요.");
				scan.nextLine();
				String enter = scan.nextLine();
				if(enter.equals("\n")) {
					break;
				}
				break;
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		case 6:
			try {
				Socket socket = new Socket(ip, port);
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				oos.writeUTF("transfer");
				oos.flush();
				
				String ac_num = "";
				do {
					System.out.print("계좌번호 : ");
					ac_num = scan.next();
					String regex = "^1010-\\d{4}$";
					if(!Pattern.matches(regex, ac_num)) {
						System.out.println("잘못된 계좌번호입니다. 다시 입력하세요.");
						continue;
					}
					break;
				}while(true);
				oos.writeUTF(ac_num);
				oos.flush();
				String result = ois.readUTF();
				if(result.equals("없는 계좌입니다.")) {
					System.out.println(result);
					break;
				}
				String ac_pw = "";
				do {
					System.out.print("비밀번호(메뉴로 돌아가기 : 0) : ");
					ac_pw = scan.next();
					oos.writeUTF(ac_pw);
					oos.flush();
					result = ois.readUTF();
					if(result.equals("메뉴로 돌아갑니다.")) {
						System.out.println(result);
						System.out.println("------------------------------");
						break A;
					}
					if(result.equals("잘못된 비밀번호입니다. 다시 입력하세요.")) {
						System.out.println(result);
						continue;
					}
					break;
				}while(true);
				result = ois.readUTF();
				if(result.equals("잔액이 0원이므로 송금할 수 없습니다.")) {
					System.out.println(result);
					break;
				}
				System.out.println("------------------------------");
				String search = "";
				do {
					System.out.print("송금할 계좌번호 혹은 예금주명 : ");
					search = scan.next();
					String regex = "^[가-힣]{1,4}$";
					String regex2 = "^1010-\\d{4}$";
					if(!Pattern.matches(regex, search) && !Pattern.matches(regex2, search)) {
						System.out.println("잘못된 계좌번호 혹은 이름입니다. 다시 입력하세요.");
						continue;
					}
					break;
				}while(true);
				oos.writeUTF(search);
				oos.flush();
				result = ois.readUTF();
				if(result.equals("송금할 계좌가 없습니다.")) {
					System.out.println(result);
					break;
				}
				int size = ois.readInt();
				for(int i = 0; i < size; i++) {
					result = ois.readUTF();
					System.out.println(result);
				}
				System.out.print("송금할 계좌 선택 : ");
				int index = scan.nextInt() - 1;
				oos.writeInt(index);
				oos.flush();
				int transfer = 0;
				result = ois.readUTF();
				if(result.equals("번호를 잘못선택했습니다.")) {
					System.out.println(result);
					break;
				}
				String str = "";
				do {
					System.out.print(result);
					str = scan.next();
					String regex = "^\\d{0,9}$";
					if(!Pattern.matches(regex, str)) {
						System.out.println("올바른 금액을 입력하세요.");
						continue;
					}
					break;
				}while(true);
				transfer = Integer.parseInt(str);
				oos.writeInt(transfer);
				oos.flush();
				result = ois.readUTF();
				if(result.equals(transfer+"원은 송금할 수 없습니다.")) {
					System.out.println(result);
					break;
				}
				System.out.println("송금중입니다...");
				Thread.sleep(1000);
				System.out.println(transfer+"원을 송금하였습니다.");
				result = ois.readUTF();
				System.out.println(result);
				System.out.println("------------------------------");
				System.out.print("돌아가려면 엔터를 입력하세요.");
				scan.nextLine();
				String enter = scan.nextLine();
				if(enter.equals("\n")) {
					break;
				}
				break;
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		case 7:
			try {
				Socket socket = new Socket(ip, port);
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				oos.writeUTF("check");
				oos.flush();
				
				String ac_num = "";
				do {
					System.out.print("계좌번호 : ");
					ac_num = scan.next();
					String regex = "^1010-\\d{4}$";
					if(!Pattern.matches(regex, ac_num)) {
						System.out.println("잘못된 계좌번호입니다. 다시 입력하세요.");
						continue;
					}
					break;
				}while(true);
				oos.writeUTF(ac_num);
				oos.flush();
				String result = ois.readUTF();
				if(result.equals("없는 계좌입니다.")) {
					System.out.println(result);
					break;
				}
				String ac_pw = "";
				do {
					System.out.print("비밀번호(메뉴로 돌아가기 : 0) : ");
					ac_pw = scan.next();
					oos.writeUTF(ac_pw);
					oos.flush();
					result = ois.readUTF();
					if(result.equals("메뉴로 돌아갑니다.")) {
						System.out.println(result);
						System.out.println("------------------------------");
						break A;
					}
					if(result.equals("잘못된 비밀번호입니다. 다시 입력하세요.")) {
						System.out.println(result);
						continue;
					}
					break;
				}while(true);
				result = ois.readUTF();
				System.out.println(result);
				System.out.println("통장을 조회중입니다...");
				Thread.sleep(1000);
				System.out.println("========================통장내역========================");
				int size = ois.readInt();
				for(int i = 0; i < size; i++) {
					result = ois.readUTF();
					System.out.println(result);
				}
				System.out.println("=====================================================");
				System.out.print("돌아가려면 엔터를 입력하세요.");
				scan.nextLine();
				String enter = scan.nextLine();
				if(enter.equals("\n")) {
					break;
				}
				break;
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		case 8:
			try {
				Socket socket = new Socket(ip, port);
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				oos.writeUTF("end");
				oos.flush();
				String result = ois.readUTF();
				System.out.println(result);
				System.out.println("------------------------------");
				break;
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		default:
			try {
				Socket socket = new Socket(ip, port);
				ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
				oos.writeUTF("");
				oos.flush();
				System.out.println("잘못된 메뉴입니다.");
				System.out.println("------------------------------");
			} catch (UnknownHostException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	public void run() {
		int menu = 0;
		do {
			printMenu();
			menu = scan.nextInt();
			runMenu(menu);
		}while(menu != 8);
	}
}