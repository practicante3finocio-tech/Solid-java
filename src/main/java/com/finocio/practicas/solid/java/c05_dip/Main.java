package com.finocio.practicas.solid.java.c05_dip;

public class Main {
    public static void main(String[] args) {

        ReportesGenerador reportesGenerador = new ReportesGenerador(new CSVGenerador());
        ReportesGenerador reportesGenerador1 = new ReportesGenerador(new PDFGenerador());



    }
}
