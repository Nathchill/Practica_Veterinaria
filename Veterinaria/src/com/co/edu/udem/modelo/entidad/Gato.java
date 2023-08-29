package com.co.edu.udem.modelo.entidad;


import com.co.edu.udem.modelo.clases.Felino;

public class Gato extends Felino {
    private int id;
    private int edad;
    private String nombre;
    private String dueño;

    @Override
    public String toString() {
        return "gato{" +
                "id='" + id + '\'' +
                ", edad='" + edad + '\'' +
                ", nombre='" + nombre + '\'' +
                ", dueño='" + dueño + '\'' +
                '}';
    }

    public Gato(int id, int edad, String nombre, String dueño) {
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
