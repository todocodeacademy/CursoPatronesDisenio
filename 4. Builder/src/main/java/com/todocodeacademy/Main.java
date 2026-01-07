package com.todocodeacademy;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Builder Concreto
        BuilderConcretoCasa builder = new BuilderConcretoCasa();

        //Director (opcional)
        BuilderDirector director = new BuilderDirector(builder);

        //Creando los objetos
        //Casa de material, 2 pisos, con garage (sin piscina con jardín)
        director.construirCasaDosPisosMaterial();
        Casa casa1 = builder.obtenerResultado();
        System.out.println("Casa 1: " + casa1.toString());

        // Casa de material, 1 piso, con piscina, jardín y garage
        director.construirCasaConPiscina();
        Casa casa2 = builder.obtenerResultado();
        System.out.println("Casa 2: " + casa2.toString());

        // Casa madera simple con Jardín
        director.construirCasaMaderaSimple();
        Casa casa3 = builder.obtenerResultado();
        System.out.println("Casa 3: " + casa3.toString());

        //------------------------------------------------
        //El caso de no usar director
        builder.reiniciar();
        builder.construirEstructura("Material");
        builder.contruirPisos(5);
        builder.agregarExtra("Parrilla grande");

    }
}