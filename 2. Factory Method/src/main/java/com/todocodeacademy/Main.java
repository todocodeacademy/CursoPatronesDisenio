package com.todocodeacademy;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EnvioCreator envioCorreo = new EnvioCorreoCreator();
        envioCorreo.procesarEnvio();

        EnvioCreator envioMoto = new EnvioMotoCreator();
        envioMoto.procesarEnvio();

        EnvioCreator envioCamion = new EnvioCamionCreator();
        envioCamion.procesarEnvio();

    }
}