package Networking;

import java.io.*;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;

/*
  쓰레드 적용.
 */
public class TCPIpServer2 implements Runnable {
    ServerSocket serverSocket = null;
    Thread[] threads;

    public TCPIpServer2(int num) {
        try{
            serverSocket = new ServerSocket(7778);
            System.out.println("서버 준비 완료!");
            threads = new Thread[num];
        }catch(IOException e){e.printStackTrace();}
    }

    public void start(){
        for(int i=0;i<threads.length;i++){
            threads[i] = new Thread(this);
            threads[i].start();
        }
    }

    public static void main(String[] args) {

        TCPIpServer2 server = new TCPIpServer2(5);
        server.start();
    }

    public void run() {
        while(true){
            try{
                System.out.println("연결 기다리는중..."); // 서버소켓은 클라이언트 요청이 있을때 까지 기다림
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
