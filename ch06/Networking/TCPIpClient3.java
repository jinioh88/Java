package Networking;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class TCPIpClient3 {
    public static void main(String[] args) {
        try{
            String serverIp = "127.0.0.1";
            Socket socket = new Socket(serverIp,7777);
            System.out.println("연결성공!");

            Sender sender = new Sender(socket);
            Receiver receiver = new Receiver(socket);

            sender.start();
            receiver.start();
        }catch(ConnectException ce){ce.printStackTrace();
        }catch(IOException ie){
            ie.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
