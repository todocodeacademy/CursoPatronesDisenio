package com.todocodeacademy;

import java.util.ArrayList;
import java.util.List;

//2 - El prototipo Concreto
public class PedidoPizza implements PrototipoPizza<PedidoPizza>{

    private String tamanio;
    private String tipoMasa;
    private List<String> ingredientes;

    //Constructor normal (crear desde cero)
    public PedidoPizza(String tamanio, String tipoMasa, List<String> ingredientes) {
        this.tamanio = tamanio;
        this.tipoMasa = tipoMasa;
        this.ingredientes = new ArrayList<>(ingredientes); //mutable
    }

    //Constructor copia
    public PedidoPizza(PedidoPizza prototipo) {
        this.tamanio = prototipo.tamanio;
        this.tipoMasa = prototipo.tipoMasa;
        this.ingredientes = new ArrayList<>(prototipo.ingredientes);
    }

    @Override
    public PedidoPizza clonar() {
        return new PedidoPizza(this);
    }

    //un método para agregar los ingredientes
    public void agregarIngrediente (String ingrediente) {
       ingredientes.add(ingrediente);
    }

    @Override
    public String toString() {
        return "PedidoPizza{" +
                "tamanio='" + tamanio + '\'' +
                ", tipoMasa='" + tipoMasa + '\'' +
                ", ingredientes=" + ingredientes +
                '}';
    }
}
