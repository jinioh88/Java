package Networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TCPIpClient {
    public static void main(String[] args) {
        try{
            String serverIp = "127.0.0.1";
            System.out.println("서버에 연결중...");

            Socket socket = new Socket(serverIp,7778);


            // 입력 스트림 얻기
            InputStream in = socket.getInputStream();
            DataInputStream ds = new DataInputStream(in);

            System.out.println("서버로부터 받은 메시지 : "+ds.readUTF());
            System.out.println("Bye~!");

            ds.close();
            socket.close();
        }catch(ConnectException ce){ce.printStackTrace();
        }catch(IOException ie){
            ie.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
