package com.todocodeacademy;

import java.util.ArrayList;
import java.util.List;

//1 Objeto a construir
public class Casa {
    private String tipoEstructura;
    private int pisos;
    private boolean piscina;
    private boolean garage;
    private boolean jardin;
    private List<String> extras = new ArrayList<>();


    //setters (para que el builder pueda armar la casa paso a paso)
    public void setTipoEstructura(String tipoEstructura) {
        this.tipoEstructura = tipoEstructura;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public void setPiscina(boolean piscina) {
        this.piscina = piscina;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    public void setExtras(List<String> extras) {
        this.extras = extras;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "tipoEstructura='" + tipoEstructura + '\'' +
                ", pisos=" + pisos +
                ", piscina=" + piscina +
                ", garage=" + garage +
                ", jardin=" + jardin +
                ", extras=" + extras +
                '}';
    }


}
