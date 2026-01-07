package com.todocodeacademy;

public class BuilderDirector {

    private BuilderCasa builder;

    //constructor propio de la clase
    public BuilderDirector(BuilderCasa builder) {
        this.builder = builder;
    }

    //para cambiar de constructor
    public void cambiarBuilder(BuilderCasa builder) {
        this.builder = builder;
    }

    //Casa de material, 2 pisos, con garage (sin piscina con jardín)
    public void construirCasaDosPisosMaterial() {
        builder.reiniciar();
        builder.construirEstructura("Material");
        builder.contruirPisos(2);
        builder.construirPiscina(false);
        builder.construirGarage(true);
        builder.construirJardin(true);
        builder.agregarExtra("Balcón");
    }

    // Casa de material, 1 piso, con piscina, jardín y garage
    public void construirCasaConPiscina() {
        builder.reiniciar();
        builder.construirEstructura("Material");
        builder.contruirPisos(1);
        builder.construirPiscina(true);
        builder.construirGarage(true);
        builder.construirJardin(true);
        builder.agregarExtra("Deck alrededor de piscina");
    }

    // Casa madera simple con Jardín
    public void construirCasaMaderaSimple() {
        builder.reiniciar();
        builder.construirEstructura("Madera");
        builder.contruirPisos(1);
        builder.construirPiscina(false);
        builder.construirGarage(false);
        builder.construirJardin(true);
    }

}
