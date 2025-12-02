package com.todocodeacademy;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //1er módulo
        System.out.println("Módulo de Autenticación");
        Configuracion config1 = Configuracion.getInstancia();
        config1.mostrarMensaje();

        //2do módulo
        System.out.println("Módulo de Reportes");
        Configuracion config2 = Configuracion.getInstancia();
        config2.mostrarMensaje();

        //Comprobación
        System.out.println("¿Ambas referencias en memoria, son iguales?");
        System.out.println(config1==config2); //debería devolver true
        System.out.println(config1);
        System.out.println(config2);
    }
}