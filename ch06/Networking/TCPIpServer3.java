package Networking;
/*
  소켓으로 데이터 송수신 작업 쓰레드로해 송수신 동시에.
  1:1 채팅 가능해짐!!.
 */
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Scanner;

/*
  쓰레드 적용.
 */
public class TCPIpServer3 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        try{
            serverSocket = new ServerSocket(7777);
            System.out.println("서버 준비 완료!");
            socket = serverSocket.accept();

            Sender sender = new Sender(socket);
            Receiver receiver = new Receiver(socket);

            sender.start();
            receiver.start();
        } catch(IOException e){e.printStackTrace();}

    }
}

class Sender extends Thread {
    Socket socket;
    DataOutputStream out;
    String name ;

    Sender(Socket socket){
        this.socket = socket;
        try{
            out = new DataOutputStream(socket.getOutputStream());
            name = "[" + socket.getInetAddress()+":"+socket.getPort()+"]";
        }catch(Exception e){}
    }

    public void run() {
        Scanner sc = new Scanner(System.in); // ????
        while(out!=null){
            try{
                out.writeUTF(name+sc.nextLine());
            }catch(IOException e){}
        }
    }
}

class Receiver extends Thread {
    Socket socket;
    DataInputStream in;

    public Receiver(Socket socket) {
        this.socket = socket;
        try{
            in = new DataInputStream(socket.getInputStream());
        }catch(IOException e){}
    }

    public void run(){
        while(in!=null){
            try{
                System.out.println(in.read());
            }catch(IOException e){}
        }
    }
}