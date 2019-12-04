package org.line.learn.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketConsumeLine {
    public void comsume() {
        try {
            Socket socket = new Socket("127.0.0.1", 8970);
            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);

            System.out.println(dataInputStream.readUTF());
            System.out.println(dataInputStream.readUTF());

            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);

            dataOutputStream.writeUTF("url = " + socket.getInetAddress() + "port = " + socket.getPort());
            dataOutputStream.writeUTF("this is my write back!");
            socket.close();
            dataInputStream.close();
            outputStream.close();
            dataOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
