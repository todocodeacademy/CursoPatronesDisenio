package com.todocodeacademy;

public abstract class EnvioCreator {

    //Factory Method
    protected abstract Envio crearEnvio();

    //Lógica en común que van a tener todos los tipos de envío
    public void procesarEnvio() {
        Envio envio = crearEnvio(); //llamar a nuestro factory method
        envio.enviarPaquete();

    }
}
