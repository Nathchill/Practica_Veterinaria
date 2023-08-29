package com.co.edu.udem.controlador;

import com.co.edu.udem.modelo.entidad.Gato;
import com.co.edu.udem.modelo.entidad.Perro;
import com.co.edu.udem.modelo.interfaces.Animal;

import java.util.ArrayList;
import java.util.List;

public class Controlador {

    public static void lista(){
        List<Animal> animales = new ArrayList<>();
        animales.add(new Gato(1, 5, "Felix", "Pablo"));
        animales.add(new Perro(2, 4, "Firulais", "Pedro"));
        System.out.printf(animales.toString());
    }

}
