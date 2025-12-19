package com.todocodeacademy;

public class EnvioMoto implements Envio{

    @Override
    public void enviarPaquete() {
        System.out.println("Enviando paquete mediante Moto...");
    }
}
