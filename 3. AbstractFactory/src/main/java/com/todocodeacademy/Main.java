package com.todocodeacademy;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Seleccionamos una familia de productos
        OutfitFactory factory = new OutfitEleganteFactory();

        //Cliente trabaja o va a interactuar SIN SABER las clases concretas
        TiendaRopa tienda = new TiendaRopa(factory);

        tienda.mostrarOutfit();


    }
}