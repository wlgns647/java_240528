package day21.socket2;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class serverMain {

    public static void main(String[] args) {
    	   String ip = "192.168.30.14";
           int port = 5001;
        String fileName = "src/day21/socket2/server.txt";

        try {
        	//1. 객체 생성 
            @SuppressWarnings("resource")
			ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("서버가 시작되었습니다.");
            //2. 무한루프
            while (true) {
            	//3. 소켓승
                // 클라이언트의 연결 요청을 기다림
                Socket socket = serverSocket.accept();
                System.out.println("클라이언트가 접속하였습니다.");

                //4. 클라이언트와 데이터 통신을 위한 스트림 생성
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

                //5.  클라이언트로부터 받은 문자열 처리
                String type = ois.readUTF();
              String message = (String) ois.readObject();
             //  System.out.println("받은 메시지: " + message);
                // 받은 메시지가 "save"일 경우 save 메소드 실행
                if ("save".equals(message)) {
                    save(fileName, ois);
                }

                // 스트림과 소켓 닫기
                ois.close();
                oos.close();
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void save(String fileName, ObjectInputStream ois) {
        try {
            // ois를 통해 연락처 리스트를 가져옴
            Object object = ois.readObject();
            // 연락처 리스트를 파일에 저장하는 코드를 작성
            // 예: FileWriter, BufferedWriter 등을 사용하여 파일에 쓰기
            System.out.println("연락처를 파일에 저장하였습니다.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
