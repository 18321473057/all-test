package org.line.learn.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerLine {
    public void send(){
        try {
            ServerSocket  serverSocket = new ServerSocket(8970);
            Socket socket = serverSocket.accept();
            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF("------ url="+socket.getInetAddress()+" port="+socket.getPort());
            dataOutputStream.writeUTF("this is my test socket!");

            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            System.out.println(dataInputStream.readUTF());
            System.out.println(dataInputStream.readUTF());

            serverSocket.close();
            socket.close();
            outputStream.close();
            dataOutputStream.close();
            inputStream.close();
            dataInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
