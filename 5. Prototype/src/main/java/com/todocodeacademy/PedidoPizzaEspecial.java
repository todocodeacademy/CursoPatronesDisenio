package com.todocodeacademy;

import java.util.List;

public class PedidoPizzaEspecial extends PedidoPizza{

    private boolean bordeRelleno;


    public PedidoPizzaEspecial(String tamanio, String tipoMasa,
                               List<String> ingredientes, boolean bordeRelleno) {
        super(tamanio, tipoMasa, ingredientes);
        this.bordeRelleno = bordeRelleno;
    }

    public PedidoPizzaEspecial(PedidoPizzaEspecial prototipo) {
        super(prototipo);
        this.bordeRelleno = bordeRelleno;
    }

    @Override
    public PedidoPizzaEspecial clonar() {
        return new PedidoPizzaEspecial(this);
    }

    @Override
    public String toString() {
        return "PedidoPizzaEspecial{" +
                "bordeRelleno=" + bordeRelleno +
                " , " + super.toString() +
                '}';
    }
}
