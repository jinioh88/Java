package Networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpServer {
    HashMap clients;

    TcpServer() {
        clients = new HashMap();
        Collections.synchronizedMap(clients);
    }

    public void start(){
        ServerSocket serverSocket = null;
        Socket socket = null;

        try{
            serverSocket = new ServerSocket(7777);
            System.out.println("서버 시작!");

            while(true){
                socket =  serverSocket.accept();
                System.out.println("["+socket.getInetAddress()+"] 접속");
                ServerReceiver thread = new ServerReceiver(socket);
                thread.start();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }

    void sendToAll(String msg) {
        Iterator it = clients.keySet().iterator();

        while(it.hasNext()){
            try{
                DataOutputStream out = (DataOutputStream)clients.get(it.next());
                out.writeUTF(msg);
            } catch(IOException e){}
        }
    }

    public static void main(String[] args) {
        new TcpServer().start();
    }

    class ServerReceiver extends Thread {
        Socket socket;
        DataInputStream in;
        DataOutputStream out;

        public ServerReceiver(Socket socket) {
            this.socket = socket;
            try{
                in = new DataInputStream(socket.getInputStream());
                out = new DataOutputStream(socket.getOutputStream());
            }catch(IOException e){}
        }

        public void run() {
            String name = "";

            try{
                name = in.readUTF();
                sendToAll("#"+name+"님 입장.");
                clients.put(name,out);
                System.out.println("현재 접속자 수 : "+clients.size());

                while(in!=null){
                    sendToAll(in.readUTF());
                }
            } catch(IOException e){e.printStackTrace();
            } finally {
                sendToAll("#"+name+"님이 나감.");
                clients.remove(name);
                System.out.println(socket.getInetAddress()+"에서 접속 종료");
                System.out.println("현재 접속자 수는 "+clients.size());
            }
        }
    }
}

