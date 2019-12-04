package org.line.learn.socket;


import java.io.IOException;
import java.net.*;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;

public class UDPServerLine {

    public static void main(String[] args) {

        try {
            InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8972);
            DatagramSocket datagramSocket = new DatagramSocket();
            byte[] bytes = "我是UDP".getBytes();
            DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, inetSocketAddress);
            datagramSocket.send(datagramPacket);
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
