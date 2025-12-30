package com.todocodeacademy;

public class TiendaRopa {

    private OutfitFactory factory;

    public TiendaRopa(OutfitFactory factory) {
        this.factory=factory;
    }

    public void mostrarOutfit() {
        Jean jean = factory.crearJean();
        Remera remera = factory.crearRemera();

        jean.descripcion();
        remera.descripcion();
    }

}
