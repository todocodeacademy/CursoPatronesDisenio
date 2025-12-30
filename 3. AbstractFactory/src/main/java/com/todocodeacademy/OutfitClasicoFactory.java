package com.todocodeacademy;

public class OutfitClasicoFactory implements OutfitFactory{
    @Override
    public Jean crearJean() {
        return new JeanSkinny();
    }

    @Override
    public Remera crearRemera() {
        return new RemeraMangaCorta();
    }
}
