package com.todocodeacademy;

public class EnvioCorreoCreator extends EnvioCreator{
    @Override
    protected Envio crearEnvio() {
        return new EnvioCorreo();
    }
}
