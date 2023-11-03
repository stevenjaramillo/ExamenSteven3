package com.corenetworks.modelo;

import java.util.Arrays;

public class Servidor {
    private  String ip;

    //

    public String []PaqueteLeer;
    public boolean []PaqueteVErificar ;

    @Override
    public String toString() {
        return "Servidor{" +
                "ip='" + ip + '\'' +
                ", PaqueteLeer=" + Arrays.toString(PaqueteLeer) +
                ", PaqueteVErificar=" + Arrays.toString(PaqueteVErificar) +
                '}';
    }

    //


    public Servidor() {
    }

    public Servidor(String ip, String[] paqueteLeer, boolean[] paqueteVErificar) {
        this.ip = ip;
        PaqueteLeer = paqueteLeer;
        PaqueteVErificar = paqueteVErificar;
    }


    // set get


    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String[] getPaqueteLeer() {
        return PaqueteLeer;
    }

    public void setPaqueteLeer(String[] paqueteLeer) {
        PaqueteLeer = paqueteLeer;
    }

    public boolean[] getPaqueteVErificar() {
        return PaqueteVErificar;
    }

    public void setPaqueteVErificar(boolean[] paqueteVErificar) {
        PaqueteVErificar = paqueteVErificar;
    }
}
