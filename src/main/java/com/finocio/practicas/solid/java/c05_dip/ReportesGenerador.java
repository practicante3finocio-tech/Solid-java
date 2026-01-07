package com.finocio.practicas.solid.java.c05_dip;

public class ReportesGenerador {

    private final Generador generador;

    public ReportesGenerador(Generador generador) {
        this.generador = generador;

    }

    public void generar () {
        generador.exportar();
    }
}
