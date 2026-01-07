package com.todocodeacademy;

import java.util.ArrayList;
import java.util.List;

//3 Builder Concreto
public class BuilderConcretoCasa implements BuilderCasa{

    private Casa resultado;
    private List<String> extras = new ArrayList<>();

    @Override
    public void reiniciar() {
        this.resultado = new Casa();
        this.extras = new ArrayList<>();
    }

    @Override
    public void construirEstructura(String tipoEstructura) {
        resultado.setTipoEstructura(tipoEstructura);
    }

    @Override
    public void contruirPisos(int cantidad) {
        resultado.setPisos(cantidad);
    }

    @Override
    public void construirPiscina(boolean siONo) {
        resultado.setPiscina(siONo);
    }

    @Override
    public void construirGarage(boolean siONo) {
        resultado.setGarage(siONo);
    }

    @Override
    public void construirJardin(boolean siONo) {
        resultado.setJardin(siONo);
    }

    @Override
    public void agregarExtra(String extra) {
        this.extras.add(extra);
        resultado.setExtras(extras);
    }

    //Método típico de un Builder Concreto
    public Casa obtenerResultado() {
        return resultado;
    }
}
