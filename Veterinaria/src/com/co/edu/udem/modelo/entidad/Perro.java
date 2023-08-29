package com.co.edu.udem.modelo.entidad;

import com.co.edu.udem.modelo.clases.Canino;

public class Perro extends Canino {
    private int id;
    private int edad;
    private String nombre;
    private String dueño;

    @Override
    public String toString() {
        return "perro{" +
                "id=" + id +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", dueño='" + dueño + '\'' +
                '}';
    }

    public Perro(int id, int edad, String nombre, String dueño) {
        super();
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
        this.dueño = dueño;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDueño() {
        return dueño;
    }

    public void setDueño(String dueño) {
        this.dueño = dueño;
    }
    @Override
    public void mover(){

    }

}
