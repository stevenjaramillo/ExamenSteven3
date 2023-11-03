package com.corenetworks.presentacion;

import com.corenetworks.modelo.Ejercicio2;
import com.sun.source.tree.NewArrayTree;

import java.util.Scanner;

public class PruebaEjercicio2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Ejercicio2 e1 = new Ejercicio2();
        System.out.println("Por favor introduzca la ip de origen");
        e1.setDireccionIpOrigenrigen(teclado.nextLine());
        System.out.println("Por favor introduzca la ip de destino");
        e1.setDireccionIDestino(teclado.nextLine());
        System.out.println("Por favor introduzca el mensaje");
        e1.setMensaje(teclado.nextLine());

        System.out.println(e1.toString());
        int contadorPaquetes = e1.getMensaje().length() / 20;
        if (e1.getMensaje().length() % 20 != 0) {
            contadorPaquetes++;
        }

        e1.setContadorPaquetes(contadorPaquetes);

        for (int i = 0; i < contadorPaquetes; i++) {
            int startIndex = i * 20;
            int endIndex = Math.min((i + 1) * 20, e1.getMensaje().length());
            String subMensaje = e1.getMensaje().substring(startIndex, endIndex);
        }


        System.out.println(e1.toString());

    }
}