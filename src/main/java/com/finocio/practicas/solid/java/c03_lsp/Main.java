package com.finocio.practicas.solid.java.c03_lsp;

public class Main {

    // Solid

    // L - Principio de sustitucion de Liskov

    // Los objetos de una clase base deben poder ser reemplazados por objetos de subclases sin alterar el funcionamiento
    // correcto del programa.


    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();
        hacerSonidoDelAnimal(perro);
        hacerSonidoDelAnimal(gato);


    }

    public static void hacerSonidoDelAnimal(Animal animal) {
        animal.hacerSonido();
    }


}
