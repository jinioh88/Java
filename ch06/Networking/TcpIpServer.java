package Networking;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

public class TcpIpServer {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;

        try{
            serverSocket = new ServerSocket(7777);
            System.out.println("서버 준비 완료!");
        } catch(IOException e){e.printStackTrace();}

        while(true){
            try{
                System.out.println("연결 기다리는중..."); // 서버소켓은 클라이언트 요청이 있을때 까지 기다림
                serverSocket.setSoTimeout(5000);  // 클라이언트 5초 기다림. 없으면 익셉션발생(SocketTimeoutException)
                Socket socket = serverSocket.accept();
                System.out.println(socket.getInetAddress()+"로부터 연결요청!");

                // 소켓 출력 스트림 얻기
                OutputStream out = socket.getOutputStream();
                DataOutputStream dos = new DataOutputStream(out);

                dos.writeUTF("서버로 부터 메시지");
                System.out.println("데이터 전송 완료!");

                dos.close();;
                socket.close();
            }catch(SocketTimeoutException se){se.printStackTrace();
            }catch(IOException e){e.printStackTrace();}
        }
    }
}
