package com.repaso.poo;

public class Estudiante extends Persona {
    //Siempre debe haber un constructor por defecto, cuando se tenga uno dist

    public Estudiante(String nombre, String apellido) {
        setNombre(nombre);
        setApellido(apellido);
    }


    public String nombresCompletos(){

        return getNombre() + " "+ getApellido();
    }

}
