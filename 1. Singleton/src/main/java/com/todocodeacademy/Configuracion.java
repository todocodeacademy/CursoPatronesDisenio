package com.todocodeacademy;

public class Configuracion {

    // 3 partes de un Singleton
    // Una variable estática = constante
    private static Configuracion instancia;

    // Una clase con constructor privado
    private Configuracion () {
        System.out.println("Inicializando configuración en el sistema");
    }

    // Un  método público que sea estático
    public static Configuracion getInstancia() {
        if (instancia == null) {
            instancia = new Configuracion();
        }
        return instancia;
    }

    //opcional
    //Método del Singleton
    public void mostrarMensaje() {
        System.out.println("Configuración Activa ✅");
    }


}
