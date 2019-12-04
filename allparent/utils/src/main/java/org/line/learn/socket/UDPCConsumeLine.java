package org.line.learn.socket;



import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

public class UDPCConsumeLine {

    public static void main(String[] args) {

        try {
            InetSocketAddress inetSocketAddress = new InetSocketAddress("127.0.0.1", 8972);
            DatagramSocket datagramSocket = new DatagramSocket(inetSocketAddress);
            byte[] b = new byte[10];
            DatagramPacket datagramPacket = new DatagramPacket(b,10);
            datagramSocket.receive(datagramPacket);
            System.out.println(new String(b,"UTF-8"));
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
