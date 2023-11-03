package com.corenetworks.modelo;

public class Ejercicio2 {
    //Atributos
    private String direccionIpOrigenrigen;
    private String direccionIDestino;
    private String mensaje;
    private int contadorPaquetes;

    //metodo

    @Override
    public String toString() {
        return "Ejercicio2{" +
                "direccionIpOrigenrigen='" + direccionIpOrigenrigen + '\'' +
                ", direccionIDestino='" + direccionIDestino + '\'' +
                ", mensaje='" + mensaje + '\'' +
                ", contadorPaquetes=" + contadorPaquetes +
                '}';
    }


    //Constructores


    public Ejercicio2() {
    }

    public Ejercicio2(String direccionIpOrigenrigen, String direccionIDestino, String mensaje, int contadorPaquetes) {
        this.direccionIpOrigenrigen = direccionIpOrigenrigen;
        this.direccionIDestino = direccionIDestino;
        this.mensaje = mensaje;
        this.contadorPaquetes = contadorPaquetes;
    }

    // set get


    public String getDireccionIpOrigenrigen() {
        return direccionIpOrigenrigen;
    }

    public void setDireccionIpOrigenrigen(String direccionIpOrigenrigen) {
        this.direccionIpOrigenrigen = direccionIpOrigenrigen;
    }

    public String getDireccionIDestino() {
        return direccionIDestino;
    }

    public void setDireccionIDestino(String direccionIDestino) {
        this.direccionIDestino = direccionIDestino;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public int getContadorPaquetes() {
        return contadorPaquetes;
    }

    public void setContadorPaquetes(int contadorPaquetes) {
        this.contadorPaquetes = contadorPaquetes;
    }
}