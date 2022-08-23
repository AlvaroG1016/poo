package com.repaso.poo;

public class Inicio {
    public static void main(String[] args) {
        //Se crea una instancia de la clase zapato
        Zapato miZapato = new Zapato();
        miZapato.setTalla(34);
        miZapato.setColor("Gris");
        miZapato.setMarca("ac");

        Zapato zapato2 = new Zapato();
        zapato2.setMarca("ads");
        zapato2.setColor("Negro");
        zapato2.setTalla(123);
        //System.out.println(miZapato.getMarca());
        //System.out.println(zapato2.getMarca());

        //Crear objetos del tipo estudiante
        Estudiante est1 = new Estudiante("perro", "puto");
        System.out.println(est1.nombresCompletos());
        System.out.println("Prueba de nueva");

    }


}
