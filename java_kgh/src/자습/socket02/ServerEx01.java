package 자습.socket02;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;
import java.util.List;

public class ServerEx01 {

	// 클라이언트가 연결되면 클라이언트에서 보낸 값을 입력받고 
	// 서버에서 클라이언트에게 값을 전송하고 종료
	public static void main(String[] args) {
		// 1. 포트번호 설정
		int port =5001;
		
		// 2. 전송할 리스트 생성 
		List<String> list = Arrays.asList("강지훈","복습중","-1");
		// Arrays 배열의 매서드 제공 toString 배열 내용을 반환함 
		
		// 3. 서버용 소켓 객체 생성후 애러발생할수 있어 마우스 호버후 서라운드 생성 
		try {
			ServerSocket serverSocket = new ServerSocket(port);
			System.out.println("[대기중]");
			
			
			//5. 요청 수락후 소켓 객체를 생성 
			Socket socket = serverSocket.accept();
			System.out.println("[연결성공]");
			
			//6. 클라이언트에서 보낸 문자열들을 읽어옴
			InputStream is =socket.getInputStream();
			ObjectInputStream ois = new ObjectInputStream(is);
			// is 로부터 데이터를 읽어와서 자바객체로 변환 
			
			//7. 클라이언트에서 보낸 문자열이 -1 이면 종료
			while(true) {
				String str = ois.readUTF();
				//UTF로 인코딩 된 문자열을 읽고 저장 
				if(str.equals("-1")) {
					break;
					//클라이언트에서 보낸 문자열이 -1이면 읽기 종료
				}
				System.out.println("클라이언트에서 보낸 문자열:"+ str);
			}
			System.out.println("[수신성공]");
			
			//9. 서버에서 클라이언트로 문자열 전송
			OutputStream os = socket.getOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(os);
			
			for(String tmp : list) {
				oos.writeUTF(tmp);
			}
			oos.flush();
			// 출력버퍼에 남아있으면 전송
			System.out.println("[전송성공]");
			oos.close();
			//닫아줌 
			//8.읽는 코드 닫아줌 
			ois.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
