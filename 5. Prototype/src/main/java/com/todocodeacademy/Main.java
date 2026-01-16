package com.todocodeacademy;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // 1 - Crear un prototipo base ("plantilla" de nuestra pizza)
        PedidoPizza prototipoMuzza = new PedidoPizza (
                "grande",
                "normal",
                List.of("muzarella", "salsa de tomate")
        );

        //2 - Variante clon con aceitunas
        PedidoPizza muzzaAceitunas = prototipoMuzza.clonar();
        muzzaAceitunas.agregarIngrediente("aceitunas");

        // 3 - Variante con Jamón
        PedidoPizza muzzaJamon = prototipoMuzza.clonar();
        muzzaJamon.agregarIngrediente("jamón");

        //4 - Variante "Especial"
        PedidoPizzaEspecial prototipoEspecial = new PedidoPizzaEspecial(
                "mediana",
                "fina",
                List.of("muzarella", "salsa"),
                true
        );

        PedidoPizzaEspecial especialConRucula = prototipoEspecial.clonar();
        especialConRucula.agregarIngrediente("rúcula");


        //Resultados
        System.out.println("Prototipo Base: " + prototipoMuzza);
        System.out.println("Variante con aceitunas " + muzzaAceitunas);
        System.out.println("Variante con jamón " + muzzaJamon);
        System.out.println("Prototipo especial " + prototipoEspecial);
        System.out.println("Especial con rúcula " + especialConRucula);


    }
}