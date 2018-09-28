package com.example.quizuno.trikiandroid;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Comunicacion extends Thread{

    DatagramSocket ds;
    boolean conectado;

    public Comunicacion(DatagramSocket ds){
        this.ds = ds;
    }

    public void run(){
        while(true){
            if(!conectado){
                try {
                    ds = new DatagramSocket(5000);
                } catch (SocketException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void recibir() throws IOException {
        byte [] buf = new byte[64];
        DatagramPacket p = new DatagramPacket(buf, buf.length);
        ds.receive(p);

        ByteArrayInputStream bais = new ByteArrayInputStream(buf);
    }
}
