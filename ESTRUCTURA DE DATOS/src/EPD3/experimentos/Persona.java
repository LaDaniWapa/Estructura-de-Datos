package EPD3.experimentos;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Persona implements IPersona {

    private String dni;
    private String nombre;
    private int edad;

    public Persona(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String getDni() {
        return dni;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    public boolean equals(Object o) {
        IPersona p1 = (Persona) o;
        return this.dni.equals(p1.getDni());
    }

    @Override
    public int hashCode() {
        return this.dni.hashCode();
    }

    public int compareTo(IPersona otraPersona) {
        return this.dni.compareTo(otraPersona.getDni());
    }

    public String toString() {
        return dni + " " + nombre + " (" + edad + ")";
    }
}
